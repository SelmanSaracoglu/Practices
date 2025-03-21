package FirstWeek;

import java.util.Scanner;

public class sumOfFigures {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       while (true){
           System.out.println("Please enter a number (or type something starting with 'e')");
           String input = scanner.nextLine();
           if (input.charAt(0) == 'e') {
               System.out.println("The Program is ending.");
               break;
           }

           int number = Integer.parseInt(input);
           int numberValues= 0;
           System.out.println("Girilen Sayi: " + number);

           while (number > 0) {
               int digit = number % 10;
               numberValues += digit;
               number /= 10;
           }

           System.out.println(numberValues);
       }
       scanner.close();
    }
}
