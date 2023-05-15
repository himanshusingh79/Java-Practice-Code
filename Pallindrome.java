import java.util.Scanner;

class Pallindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Check for Pallindrome");
		int number = sc.nextInt();
		int temp = number;
		while(temp != 0){
			num = temp % 10;
			reverse = (reverse * 10) + num;
			
			temp = temp/10;
		}
		if(reverse == number){
			System.out.println("Pallindrome Number");
		}
		else
			System.out.println("Not a Pallindrome Number");
	}
}