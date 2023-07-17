package Codes;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			//int t = n;
			int r;
			int d=0;
			
			while(n!=0) {
				r=n%10;
				n=n/10;
				d=d*10+r;
			}
			System.out.println(d);
			sc.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
