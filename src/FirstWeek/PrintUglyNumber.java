package FirstWeek;

import java.util.Scanner;

public class PrintUglyNumber {
    public static void main(String[] args) {

        // Check if ugly number or not

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is ugly number: ");
        int number = scanner.nextInt();
        int newNumber;
        newNumber = number;

        // Çirkin sayıyı kontrol et

        for (int i=2; i <= 5; i++){
            while (newNumber % i == 0){
                newNumber /= i;
            }
        }
        // Eğer sayi 1 olmuşsa, sadece 2, 3 ve 5'e bölünebilir bir sayıdır.

        if (newNumber == 1 ){
            System.out.println("The number " + number + " is an ugly number");
        } else {
            System.out.println("The number " + number + " is not an ugly number");
        }
        scanner.close();


    }
}
