package com.sgtesting.reflection5;

public class StringBuilderDemo {

	public static void appendString()
	{
		StringBuilder s1=new StringBuilder("Java");
		System.out.println("Append Result :"+s1.append(" Programming"));
		System.out.println("++++++++++++++++++++++++++++");
	}
	
	public static void insertString()
	{
		StringBuilder s1=new StringBuilder("it is a palace");
		StringBuilder s2=s1.insert(8, "new ");
		System.out.println("Insert Result :"+s2);
		System.out.println("++++++++++++++++++++++++++++");
	}

	public static void deleteString()
	{
		StringBuilder s1=new StringBuilder("it is a new palace");
		StringBuilder s2=s1.delete(8, 12);
		System.out.println("Delete Result :"+s2);
		System.out.println("++++++++++++++++++++++++++++");
	}
	
	public static void reverseString()
	{
		StringBuilder s1=new StringBuilder("Programming");
		System.out.println("Reverse Result :"+s1.reverse());
		System.out.println("++++++++++++++++++++++++++++");
	}

}
