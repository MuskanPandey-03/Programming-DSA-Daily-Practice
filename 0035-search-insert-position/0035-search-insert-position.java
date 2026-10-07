class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<=nums.length-1;i++){
            if(target==nums[i]){
                return i;
            }
            else if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}