package FirstWeek;

import java.util.Scanner;

public class ChoiseToFindSmallOrBigNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Secenekler");
            System.out.println("1 - En kucuk sayiyi bul ");
            System.out.println("2 - En buyuk sayiyi bul ");
            System.out.println("3 - Cikis");
            System.out.println("Lutfen bir secenek secin: ");
            int choise = scanner.nextInt();

            if (choise == 3) {
                System.out.println("Cikis yapiliyor");
                break;
            }
            System.out.println("Kac sayi girmek istediğinizi yaziniz: ");
            int count = scanner.nextInt();

            if (count <= 0) {
                System.out.println("Lutfen 1 veya daha fazla sayi giriniz");
            }

            System.out.println("Ilk sayiyi giriniz: ");
            int num = scanner.nextInt();
            int result = num;

            for (int i = 2; i <=count ; i++) {
                System.out.println(i + ". sayiyi giriniz: ");
                num = scanner.nextInt();

                switch (choise) {
                    case 1:
                        if (num < result) {
                            result = num;
                        } break;

                    case 2:
                        if (num>result) {
                            result = num;
                        } break;
                    default:
                        System.out.println("Gecersiz secenek! Lutfen tekrar deneyin");
                        break;
                }
            }

            if (choise == 1) {
                System.out.println("En kucuk sayi: " + result);
            } else if (choise ==2) {
                System.out.println("En buyuk sayi: " + result);
            }
        }
    }
}
