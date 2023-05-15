import java.util.Scanner;

class PallindromeString {
    
    public boolean isPallindrome(String name){
        boolean result = true;
        String input = name.toLowerCase();
        char[] input2 = input.toCharArray();
        for(int i =0;i < input2.length;i++){
            if(input2[i] != input2[input2.length - 1 -i]){
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HelloWorld hw = new HelloWorld();
        int n;
        do{
        System.out.println("Enter the string\n");
        String name = sc.next();
        boolean output = hw.isPallindrome(name);
        System.out.println(output);
        System.out.println("Enter \n1---> To Check Again\n2--->To Exit\n");
        n = sc.nextInt();
        }while(n==1);
    }
}