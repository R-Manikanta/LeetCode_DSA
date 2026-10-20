class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        longest_length = 0
        hashmap = {}
        # inserting the elements into the hashmap which it will O(1) time
        for i in nums:
            hashmap[i] = False
        
        for i in nums:
            current_length = 1 # current subsequence length
            if i-1 not in hashmap and not hashmap[i]:
                hashmap[i] = True
                next_val = i+1
                while(next_val in hashmap):
                    hashmap[next_val] = True
                    current_length+=1
                    next_val+=1
            longest_length = max(longest_length,current_length)
        return longest_length
