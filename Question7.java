package Collection.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question7 {
    static void findMedian(ArrayList<Integer> number)
    {
        if(number.size() % 2 == 0){
            int median = number.size()/2;
            System.out.println("The Median Value is : " + number.get(median-1));
        }
        else{
            int median = Math.round(number.size()/2);
            System.out.println("The Median Value is : " +number.get(median-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<Integer>();
        // number.add(8);
        // number.add(7);
        // number.add(4);
        // number.add(1);
        // number.add(2);
        int input;
        System.out.println("Enter the value you want to enter, and enter -1 to stop");
        while((input = sc.nextInt()) != -1)
        {
            number.add(input);
        }
        
        Collections.sort(number);
        findMedian(number);


    }
    
}
