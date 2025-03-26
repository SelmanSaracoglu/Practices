package WriteMethods;

import java.util.Scanner;

public class EvenOrOddNumber {

    public static boolean isEven (int number){
     return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");
        int number = scanner.nextInt();
        if (isEven(number)) {
            System.out.println(number + " çift bir sayıdır.");
        } else {
            System.out.println(number + " tek bir sayıdır.");
        }
        scanner.close();
    }
}
