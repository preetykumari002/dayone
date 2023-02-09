package com.preety.oop;
import java.util.Scanner;
public class four {

	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)){
		System.out.println("Enter a String");
		String str=sc.nextLine();
		char[]inp=str.toCharArray();
		System.out.println("Dublicate Characters:");
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if (inp[i]==inp[i])
				{
					System.out.println(inp[j]);
				}
			}
		}
	}

	}

}
