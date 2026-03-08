package Leetcode;
class twoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int currSum = nums[left] + nums[right];
            if (currSum == target){
                result[0] = left;
                result[1] = right;
            }
            if (currSum < target){
                left+=1;
            }
            else{
                right-=1;
            }  
        }
    return result;
    }
}
/* Only works if the array is sorted!!!, use hashmap 
 * instead to get O(N) or brute force it with 
 * a nested for loop which results in O(N^2)
 */