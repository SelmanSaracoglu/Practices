package PracticeOfArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheItem {
    public static void main(String[] args) {

        // Örnek bir array listesi
        int[] numbers = {12, 35, 1, 10, 34, 1, -1, -9, -12, 17, 56,98,-46};

        System.out.println("Array'i tersten yazdır.");

        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = numbers.length -1; i >= 0 ; i--) {
            reversedList.add(numbers[i]);
        }

        System.out.println("Ters çevrilmiş liste:");
        System.out.println(reversedList);

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers)); // Array yazdırmak için kullanılır.

        int secondLargest = numbers[numbers.length-2];
        int smallest = numbers[0];
        System.out.println("Array'deki 2. en buyuk sayi: " + secondLargest);
        System.out.println("Array'deki en kucuk sayi: " + smallest);

        int count = 0;
        for (int number : numbers) {
            if (number < 0) {
                count ++;
            }
        }
        System.out.print("Array'de " + count + " adet negatif sayi var." );

        System.out.println();

        ArrayList<Integer> evenNumbers = new ArrayList<>(); // Çift sayıları tutmak için bir ArrayList oluşturuyoruz
        int sayac = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sayac ++;
                evenNumbers.add(number);
            }
        }
        System.out.print("Array'de " + sayac + " adet cift sayi var." );
        System.out.println("\nCift sayilar liste hali: " + evenNumbers);


    }
}
