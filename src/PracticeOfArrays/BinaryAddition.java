package PracticeOfArrays;

public class BinaryAddition {

    public static void main(String[] args) {

        String binary1 = "100010";
        String binary2 = "110010";

        int decimal1 = Integer.parseInt(binary1, 2);
        int decimal2 = Integer.parseInt(binary2,2);

        int sum = decimal1 + decimal2;

        String binarySum = Integer.toBinaryString(sum);
        System.out.println("Toplam (binary): " + binarySum);

    }
}
