package Codes;

import java.util.Scanner;
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			//System.out.println("Quotient : " +(double) num1/num2);
			if(num1>num2) {
				System.out.println("Largest is : "+num1);
			}
			else {
				System.out.println("Largest is : "+num2);
			}
			sc.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
