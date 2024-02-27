import java.util.Scanner;
import java.util.Random;

public class Task1{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Random rand=new Random();

        System.out.println("\nWelcome to the Number Game");
        System.out.println("Enter a Random Number for guess 1 to 100");
        System.out.println("Your final score will be the Number of Attempts you took");;
        System.out.print("Enter the Number of Rounds you want to Plays(between 1-5): ");
        int rounds=obj.nextInt();

        for(int i=1;i<=rounds;i++){
            System.out.println();
            System.out.println("Round" + i + "Begins...\n");
            System.out.println("PLease Enter the Difficulty Level:");

            System.out.println("1 =>> Easy [No limits for attempts]");
            System.out.println("2 =>> Hard [Limits for attempts]");
            int limit=obj.nextInt();

            switch (limit){
                case 1: {
                    System.out.println("\nYou are opted for Easy Difficulty");
                    System.out.println("There is No limit for Attempts");

                    int randomNumber = 1 + rand.nextInt(100);
                    System.out.println("Random Number Generated Successfully");

                    int count=1;
                    while(true){
                        System.out.println("\nEnter  your guess number " + count + ":");
                        int guess=obj.nextInt();
                        if(guess > randomNumber){
                            System.out.println("THe Number " + guess + " is\nToo HIGH...\nGuess the Number Again");

                        }else if(guess < randomNumber){
                            System.out.println("THe Number " + guess + " is\nToo LOW...\nGuess the Number Again");

                        }else{
                            System.out.println("The Number " + guess + " is Same to the Generated Number");
                            System.out.println("Congrats you guess the Number CORRECT in " + count + "Attempts.");
                            break;
                        }
                        count++;
                    } break;
                }
                case 2: {
                    System.out.println("\nYou are opted for Hard Difficulty");
                    System.out.println("There is a limit for Attempts");
                    System.out.println("You have 7 Attempts for guess the CORRECT Number.\nOtherwise; You LOOSE the game\n");

                    int randomNumber= 1 + rand.nextInt(100);
                    System.out.println("Random Number Generated Successfully");
                    int count=1;
                    while(count<=7){
                        System.out.println("You have guesses remaining: " + (8-count) + "...\n");
                        System.out.println("Enter  your guess number " + count + ":");
                        int guess=obj.nextInt();

                        if(guess>randomNumber){
                            System.out.println("THe Number " + guess + " is\nToo HIGH...\nGuess the Number Again");
                        }
                        else if(guess < randomNumber){
                            System.out.println("THe Number " + guess + " is\nToo LOW...\nGuess the Number Again");

                        }else{
                            System.out.println("The Number " + guess + " is Same to the Generated Number");
                            System.out.println("Congrats you guess the Number CORRECT in " + count + "Attempts.");
                            break;
                        }
                        count++;
                
                }if(count>7){
                    System.out.println("OOPS!!!\n You fail to guess The Generated Number\nIt wass " + randomNumber);
                    System.out.println("---BETTER LUCK NEXT TIME---\n");
                }
                break;
            }
            default:{
                System.out.println("SORRY!!! WRONG INPUT");
            }
        }
            System.out.println("Round " + i + " is OVER");
        }
        System.out.println("\nAll Rounds are OVER");
        System.out.println("Thank you for Playing\n");
        obj.close();
    }
}