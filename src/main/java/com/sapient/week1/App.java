package com.sapient.week1;


import java.util.*;
import java.io.*;


public class App 
{

	public static boolean checkEven(int a)
	{
		if(a%2 == 0)
			return true;
		return false;
	}

    public static void main( String[] args )
    {
        

		System.out.println(" Enter the number. Calling checkEven Method");

		Scanner s = new Scanner(System.in);
		int input = s.nextInt();

		if(checkEven(input))
			System.out.println(" Even");
		else
			System.out.println(" Odd");	
	}
}