class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> hashNum = new HashSet<>();
        int score = 0;
        int left = 0;
        int maxScore = Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++){
            if(!hashNum.contains(nums[right])){
                hashNum.add(nums[right]);
                score+=nums[right];
            }
            else{
                while(nums[left]!=nums[right]){
                    hashNum.remove(nums[left]);
                    score-=nums[left];
                    left++;
                }
                hashNum.remove(nums[left]);
                score-=nums[left];
                left++;
                hashNum.add(nums[right]);
                score+=nums[right];
            }
            maxScore = Math.max(maxScore,score);
        }
        return maxScore;
    }
}