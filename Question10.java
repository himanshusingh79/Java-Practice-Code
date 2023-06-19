package Collection.Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Question10 {

    static boolean isPrime(int number)
    {
        if(number <= 1)
            return false;
        for(int i = 2; i <= Math.sqrt(number);i++)
        {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    static int largestPrimeNumber(ArrayList<Integer> number)
    {
        int largestPrime = Integer.MIN_VALUE;
        for(int num : number){
            if(isPrime(num) && num > largestPrime){
                largestPrime = num;
            }
        }
        return largestPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        int input;
        System.out.println("Enter the numbers you want to add : Enter -1 to stop taking input");
        while((input = sc.nextInt()) != -1)
        {
            number.add(input);
        }

        System.out.println("The Largest prime number is : "+largestPrimeNumber(number));
        sc.close();
    }
    
}
