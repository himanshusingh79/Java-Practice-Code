import java.util.*;

class AnagramChecker {
    public void isAnagram(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter any first sentence : ");
        String sent1 = sc1.nextLine();
        System.out.println("Enter the second sentence : ");
        String sent2 = sc1.nextLine();
        int len1 = sent1.length();
        int len2 = sent2.length();
        if(len1 == len2){
            String in1 = sent1.toLowerCase();
            String in2 = sent2.toLowerCase();
            char[] arr1 = in1.toCharArray();
            char[] arr2 = in2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            String str1 = new String(arr1);
            String str2 = new String(arr2);
            if(str1.equals(str2)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnagramChecker hw = new AnagramChecker();
        int n;
        do{
        hw.isAnagram();
        System.out.println("\nEnter \n1--->Continue\n2--->Exit");
        n = sc.nextInt();
        }while(n==1);
    }
}