class Solution(object):
    def sumOfUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        freq = {}
        for i in nums: 
            if i in freq: 
                freq[i] += 1
            else: 
                freq[i] = 1
        sum = 0
        for value,freq in freq.items():
            if(freq==1):
                sum+=value

        return sum
            
            
        
        