package programs;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int number = sc.nextInt();
		int temp = number;
		int rem,rev=0;
		while(temp>0) {
			rem = temp%10;
			rev = (rev*10)+rem;
			temp= temp/10;
		}
		if(rev==number) {
			System.out.println("Number is palindrom");
		}else
		System.out.println("Number is not Palindrom");
	}
}
