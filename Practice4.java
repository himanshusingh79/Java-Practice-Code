package Codes;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			System.out.println("Incremented Value : "+(++num1));
			System.out.println("Decremented Value : "+(--num1));
			sc.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
