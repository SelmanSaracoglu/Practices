package DesignWithCodes;

public class NumberPyramid {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Boşlukları yazdırma
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 2 * i ; j++) {
                System.out.print(j);
            }

            for (int j =2 * i - 2; j >= i ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
