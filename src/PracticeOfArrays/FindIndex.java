package PracticeOfArrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindIndex {

    public static void main(String[] args) {
        int[] array = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Index'i bulmak istediginiz degeri giriniz: ");
        int target = scanner.nextInt();
        scanner.close();

        int index =findIndex(array,target);

        if (index != -1) {
            System.out.println("Aranan değer " + target + ", dizide " + index + ". indekste bulunuyor.");
        }else {
            System.out.println("Aranan deger dizide bulunamadı.");
        }


        System.out.println("---------------------------------------");


        // Primitif int[] dizisiyle Arrays.asList().indexOf() kullanamazsınız
        Integer [] arrays = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};
        int index2 = Arrays.asList(arrays).indexOf(56);
        System.out.println("Aranan değerin indeksi: " + index2);
    }

    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target ) {
                return i; // İlk bulunan index döndürülür
            }
        }
        return -1; // Eğer bulunamazsa -1 döndürülür
    }
}
