package Collection.Lists;

import java.util.Collections;
import java.util.LinkedList;

// ques 4
public class SortedLinkedList {

    static void mergeLinkedList(LinkedList<Integer> numbers, LinkedList<Integer> numbers1)
    {
        numbers.addAll(numbers1);
        Collections.sort(numbers);
        for(Integer num : numbers)
        {
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(5);

        LinkedList<Integer> numbers1 = new LinkedList<Integer>();
        numbers1.add(12);
        numbers1.add(13);
        numbers1.add(17);
        numbers1.add(19);
        numbers1.add(15);

        mergeLinkedList(numbers, numbers1);
    }
}
