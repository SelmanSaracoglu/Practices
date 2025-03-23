package DesignWithCodes;

import java.util.Scanner;

public class FibonacciDesign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kac adet Fibonacci sayisi girmek istersiniz: ?");
        int rows = scanner.nextInt();

        int[] fibo = new int[rows];
        fibo[0] = 1;
        fibo[1] = 1;

        for (int i = 2; i < rows ; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
            System.out.print(fibo[i] + " ");
        }
        System.out.println();
        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0; j < fibo[i]; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
