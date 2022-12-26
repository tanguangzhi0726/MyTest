/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	

package com.how2java.wuer.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import com.how2java.wuer.pojo.User;
import com.how2java.wuer.service.UserService;

public class JPARealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

		SimpleAuthorizationInfo s = new SimpleAuthorizationInfo();
		return s;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName = token.getPrincipal().toString();
		User user = userService.getByName(userName);
		String passwordInDB = user.getPassword();
		String salt = user.getSalt();
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(userName, passwordInDB, ByteSource.Util.bytes(salt),
				getName());
		return authenticationInfo;
	}

}

/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	
