package Codes;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int num3 = sc.nextInt();
			/*
			 * if(num1>num2) { System.out.println("Largest is : "+num1); } else {
			 * System.out.println("Largest is : "+num2); }
			 */

			System.out.println((num1 > num2)&&(num2>num3) ? num1 + " is the biggest" : num2 + " is the biggest");
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
