package FirstWeek;

import java.util.Scanner;

public class PrintingVowelConsonant {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("Please enter a letter (or to exit enter 0): ");
            String input = scanner.nextLine();

            if (input.equals("0")) {
                System.out.println("The program is ending.");
                break;
            }
            if (input.length() != 1) {
                System.out.println("You enter Invalid character. You should enter a single letter!");
                continue;
            }

            char letter = input.charAt(0);

            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                if ("aeiouAEIOU".indexOf(letter) != -1 ) {
                    System.out.println(letter + " is a vowel");
                }else {
                    System.out.println(letter + " is a consonant");
                }
            }else {
                System.out.println("Invalid character. Please enter a valid letter!");
            }

        }
        scanner.close();

    }
}
