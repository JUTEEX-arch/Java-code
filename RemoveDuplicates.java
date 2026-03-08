package Leetcode;
public class RemoveDuplicates {
    @SuppressWarnings("UnnecessaryContinue")
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int nextUnique = nums[0];
        int k = 0;
        int indexNextUnique = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != nextUnique){
                k += 1;
                nextUnique = nums[i];
                indexNextUnique += 1;
                nums[indexNextUnique] = nums[i];
            }
            if (nums[i] == nextUnique){
                continue;
            }
        }
        System.out.println(k);
        for (int j = 0; j <  nums.length; j++){
            System.out.print(nums[j] + " ");
        }
    }
}
/* Uses 2-pointer technique. One pointer to iterate through array
 * another to track the place, where the next unique element wll go
 * returns the num of unique elements (k + 1) since one 
 * element gets lost in the process (for whatever reason)
 */