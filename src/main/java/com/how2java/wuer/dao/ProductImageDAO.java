/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	

package com.how2java.wuer.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.how2java.wuer.pojo.Product;
import com.how2java.wuer.pojo.ProductImage;

public interface ProductImageDAO extends JpaRepository<ProductImage,Integer>{
	public List<ProductImage> findByProductAndTypeOrderByIdDesc(Product product, String type);
	
}

/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	
