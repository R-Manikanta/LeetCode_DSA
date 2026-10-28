class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int left,right;
        for(int i=0;i<=nums.length-4;i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1;j<=nums.length-3;j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }

                left = j+1;
                right = nums.length-1;
                while(left<right){
                    long total = (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(total<target){
                        left+=1;
                    }
                    else if (total>target){
                        right-=1;
                    }
                    else{
                        result.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        left+=1;
                        right-=1;
                        while(left<right && nums[left]==nums[left-1]){
                            left+=1;
                        }
                        while(left<right && nums[right]==nums[right+1]){
                            right-=1;
                        }
                    }
                }
            }
        }
        return result;

    }
}