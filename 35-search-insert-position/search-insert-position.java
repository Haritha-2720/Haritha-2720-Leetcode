class Solution {
    public int searchInsert(int[] nums, int target) {

        //int n =nums.length-1;

        int left =0;

        int right=nums.length-1;

        while(left<=right){
              int mid = left + (right - left) / 2; // Avoid overflow

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Move to the right half
            } else {
                right = mid - 1; // Move to the left half
            }
        }
        return left; // `left` indicates the insertion position
    }
}