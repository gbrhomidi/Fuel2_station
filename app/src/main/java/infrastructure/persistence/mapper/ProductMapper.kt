package infrastructure.persistence.mapper

import infrastructure.persistence.entity.ProductEntity
import domain.model.Product


/**
 * Product Persistence Mapper.
 *
 * Converts:
 *
 * Room Entity  <-> Domain Model
 *
 * No business logic.
 * No validation.
 * No calculations.
 *
 * Only data transformation.
 */
object ProductMapper {


    fun ProductEntity.toDomain(): Product {

        return Product(
            uuid = uuid,
            name = product_name,
            barcode = barcode
        )
    }



    fun Product.toEntity(): ProductEntity {

        return ProductEntity(
            uuid = uuid,
            product_name = name,
            barcode = barcode
        )
    }
}
