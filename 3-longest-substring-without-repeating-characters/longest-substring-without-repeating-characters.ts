function lengthOfLongestSubstring(s: string): number {

      let set = new Set();
      let res = 0;
      let l = 0;

      for(let r=0;r<s.length;r++){ 
         while(set.has(s[r])){ 
              set.delete(s[l]);
              l++;
         }
         set.add(s[r]);
         res = Math.max(r-l+1,res);
      }

      return res;




      

    
};