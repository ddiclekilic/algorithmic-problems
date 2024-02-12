
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative
order of the non-zero elements. For example, given nums = [0, 1, 0, 3, 12], after calling
your function, nums should be [1, 3, 12, 0, 0].
 */

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if (nums[j] != 0) {
                j++;
            }
        }
        for (int i : nums)
            System.out.print(i + " ");
    }
}