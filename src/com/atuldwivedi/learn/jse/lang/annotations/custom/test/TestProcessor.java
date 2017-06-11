package com.atuldwivedi.learn.jse.lang.annotations.custom.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestProcessor {
public static void main(String[] args) {
		
		try {
			@SuppressWarnings("unchecked")
			Class<MyTest> cls = (Class<MyTest>) Class.forName("com.atuldwivedi.learn.jse.lang.annotations.custom.test.Test");
			Method[] methods = cls.getDeclaredMethods();
			for (int i = 0; i < methods.length; i++) {
				System.out.println("Looking into method: "+methods[i].getName());
				if(methods[i].isAnnotationPresent(Test.class)){
					System.out.println("Annotation is present.");
					Annotation ann = methods[i].getAnnotation(Test.class);
					Test test = (Test) ann;
					if(test.enabled()){
						System.out.println("Method is enabled.");
						methods[i].invoke(cls.newInstance());
					}
					else{
						System.out.println("Method is disabled.");
					}
				}
				else{
					System.out.println("Annotation is not present.");
				}
				System.out.println("---------------------------");
			}
			
		} catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
			e.printStackTrace();
		}
		
	}
}
