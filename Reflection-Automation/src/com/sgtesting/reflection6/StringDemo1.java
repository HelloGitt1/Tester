package com.sgtesting.reflection6;

public class StringDemo1 {
	
	public static void getLength()
	{
		String s1="Programming";
		int count=s1.length();
		System.out.println("# of Chars :"+count);
		System.out.println("+++++++++++++++++++++++++");
	}
	
	public static void verifyEmptyStr()
	{
		String s1=new String();
		System.out.println("Is this String Empty ?:"+s1.isEmpty());
		System.out.println("+++++++++++++++++++++++++");
	}
	
	public static void lowercase()
	{
		String s1=new String("PROGRAM");
		System.out.println("Lower Case :"+s1.toLowerCase());
		System.out.println("+++++++++++++++++++++++++");
	}
	
	public static void uppercase()
	{
		String s1=new String("programming");
		System.out.println("Upper Case :"+s1.toUpperCase());
		System.out.println("+++++++++++++++++++++++++");
	}
	
	public static void extractStr()
	{
		String s1=new String("programming");
		System.out.println(" First Approach :"+s1.substring(3));
		System.out.println(" Second Approach :"+s1.substring(3,7));
		System.out.println("+++++++++++++++++++++++++");
	}
	
	public static void replaceDemo()
	{
		String s1=new String("It is an old City");
		System.out.println("Replace Result :"+s1.replace("is", "was"));
		System.out.println("+++++++++++++++++++++++++");
	}
	
	public static void compareString1()
	{
		String s1="Program";
		String s2="PROGRAM";
		System.out.println("s1 and s2 are equal :"+s1.equals(s2));
		System.out.println("s1 and s2 are equal ignore case :"+s1.equalsIgnoreCase(s2));
		System.out.println("+++++++++++++++++++++++++");
	}
	
	public static void compareString2()
	{
		String s1="Program";
		String s2="PROGRAM";
		System.out.println("s1 and s2 are equal :"+s1.compareTo(s2));
		System.out.println("s1 and s2 are equal ignore case :"+s1.compareToIgnoreCase(s2));
		System.out.println("+++++++++++++++++++++++++");
	}
	
	public static void existanceOfString()
	{
		String s1="Java Programming Language";
		System.out.println("Starts With :"+s1.startsWith("Java"));
		System.out.println("Ends With :"+s1.endsWith("age"));
		System.out.println("Contains :"+s1.contains("gram"));
		System.out.println("+++++++++++++++++++++++++");
	}
	
	public static void trimStr()
	{
		String s1="       Java          ";
		System.out.println("Before Trim the # of Chars :"+s1.length());
		System.out.println("After Trim the # of Chars :"+s1.trim().length());
		System.out.println("+++++++++++++++++++++++++");
	}
	
	public static void splitStr()
	{
		String s1="Apple,Mango,Orange,Banana,Grapes";
		String s[]=s1.split(",");
		for (String kk : s)
		{
			System.out.println("  "+kk);
		}
		System.out.println("+++++++++++++++++++++++++");
	}
	
	public static void convertCharArray()
	{
		String s1="Program";
		char ch[]=s1.toCharArray();
		for (char ch1 :ch)
		{
			System.out.println("  "+ch1);
		}
		System.out.println("+++++++++++++++++++++++++");
	}
	
	public static void valueOfStr()
	{
		int a=125;
		String s1=String.valueOf(a);
		double d=12.75;
		String s2=String.valueOf(d);
		System.out.println(s1+"     "+s2);
		System.out.println("+++++++++++++++++++++++++");
	}
}


