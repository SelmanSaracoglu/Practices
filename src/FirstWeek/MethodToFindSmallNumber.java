package FirstWeek;

import java.util.Scanner;

public class MethodToFindSmallNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers will you enter?: ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Please enter 1 or more numbers.");
            return;
        }

        System.out.println("Enter first number: ");
        int min = scanner.nextInt();

        for (int i = 2; i <= count; i++) {
            System.out.println(i + ".sayiyi giriniz: ");
            int num = scanner.nextInt();
            if (num < min) {
                min = num;
            }

        }

        System.out.println("En kucuk sayi: " + min);

        scanner.close();


    }
}
