// https://www.codewars.com/kata/57b06f90e298a7b53d000a86/train/javascript
export function queueTime(customers, n) {
  if (customers.length == 0) {
    return 0;
  }
  
  let total = 0;
  let splicedArr = customers.splice(0, n);
  while (true) {
    if (customers.length == 0) {
      return total += Math.max(...splicedArr);
    }
    for (let i = 0; i < splicedArr.length; i++) {
      splicedArr[i]--;
    }
    total++;

    while (splicedArr.includes(0)) {
      const index = splicedArr.findIndex((number) => number == 0);
      splicedArr.splice(index, 1);
    }
    while (splicedArr.length < n) {
      if (customers.length == 0) {
        return total += Math.max(...splicedArr);
      }
      splicedArr.push(customers[0]);
      customers.shift();
    }
  }
}