class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length<3 || nums==null){
            return 0;
        }
        Arrays.sort(nums);
        int closest_sum = nums[0]+nums[1]+nums[2];
        for(int i=0;i<=nums.length-1;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int total = nums[i]+nums[j]+nums[k];
                if (Math.abs(total-target)<Math.abs(closest_sum-target)){
                        closest_sum = total;
                }
                if (total<target){
                    j++;
                }
                else if (total>target) {
                    k--;
                }
                else{
                    return closest_sum;
                }

            }
        }
        return closest_sum;
    }
}