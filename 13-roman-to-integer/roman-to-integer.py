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

        for i,roman in enumerate(s):
            if(i>0 and kb[s[i-1]] < kb[roman]):
                value -= kb[s[i-1]]
                value += kb[roman] - kb[s[i-1]]
            else:
                value += kb[roman]

        return value

        