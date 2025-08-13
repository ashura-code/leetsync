/**
 * @param {number} n
 * @return {boolean}
 */
 
var isPowerOfThree = function(n) {
    if(n<1)return false
    let num = n;
    while(num%3==0){
        num = num/3;
        console.log(num);
    }
    return (num==1);
};