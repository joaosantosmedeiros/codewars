// https://www.codewars.com/kata/5420fc9bb5b2c7fd57000004/train/javascript
function highestRank(arr) {
  let numbers = [];
  let maximumOccurrences = 0;
  for (let i = 0; i < arr.length; i++) {
    const quantity = arr.filter(number => number == arr[i]).length;
    if (quantity > maximumOccurrences) {
      maximumOccurrences = quantity;
    }
  }
  for (let j = 0; j < arr.length; j++) {
    const quantity = arr.filter(number => number == arr[j]).length;
    if(quantity === maximumOccurrences){
      numbers.push(arr[j]);
    }
  }
  return Math.max(...numbers);
}