package PracticeOfArrays;

import java.util.Arrays;

public class SumOfItemsInArray {

    public static void main(String[] args) {

        int[] nums = {3,4,7,9,12,5,8,11,32};
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);

        int[] numss = {1,2,3,4,5,4};
        int mal =1;

        for (int each : numss) {
            mal *= each;
        }

        System.out.println(mal);
    }
}
