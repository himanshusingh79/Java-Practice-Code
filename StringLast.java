import java.util.Scanner;

class StringLast {
    public void lastWord(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any sentence : ");
        String sent = sc.nextLine();
        String[] input = sent.split(" ");
        String output = input[input.length - 1];
        System.out.println("The last word is : "+output);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringLast hw = new StringLast();
        int n;
        do{
        hw.lastWord();
        System.out.println("\nEnter \n1--->Continue\n2--->Exit");
        n = sc.nextInt();
        }while(n==1);
    }
}