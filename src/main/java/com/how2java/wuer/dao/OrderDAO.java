/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	

package com.how2java.wuer.dao;
 
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.how2java.wuer.pojo.Order;
import com.how2java.wuer.pojo.User;

public interface OrderDAO extends JpaRepository<Order,Integer>{
    public List<Order> findByUserAndStatusNotOrderByIdDesc(User user, String status);
}

/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	
