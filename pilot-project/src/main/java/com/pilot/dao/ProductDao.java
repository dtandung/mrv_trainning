/**
 * 
 */
package com.pilot.dao;


import java.util.List;
import java.util.Map;
import org.springframework.data.jpa.domain.Specification;
import com.pilot.entity.BrandEntity;
import com.pilot.entity.ProductEntity;

/**
 * @author Admin
 * @Since 13 thg 4, 2023
 * 
 */
public interface ProductDao {
  
  ProductEntity findByProductId(Long productId);
  
  List<ProductEntity> getProductNameByBrandId(Long brandId);
  
  ProductEntity findByProductName(String productName);
  
  ProductEntity findByProductNameAndProductIdNot(String productName, Long productId);
  
  Specification<ProductEntity> getSearchCriteria(Map<String, Object> searchConditionsMap) ;
  
  
}
