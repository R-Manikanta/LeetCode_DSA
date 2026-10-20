class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        longest_length = 0
        hashset = set(nums) # it removes the duplicates
        # inserting the elements into the hashset which it will O(1) time [1,0,2]
        for i in hashset:
            if i-1 not in hashset:
                current_length=1
                next_val = i+1
                while(next_val in hashset):
                    current_length+=1
                    next_val+=1
                longest_length = max(longest_length,current_length)
        return longest_length
