package WriteMethods;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5}; // Örnek dizi
        int[] reversedArray = reverseArray(arr1);
        System.out.println("Tersine çevrilmiş dizi: " + Arrays.toString(reversedArray));

        System.out.println("=============================================================");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime girin: ");
        String input = scanner.nextLine();

        String reversedInput = reverseString(input);
        System.out.println("Ters çevrilmiş kelime: " + reversedInput);


        System.out.println("=============================================================");

        int[] arr2 = {10,20,30,40,50};
        swapFisrtLast(arr2);
        System.out.println("Yeni dizi: " + Arrays.toString(arr2));

        System.out.println("==============================================================");

        int[] arr3 = {1, 2, 3, 4, 5};
        rotateRight(arr3);
        System.out.println("Kaydirilmis dizi: " + Arrays.toString(arr3));

        System.out.println("==============================================================");

        System.out.println("Bir cumle gir, ya da kelime girin: ");
        String plndrom = scanner.nextLine();

        if (isPalindrome(plndrom)){
            System.out.println("Evet, palindrom!");
        }else {
            System.out.println("Hayır, palindrom değil!");
        }

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

    public static void swapFisrtLast(int[] arr) {
        if (arr.length>1){
            int temp = arr[0];
            arr[0] = arr[arr.length-1];
            arr[arr.length-1] = temp;
        }
    }

    public static void rotateRight(int[] arr) {
        if (arr.length > 1) {
            int last = arr[arr.length-1];

            for (int i = arr.length-1; i > 0 ; i--) {
                arr[i] = arr[i-1];
            }
            arr[0] =last;
        }
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
