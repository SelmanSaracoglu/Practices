package PracticeOfArrays;

import java.util.Scanner;

public class SearchValueInArray {

    public static void main(String[] args) {

        int[] numbers = {1551,1223,1443,1267,1789,1023,2020};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aranacak degeri giriniz: ");
        int search = scanner.nextInt();

        // Metot çağırarak arama yap
        System.out.println(search + " array içinde bulundu mu? : " + contains(numbers,search));

        System.out.println("For loop için Aranacak degeri giriniz: ");
        int search1 = scanner.nextInt();
        boolean found = false;

        for ( int each : numbers ) {
            if (each == search1){
                found = true;
                break;
            }
        }
        System.out.println(search1 + " array içinde bulundu mu? : " + found);


    }

        // Metot: Dizide bir elemanın olup olmadığını kontrol eder.
        public static boolean contains(int[] array, int target) {
            for (int num : array) {
                if(num == target) {
                    return true;
                }
            }
            return false;
    }
}
