// Program Name: PasswordGenerator
// Author: Mobeen Mohammad Ali Raja
// Date: 18/05/2025
// Description: this program generates a random collection of characters using the alphabet and known symbols.

import java.util.Random;
import java.util.Scanner;


public class PasswordGenerator {
    public static void main(String[] args) {

        // Welcome message
        System.out.println("Hello and welcome to the password generating program!");

        // Creating a Random object from the Random package
        Random random = new Random();

        // Creating a Scanner object from Scanner package
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while(true){
            try{

                // Asking the user to enter a length for the password
                System.out.println("Enter a number(length of password): ");

                // Initialising user input into a variable
                number = scanner.nextInt();

                // Exiting the loop upon this try block of coding executing without error
                break;

            } catch (Exception e) {

                // Prompting the user with an error message
                System.out.println("Invalid number!");

                // Resetting the scanner buffer
                scanner.nextLine();

            }
        }



        // Initialisation of variables used to store characters that will be used for generating the password
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String symbols = "\'\"!@#$%^&*()_+=-{}[]|:;<>,./?";
        String password = "";

        // For loop for generating the password, looping through enough times based on user's length of password requested
        for (int i = 1; i <= number; i++) {
            int num = (int)(Math.random() * 3) + 1;
            switch(num){
                case 1:
                    password += alphabet.charAt(random.nextInt(alphabet.length()));
                    break;
                case 2:
                    password += symbols.charAt(random.nextInt(symbols.length()));

                case 3:
                    password += random.nextInt(10);
            }

        }

        // Printing the user's password generated
        System.out.println("Your password: " + password);

    }
}