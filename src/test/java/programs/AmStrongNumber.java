package programs;

import java.util.Scanner;

public class AmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int numLen = sc.nextInt();
		int num = numLen;
		int temp = numLen;
		
		int len=0; 
		
		while(temp !=0) {
			temp =temp/10;
			len++;
		}
	
		int finalnumber=0;
		
		while(num !=0) {
		int	rem = num %10;
		int rev =1;
			for(int i=1; i<=len; i++) {
				
				rev = rev*rem;
			}
			num = num/10;
			finalnumber = finalnumber + rev;
		}
		if (numLen==finalnumber) {
			System.out.println("Number is ArmStrong");
		}else {
			System.out.println("Number is not a Armstong");
		}
	}

}
