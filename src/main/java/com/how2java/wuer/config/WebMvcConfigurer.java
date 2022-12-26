/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	

package com.how2java.wuer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.how2java.wuer.interceptor.LoginInterceptor;
import com.how2java.wuer.interceptor.OtherInterceptor;

@Configuration
class WebMvcConfigurer extends WebMvcConfigurerAdapter{

	@Bean
	public OtherInterceptor getOtherIntercepter() {
		return new OtherInterceptor();
	}
	@Bean
	public LoginInterceptor getLoginIntercepter() {
		return new LoginInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry){
		registry.addInterceptor(getOtherIntercepter())
				.addPathPatterns("/**");
		registry.addInterceptor(getLoginIntercepter())
				.addPathPatterns("/**");
	}
}


/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	
