package Codes;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc = new Scanner(System.in);
			int units = sc.nextInt();
			int bill = 0;
			int fixedCharge = 50;
			if(units>0 && units<=50) {
				bill = fixedCharge +(units * 2); 
			}
			else if(units > 50 && units <= 100) {
				bill = fixedCharge +(units * 2) + (units * 3);
			}
			else if(units > 100 && units <= 200) {
				bill = fixedCharge +(units * 2) + (units * 3) + (units * 5);
			}
			else if(units>200 && units <=300) {
				bill = fixedCharge +(units * 2) + (units * 3) + (units * 5) + (units * 6);
			}
			else
			{
				bill = fixedCharge +(units * 2) + (units * 3) + (units * 5) + (units * 6) + (units * 10);
			}
			
			System.out.println("Bill is : "+bill);
			
			
			sc.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
