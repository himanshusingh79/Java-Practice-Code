import java.util.*;

class Game {

    public void checkProbability() {

        Scanner sc = new Scanner(System.in);

        int n;

        double count = 0;

        do {

            for (int i = 0; i < 4; i++) {

                System.out.println("Enter" + (i + 1) + " Number :");

                int num1 = sc.nextInt();

                int num2 = (int) (Math.random() * 10);

                if (num1 == num2) {

                    count++;

                }
            }
            System.out.println("Your Matching Probability is : " + ((count / 4) * 100) + "%");

            System.out.println("Enter\n1----> Continue\n0-----> Exit");

            n = sc.nextInt();

        } while (n == 1);

    }

    public void playGame() {

        Scanner sc3 = new Scanner(System.in);
        int c;
        do {
            Random rm = new Random();
            System.out.println("Choose\n1----> Rock\n2----> Paper\n3----> Scissors");
            System.out.println("Enter Your Number");
            int a = sc3.nextInt();
            int b = rm.nextInt(3) + 1;
            System.out.println("Number choosed by the computer :" + b);

            if (a == b) {
                System.out.println("Match Draw");
            } else if ((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
                System.out.println("You Win");
            } else if ((a == 1 && b == 2) || (a == 2 && b == 3) || (a == 3 && b == 1)) {
                System.out.println("Computer Wins");
            }
            System.out.println("Enter\n1----> Continue\n0-----> Exit");
            c = sc3.nextInt();
        } while (c == 1);

    }

    public static void main(String args[]) {
        Game my = new Game();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Welcome to the game ");
        System.out.println("Enter\n1----> To Play\n 2----> To Check Probability");
        try {
            int num = sc1.nextInt();
            if (num == 2) {
                my.checkProbability();
            } else {
                my.playGame();
            }
        } catch (Exception e) {

        }
    }
}