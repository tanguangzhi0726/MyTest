/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	

package com.how2java.wuer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.how2java.wuer.pojo.Order;
import com.how2java.wuer.pojo.OrderItem;
import com.how2java.wuer.pojo.Product;
import com.how2java.wuer.pojo.User;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
	List<OrderItem> findByOrderOrderByIdDesc(Order order);
	List<OrderItem> findByProduct(Product product);
	List<OrderItem> findByUserAndOrderIsNull(User user);
}

/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	
