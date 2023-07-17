package Codes;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			a = a+b;
			b = a-b;
			a = a-b;
			System.out.println("After Swapping : "+a+" "+b);
			sc.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
