/*
Name:  [Hamzah Shafeeq]
Assignment:  [Lab4Bouns]
Program: [Computer Programmer]

[This is a game to ask the user to guess a number between 1-100 and also let
the user to quiet at anytime]
*/
import java.util.Scanner;

public class Lab4Bouns{
    
    public static void main (String [] args){
        
    //create scanner
    Scanner in = new Scanner (System.in);
    char keepGoing = 'Y';
    while (keepGoing == 'Y'){
        //telling the user what is the program about.
        System.out.println("I'm thinking of a number between 1 and 100.\n"
             + "What is it?");
        //ganerate a number between 1-100.
        double dblNum = Math.random()* 100 + 1;
        int num = (int) dblNum;
        char answer = '\0';
        while (answer != 'Y'){
            //to get the number that the user will put.
            int guess = in.nextInt();
            //a code to give the user the ability to quiet at anytime by
            //entering a negative number.
            if (guess >= 1 && guess <= 100){
                //a code to give the user some feedback.
                if (guess < num){
                System.out.println("Guess: " + guess + "\n"
                    + "Too low.");
                answer = 'N';
                }else if (guess > num){
                System.out.println("Guess: " + guess + "\n"
                    + "Too high.");
                answer = 'N';
                }else{
                System.out.println("Guess: " + guess + "\n"
                    + "You got it!");
                answer = 'Y';
                }
            }else if (guess < 1){
                System.out.println("You gave up!\nThe number was " + num + ".");
            }
        }
    //to ask the user if want to play again.
    System.out.println("Play again ? (Y/N)");
    keepGoing = in.next().toUpperCase().charAt(0);
    }
    //thanking the user for playing the game.
    System.out.println("Thanks for playing!");
    }
}