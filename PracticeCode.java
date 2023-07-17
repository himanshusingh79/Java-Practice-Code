package Codes;

import java.util.Scanner;
public class PracticeCode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The first number");
		int num1 = sc.nextInt();
		System.out.println("Enter The second number");
		int num2 = sc.nextInt();
		System.out.println("Sum : "+(num1 + num2));
		System.out.println("Difference : "+(num1 - num2));
		System.out.println("Product : "+(num1 * num2));
		System.out.println("Divison : "+(num1 / num2));
		sc.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
