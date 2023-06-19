package Collection.Lists;

import java.util.TreeMap;

public class TreeSetInput {

    static String getKeyValue(TreeMap<String,String> fruits){
        StringBuilder sb = new StringBuilder();
        for(String key : fruits.keySet())
        {
            sb.append(key+ " = "+fruits.get(key)+ " \n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
     TreeMap<String, String> fruits = new TreeMap<String, String>();
     fruits.put("A", "Apple");
     fruits.put("B", "Banana");
     fruits.put("C", "Pears");
     fruits.put("D", "Mango");
     System.out.println(getKeyValue(fruits));   
    }
    
}
