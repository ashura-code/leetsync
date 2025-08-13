/**
 * @param {number} n
 * @return {boolean}
 */
var isPowerOfThree = function(n) {
    let num =1;
    while(n>=num){ 
        if(num == n)return true;
        num = num*3;
    }
    console.log(num);
    return false;
    
};