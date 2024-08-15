package online.shopping.system.product_service.controller;

import online.shopping.system.product_service.dto.ProductDto;
import online.shopping.system.product_service.entity.Product;
import online.shopping.system.product_service.exception.BusinessException;
import online.shopping.system.product_service.mapper.ProductMapper;
import online.shopping.system.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/products/{productCode}")
    public ProductDto getProduct(@Validated @PathVariable("productCode") String productCode) throws BusinessException {

        Product product = productService.getProduct(productCode);
        return ProductMapper.INSTANCE.productToProductDto(product);

    }
}
