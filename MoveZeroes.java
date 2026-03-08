package Leetcode;

public class MoveZeroes {
    public static void main(String[] args) {
        int nextNonZero = 0;
        int temp;
        int[] nums = new int[(int) Math.pow(10.0, 4.0)];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                temp = nums[nextNonZero];
                nums[nextNonZero] = nums[i];
                nums[i] = temp;
                nextNonZero++;
            }
        }
        for (int j = 0; j < nums.length; j++){
            System.out.print(nums[j] + " ");
        }
    }
}
/* Uses 2-pointer method, one for iterating through the array[i], and
 * second for pointing at the number, where next nonzero number should go
 */