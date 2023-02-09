package com.preety.oop;

public class Two {

	public static void main(String[] args) {
    String[]str= {"Welcome", "Java","Programme"};
    String result= concat(str);
    System.out.println(result);
	}
private static String concat(String[]str) {
	String result="";
	if(str !=null)
	{
		for(int i=0;i<str.length;i++)
		{
			result += str[i];
		}
	}
	return result;
}
}
