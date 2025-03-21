package FirstWeek;

import java.util.Scanner;

public class malTable {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);


        while (true) { // Sonsuz döngü
            System.out.print("Çarpım tablosunu görmek istediğiniz sayıyı girin (Çıkış için 0): ");
            int num = scanner.nextInt();

            if (num == 0) { // Çıkış koşulu
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            for (int i = 1; i <= 10 ; i++) {
                int result = i*num;
                System.out.println(num + "*" + i + ":" + result );
                }

            System.out.println("----------------------");
        }
        scanner.close();
    }
}

