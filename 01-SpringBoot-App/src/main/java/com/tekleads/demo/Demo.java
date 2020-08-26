package com.tekleads.demo;

import java.lang.reflect.Field;

public class Demo {

	public static void main(String[] args) throws Exception {
		Class<?> clz = Class.forName("com.tekleads.demo.App");
		Field field = clz.getDeclaredField("marks");
		field.setAccessible(true);

		Object clzObj = clz.newInstance();
		field.set(clzObj, 95);
		System.out.println("Value stored to variable ");
		System.out.println("Value of variable ::" + field.get(clzObj));
	}
}
