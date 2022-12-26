/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	

package com.how2java.wuer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.how2java.wuer.pojo.User;

public interface UserDAO extends JpaRepository<User,Integer>{

    User findByName(String name);

    User getByNameAndPassword(String name, String password);

}

/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	
