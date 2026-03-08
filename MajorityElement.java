package Leetcode;
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[] {2,2,1,1,1,2,2};
        int candidate = nums[0];
        int count = 1;
        for (int i = 0; i < nums.length; i++){
            if (count == 0){
                candidate = nums[i];
            }
            if (nums[i] == candidate){
                count+=1;
            }
            if (nums[i] != candidate){
                count-=1;
            }
        }
    }
}
/* Boyer-Moore majority vote algorithm, provides O(1)
 * space complexity
 */
