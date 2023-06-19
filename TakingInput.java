package Collection.Lists;
// taking input from the user
import java.util.ArrayList;
import java.util.Scanner;
public class TakingInput {

    static ArrayList<Integer> addElements()
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.println("Enter the numbers you want to add : Enter -1 to stop taking input");
        while((input = sc.nextInt()) != -1)
        {
            numbers.add(input);
        }
        sc.close();
        return numbers;
    }
    public static void main(String[] args) {
        //ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println(addElements());        
    }
}
