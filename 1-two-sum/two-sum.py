class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hash_map = {}
        for i in range(0,len(nums)):
            needed = target - nums[i]
            if needed in hash_map:
                return [hash_map[needed],i]
            hash_map[nums[i]] = i
            
