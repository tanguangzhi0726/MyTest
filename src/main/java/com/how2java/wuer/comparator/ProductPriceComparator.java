/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	

package com.how2java.wuer.comparator;


import java.util.Comparator;

import com.how2java.wuer.pojo.Product;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return (int) (p1.getPromotePrice()-p2.getPromotePrice());
	}

}

/**
* 大连交通大学-谭广志-1818120115
* 外国语学院
* 版权所有
*/	
