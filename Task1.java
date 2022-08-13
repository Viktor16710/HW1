class Solution {
    public int removeElement(int[] nums, int val) {
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == val){
                nums[i] = nums[i+1];
            }  
        }
    return nums[0];
    }
}