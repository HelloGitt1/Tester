package com.sgtesting.reflection7;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Class strparam[]=new Class[1];
			strparam[0]=String.class;
			
			Method m1=obj.getClass().getMethod("showFN", strparam);
			m1.invoke(obj, new String("Santosh"));
			
			Class strparam1[]=new Class[2];
			strparam1[0]=String.class;
			strparam1[1]=String.class;
			
			Method m2=obj.getClass().getMethod("displayDetails", strparam1);
			m2.invoke(obj, new String("Santosh"),new String("Gudi"));
			
			
			Class intparam[]=new Class[1];
			intparam[0]=Integer.TYPE;
			
			Method m3=obj.getClass().getMethod("showAge", intparam);
			m3.invoke(obj, 19);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
