package Collection.Lists;

import java.util.HashSet;
//ques 5
public class HashsetNull {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(8);
        numbers.add(6);
        numbers.add(4);
        numbers.add(7);
        numbers.add(null);

        HashSet<Integer> numbers1 = new HashSet<Integer>();
        numbers1.add(8);
        numbers1.add(6);
        numbers1.add(4);
        numbers1.add(7);

        boolean result = numbers.contains(null);
        boolean result1 = numbers1.contains(null);

        System.out.println("Null Value for first hashset is : " +result);
        System.out.println("Null Value for second hashset is : " +result1);
    }
    
}
