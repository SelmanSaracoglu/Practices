package WriteMethods;

import java.util.Scanner;

public class SumUp {

    public static int sumTwoNumbers (int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz: ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int sum = sumTwoNumbers(c,d);
        System.out.println("Girdiginiz Sayilarin Toplami: " + sum);

        scanner.close();
    }
}
