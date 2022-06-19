package com.sgtesting.reflection3;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Method m[]=obj.getClass().getDeclaredMethods();
			for(int i=0;i<m.length;i++)
			{
				String name=m[i].getName();
				System.out.println(name);
				m[i].invoke(obj);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
