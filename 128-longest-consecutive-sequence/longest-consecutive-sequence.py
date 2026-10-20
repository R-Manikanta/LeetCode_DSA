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
            prev = i-1
            hashmap[i] = True
            while prev in hashmap and not hashmap[prev]:
                current_length +=1
                hashmap[prev] = True
                prev-=1
            next = i + 1
            while next in hashmap and not hashmap[next]:
                current_length +=1
                hashmap[next] = True
                next = next + 1
            
            longest_length = max(longest_length,current_length)
        return longest_length
