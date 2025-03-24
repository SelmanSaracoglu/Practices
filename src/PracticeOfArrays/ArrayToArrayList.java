package PracticeOfArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

    public static void main(String[] args) {

        String[] array = { "Python", "JAVA", "PHP", "Perl", "C#", "C++", "Kanka"};

        // Array'i ArrayList'e çevirme
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("ArrayList:" + arrayList);

        ArrayList<String> arrayList1 = new ArrayList<>();
        for ( String element : array) {
            arrayList1.add(element);
        }
        System.out.println("ArrayList: " + arrayList);



    }
}
