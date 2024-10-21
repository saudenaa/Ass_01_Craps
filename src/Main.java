import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[]args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        while(playAgain){
            System.out.println("Rolling the dice...");
            int die1 = rnd.nextInt(6)+1;
            int die2 = rnd.nextInt(6)+1;
            int sum = die1 + die2;
            System.out.println("You rolled: " + die1 + " + "+  die2 + " = "+ sum);

            int point = 0;
            boolean tryingForPoint = false;

            if (sum == 2|| sum ==3 || sum == 12){
                System.out.println("Crapped out,you lose!");
            }

            else if (sum ==7 || sum == 11){
                System.out.println("Natural, you wun!");
            }

            else{
                point = sum;
                System.out.println("Point is now: " + point);
                tryingForPoint = true;;
            }


            while(tryingForPoint){
                System.out.println("Rolling the dice...");
                die1 = rnd.nextInt(6) +1;
                die2 = rnd.nextInt(6)+1;
                sum = die1 + die2;
                System.out.println("You rolled: "+ die1 + "+" +die2 + " = "+ sum);

                if (sum == 7){
                    System.out.println("Got a seven, you lose!");
                    tryingForPoint = false;
                }
                else if (sum == point){
                    System.out.println("Made point, you win!");
                    tryingForPoint = false;
                }
                else{
                    System.out.println("Trying for point....");
                }

                System.out.println("Do you want to play again? (yes/no)");
                String response = sc.next();
                playAgain = response.equalsIgnoreCase("yes");
            }
        }
        sc.close();
    }
}