package online.shopping.system.product_service.mapper;

import online.shopping.system.product_service.dto.ProductDto;
import online.shopping.system.product_service.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    ProductDto productToProductDto(Product product);

}
