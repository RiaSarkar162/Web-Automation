package java_basic;

import java.util.Scanner;

public class Basic_if_else {

	public static void main(String[] args) {
		 Scanner scanner= new Scanner(System.in);
		 System.out.println("Enter First Number");
		 int number1 = scanner.nextInt();
		 
		 System.out.println("Enter Second number");
		 int number2 = scanner.nextInt();
		 
		 int sum = number1+number2;
		 if(sum%2==0 && sum>=0) {
			 System.out.println("The result is even and " + "Result is positive ");
		 }
		 
		 else if(sum% 2!=0 && sum >= 0) {
			 System.out.println("The result is odd and " + "Result is positive");
		 }
		 
		 else if(sum%2 ==0 && sum<=0) {
			 System.out.println("The result is even and " + "Result is negative ");
		 }
		 else {
			 System.out.println("The result is odd and " + "Result is negative ");
		 }
	}

}
 