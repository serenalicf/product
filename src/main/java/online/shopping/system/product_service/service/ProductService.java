package online.shopping.system.product_service.service;

import online.shopping.system.product_service.entity.Product;
import online.shopping.system.product_service.exception.BusinessException;

public interface ProductService {

    Product getProduct(String productCode) throws BusinessException;

}
