class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> sum = new HashMap<>();
        int n = nums1.length, target;
        int count = 0;
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                int total = nums1[i]+nums2[j];
                sum.put(total,sum.getOrDefault(total,0)+1);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                target = 0-(nums3[i]+nums4[j]);
                count+=sum.getOrDefault(target,0);
            }
        }
        return count;
    }
}