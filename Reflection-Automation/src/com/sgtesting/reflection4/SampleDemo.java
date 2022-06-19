package com.sgtesting.reflection4;

public class SampleDemo {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.sgtesting.reflection4.Sample");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
