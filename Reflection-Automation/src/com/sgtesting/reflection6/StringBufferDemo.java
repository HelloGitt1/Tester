package com.sgtesting.reflection6;

public class StringBufferDemo {
	
	public static void appendString()
	{
		StringBuffer s1=new StringBuffer("Java");
		System.out.println("Append Result :"+s1.append(" Programming"));
		System.out.println("++++++++++++++++++++++++++++");
	}
	
	public static void insertString()
	{
		StringBuffer s1=new StringBuffer("it is a palace");
		StringBuffer s2=s1.insert(8, "new ");
		System.out.println("Insert Result :"+s2);
		System.out.println("++++++++++++++++++++++++++++");
	}

	public static void deleteString()
	{
		StringBuffer s1=new StringBuffer("it is a new palace");
		StringBuffer s2=s1.delete(8, 12);
		System.out.println("Delete Result :"+s2);
		System.out.println("++++++++++++++++++++++++++++");
	}
	
	public static void reverseString()
	{
		StringBuffer s1=new StringBuffer("Programming");
		System.out.println("Reverse Result :"+s1.reverse());
		System.out.println("++++++++++++++++++++++++++++");
	}
}
