/**
 * @param {number[]} fruits
 * @param {number[]} baskets
 * @return {number}
 */
var numOfUnplacedFruits = function(fruits, baskets) {

    let unplaced = fruits.length;

    for(let fruit of fruits){ 
         for(let i=0;i<baskets.length;i++){
             if(fruit <= baskets[i]){ 
                 baskets[i] = -1;
                 unplaced -= 1;
                 break;
             }
         }
    }

    return unplaced;
    



};