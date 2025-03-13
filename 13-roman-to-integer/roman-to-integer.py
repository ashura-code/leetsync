class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        kb = {
            "I":1,
            "V":5,
            "X":10,
            "L":50,
            "C":100,
            "D":500,
            "M":1000
        }

        value = 0
        length = len(s)

        for i in range(length): 
            curr_val = kb[s[i]]
            if(i+1 < length and kb[s[i+1]] > curr_val):
                value -= curr_val
            else:
                value += curr_val
        return value

        