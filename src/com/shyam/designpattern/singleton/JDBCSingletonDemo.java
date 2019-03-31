package com.shyam.designpattern.singleton;

import com.shyam.designpattern.singleton.JDBCSingleton;
public class JDBCSingletonDemo {
	
	
	public static void main(String args[]) {
		
		JDBCSingleton jdbcSingleton = JDBCSingleton.getInstance();
		
		try {
		jdbcSingleton.insert("Rajeev", "Srivastva");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
