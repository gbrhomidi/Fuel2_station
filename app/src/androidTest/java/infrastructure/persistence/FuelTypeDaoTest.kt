package infrastructure.persistence

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import infrastructure.persistence.dao.FuelTypeDao
import infrastructure.persistence.dao.UserDao
import infrastructure.persistence.entities.FuelTypeEntity
import infrastructure.persistence.entities.UserEntity
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class FuelTypeDaoTest {

    private lateinit var db: AppDatabase
    private lateinit var fuelTypeDao: FuelTypeDao
    private lateinit var userDao: UserDao

    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context, AppDatabase::class.java)
            .allowMainThreadQueries()
            .build()
        fuelTypeDao = db.fuelTypeDao()
        userDao = db.userDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun writeFuelTypeAndReadInList() = runBlocking {
        // إنشاء مستخدم أولاً لتفادي استثناء قيود المفاتيح الأجنبية (FK Constraint)
        val user = UserEntity(username = "admin")
        val userId = userDao.insert(user)

        val fuelType = FuelTypeEntity(
            uuid = "f8c3de3d-1fea-4d7c-a8b0-29f63c4c3454",
            fuelCode = "DSL",
            fuelName = "Diesel",
            fuelNameAr = "ديزل",
            createdBy = userId,
            temperatureStandard = 15.0,
            taxRate = 0.0,
            vatRate = 0.0,
            isActive = 1,
            isDeleted = 0
        )
        
        val id = fuelTypeDao.insert(fuelType)
        assertNotNull(id)

        val retrieved = fuelTypeDao.findById(id)
        assertNotNull(retrieved)
        assertEquals("Diesel", retrieved?.fuelName)
        assertEquals("DSL", retrieved?.fuelCode)
        assertEquals(userId, retrieved?.createdBy)
    }

    @Test
    @Throws(Exception::class)
    fun testSoftDelete() = runBlocking {
        val user = UserEntity(username = "admin")
        val userId = userDao.insert(user)

        val fuelType = FuelTypeEntity(
            uuid = "a1b2c3d4-e5f6-7a8b-9c0d-e1f2a3b4c5d6",
            fuelCode = "OCT95",
            fuelName = "Octane 95",
            fuelNameAr = "بنزين 95",
            createdBy = userId
        )
        val id = fuelTypeDao.insert(fuelType)

        val insertedFuel = fuelTypeDao.findById(id)
        assertNotNull(insertedFuel)
        
        // إجراء حذف منطقي (Soft Delete) عن طريق تحديث العلم المخصص
        val deletedFuel = insertedFuel!!.copy(isDeleted = 1)
        fuelTypeDao.update(deletedFuel)

        // يجب أن ترجع null لأن الاستعلام المكتوب يستبعد السجلات المحذوفة منطقياً
        val searchDeleted = fuelTypeDao.findById(id)
        assertNull(searchDeleted)
    }
}
