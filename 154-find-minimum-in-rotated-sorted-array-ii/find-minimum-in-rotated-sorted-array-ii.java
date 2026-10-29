class Solution {
    public int findMin(int[] nums) {
        int left = 0,right = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[left]==nums[mid] && nums[mid]==nums[right]){
                if(nums[mid]<min){
                    min = nums[mid];
                }
                left++;
                right--;
            }
            else if (nums[left]<=nums[mid]){
                if(nums[left]<min){
                    min = nums[left];
                }
                left = mid+1;
            }
            else{
                if(nums[mid]<min){
                    min = nums[mid];
                }
                right = mid-1;
            }
        }
        return min;
    }
}