package PracticeOfArrays;

import java.util.Arrays;

public class SortThingsInArrays {
    public static void main(String[] args) {
        int[] arrayNumbr = {8,12,9,26,58,67,46,13,17,69,86,37};
        String[] arrayWords = {"Ayse", "Nur","Selman","yasin","kezban","Remzi","Naciye","adile","Güllü","Mahmut","Galipn","Ahsen"};

        Arrays.sort(arrayNumbr);
        Arrays.sort(arrayWords);

        System.out.println(Arrays.toString(arrayNumbr));
        System.out.println(Arrays.toString(arrayWords));

        int[] numbers = {2,6,7,11,35,67};
        Arrays.fill(numbers,4);
        System.out.println(Arrays.toString(numbers));

        int[] copy =  Arrays.copyOf(numbers, 8);
        System.out.println(Arrays.toString(copy));

        int[] sub = Arrays.copyOfRange(numbers, 2,6);
        System.out.println(Arrays.toString(sub));


    }
}
