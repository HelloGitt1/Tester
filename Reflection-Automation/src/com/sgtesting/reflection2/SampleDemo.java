package com.sgtesting.reflection2;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Method m[]=obj.getClass().getMethods();
			for(int i=0;i<m.length;i++)
			{
				String name=m[i].getName();
				if(name.startsWith("display"))
				{
					m[i].invoke(obj);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
