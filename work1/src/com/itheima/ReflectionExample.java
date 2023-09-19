package com.itheima;

import java.lang.reflect.Constructor;  
import java.lang.reflect.Field;  
import java.lang.reflect.InvocationTargetException;  
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {  
        MyClass obj = new MyClass("Hello", 42);

        // 获取类的构造方法并创建对象  
        Constructor<MyClass> constructor = null;
		try {
			constructor = MyClass.class.getConstructor(String.class, int.class);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        MyClass newObj = null;
		try {
			newObj = (MyClass) constructor.newInstance("World", 24);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // 获取类的字段并设置值  
        Field field = null;
		try {
			field = MyClass.class.getDeclaredField("name");
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        field.setAccessible(true);  
        try {
			field.set(newObj, "Reflection");
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // 获取类的方法并调用  
        Method method = null;
		try {
			method = MyClass.class.getMethod("show");
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        try {
			method.invoke(newObj);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        // 获取类的属性并获取值  
        try {
			field = MyClass.class.getDeclaredField("age");
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        field.setAccessible(true);  
        int age = 0;
		try {
			age = field.getInt(newObj);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
    }
}