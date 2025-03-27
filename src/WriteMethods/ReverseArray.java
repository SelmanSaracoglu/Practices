package WriteMethods;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Örnek dizi
        int[] reversedArray = reverseArray(array);
        System.out.println("Tersine çevrilmiş dizi: " + Arrays.toString(reversedArray));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime girin: ");
        String input = scanner.nextLine();

        String reversedInput = reverseString(input);
        System.out.println("Ters çevrilmiş kelime: " + reversedInput);
        scanner.close();




    }

    public static int[] reverseArray(int[] arr){
        // Diziyi tersine çeviren metot
        int[] reversed = new int[arr.length]; // Yeni bir ters dizi oluştur
        int j = 0;
        // Elemanları ters sırayla yeni diziye ekleyelim
        for (int i = arr.length-1; i >= 0 ; i--) {
            reversed[j] = arr[i];
            j++;
        }
        return reversed; // Ters çevrilmiş diziyi döndür
    }

    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
