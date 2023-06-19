package Collection.Lists;

import java.util.ArrayList;
import java.util.Collections;

public class Question9 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(8);
        number.add(9);
        number.add(5);
        number.add(4);

        Collections.shuffle(number);
        System.out.println("The shuffled Arraylist is as :");
        for(Integer num : number)
        {
            System.out.println(num);
        }
    }
    
}
