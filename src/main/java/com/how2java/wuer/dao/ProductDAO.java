/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	

package com.how2java.wuer.dao;

import com.how2java.wuer.pojo.Category;
import com.how2java.wuer.pojo.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDAO extends JpaRepository<Product,Integer>{
	Page<Product> findByCategory(Category category, Pageable pageable);
	List<Product> findByCategoryOrderById(Category category);
	List<Product> findByNameLike(String keyword, Pageable pageable);

}

/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	
