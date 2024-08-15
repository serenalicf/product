package online.shopping.system.product_service.service;

import online.shopping.system.product_service.entity.Product;
import online.shopping.system.product_service.exception.BusinessException;
import online.shopping.system.product_service.exception.constant.ErrorCode;
import online.shopping.system.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product getProduct(String productCode) throws BusinessException {
        try {

            return productRepository.findByProductCode(productCode).orElse(null);

        } catch (Exception ex) {
            throw new BusinessException(ErrorCode.SYSTEM_BUSY);
        }
    }
}
