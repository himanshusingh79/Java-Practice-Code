package Codes;

import java.util.Scanner;

public class Basic {

	static int fibonacci(int n){
        int a=0;
        int b =1;
        int c = 0;
        int sum = 0;
        int d = 0;
        for(int i =2;i<n;i++){
            c = a+b;
            a = b;
            b = c;
        d = fact(c);
        sum =sum + d;
        }
        
        return (sum+2);
    }

    static int fact(int c){
        int fact = 1;
        if(c == 0 || c ==1){
            fact = 1;
        }
        else{
            for(int i = 2;i<=c;i++){
            fact = fact*i;
            }
        }
    
        return fact;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(",");
        
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        
        int a = fibonacci(n);
        int b = fibonacci(m);
        int res = a*b;
        System.out.println(res);
        
    }

}
