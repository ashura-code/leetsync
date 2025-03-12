class Solution(object):
    def defangIPaddr(self, address):
        """
        :type address: str
        :rtype: str
        """
        defanged = ""

        for char in address:
            if(char == "."):
                defanged += "[.]"
            else: 
                defanged += char

        return defanged



        