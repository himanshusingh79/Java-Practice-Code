package Codes;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int a =  sc.nextInt();
			int b = sc.nextInt();
			
			int temp = a;
			a = b;
			b = temp;
			
			System.out.println("After swapping : "+a+" "+b);
			sc.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
