package Collection.Lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCheck {
    static boolean isSorted(ArrayList<Integer> array)
    {
        for(int i=0;i<array.size()-1;i++)
        {
            if(array.get(i) > array.get(i+1))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(5);
        array.add(2);
        array.add(7);
        array.add(3);

        Collections.sort(array);
        System.out.println(isSorted(array));
    }
    
}
