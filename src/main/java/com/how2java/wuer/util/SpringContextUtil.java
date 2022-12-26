/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	

package com.how2java.wuer.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextUtil implements ApplicationContextAware {
	
	private SpringContextUtil() {
		
	}
	
    private static ApplicationContext applicationContext;
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext){
        SpringContextUtil.applicationContext = applicationContext;
    }
    
    public static <T> T getBean(Class<T> clazz) {
    	return applicationContext.getBean(clazz);
    }

}

/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	
