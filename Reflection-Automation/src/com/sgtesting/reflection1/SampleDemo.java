package com.sgtesting.reflection1;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Method m[]=obj.getClass().getMethods();
			for(int i=0;i<m.length;i++)
			{
				System.out.println(m[i].getName());
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
