// https://www.codewars.com/kata/56a5d994ac971f1ac500003e/train/javascript
function getLongerElement(arr){
  let max = 0;
  let item = '';

  for (let i = 0; i < arr.length; i++) {
    if(arr[i].length > max) {
      max = arr[i].length;
      item = arr[i]
    }    
  }

  for (const str of arr) {
    if(str.length === item.length){
      return item;
    }
  }

  return '';
}

export function longestConsec(strarr, k) {
  let newArr = [];
  let str = '';

  if(k > strarr.length){
    return '';
  }

  for (let i = 0; i < strarr.length; i++) {
    for (let j = 0; j < k; j++) {
      if(strarr[i + j] == undefined){
        break;
      }
      str += strarr[i + j];      
    }
    newArr.push(str);
    str = '';    
  }

  return getLongerElement(newArr);
}