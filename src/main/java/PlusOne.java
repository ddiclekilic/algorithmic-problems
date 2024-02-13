
/*
You are given a large integer represented as an integer array digits. The digits are ordered from
most significant to least significant in left-to-right order. The large integer does not contain any
leading 0's. Increment the large integer by one and return the resulting array of digits.
 */

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] resultArray = new int[length + 1];
        resultArray[0] = 1;
        return resultArray;
    }
}
