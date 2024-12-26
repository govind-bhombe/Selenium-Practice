package Selenium.Prac;

import java.util.Scanner;

public class swap2No {
	
	public static void main(String[] args) {
		 System.out.println("enter value of x and y");
	     Scanner sc= new Scanner(System.in);
	     int x=sc.nextInt();
	     int y=sc.nextInt();
	     System.out.println("before saping:"+x+" & "+y);
	     x=x+y;
	     y=x-y;
	     x=x-y;
	     
	     System.out.println("After swapping"+x+" & "+y);
		
	}
	

}
