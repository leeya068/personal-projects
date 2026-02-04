package coddydailyprojects;
import java.util.Scanner;

/* The Roisterous Loop Challenge

Write a program that gets an integer input from the user, called limit.
The program should print all even numbers from 0 up to (but not including) limit, each on a new line.

Hint 1: Remember that you can use the modulus operator % to check if a number is even.
Hint 2: Use a loop to iterate through numbers from 0 to limit and print the even ones.

*/

public class RoisterousLoopChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        for (int i = 0; i < limit; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}

