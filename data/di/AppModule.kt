package com.aistudio.dieselstationsms.kxmpzq.di

import android.content.Context
import com.aistudio.dieselstationsms.kxmpzq.data.repository.StationRepository
import com.aistudio.dieselstationsms.kxmpzq.data.repository.StationRepositoryImpl

object AppModule {
    @Volatile
    private var repositoryInstance: StationRepository? = null

    fun provideStationRepository(context: Context): StationRepository {
        return repositoryInstance ?: synchronized(this) {
            repositoryInstance ?: StationRepositoryImpl(context.applicationContext).also {
                repositoryInstance = it
            }
        }
    }

    fun clearRepository() {
        repositoryInstance = null
    }
}
