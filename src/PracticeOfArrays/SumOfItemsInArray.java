package PracticeOfArrays;

public class SumOfItemsInArray {

    public static void main(String[] args) {

        int[] nums = {3,4,7,9,12,5,8,11,32};
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }
        System.out.println("Sayilarin toplami: " + sum);


        int[] numss = {1,2,3,4,5,4};
        int mal =1;

        for (int each : numss) {
            mal *= each;
        }
        System.out.println("Sayilarin carpimi: " + mal);

        int[] arr = {34,-56,534,-344,67,87,-98,13};
        int sum1 = 0;

        for (int each: arr){
            sum1 += each;
        }

        double average = (double) sum1 / arr.length;
        System.out.println("arr listesinin sayi degerlerinin ortalamasi: " + average);

    }
}
