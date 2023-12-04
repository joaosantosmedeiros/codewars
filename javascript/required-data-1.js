// https://www.codewars.com/kata/55f95dbb350b7b1239000030/train/javascript
function countSel(lst) {
  let maximumOccurrences = 0, oneOccurrence = 0;
  const numbersWithMaximumOccurrences = [];
  const diffOccurrences = [];

  for (const number of lst) {
    let arr = lst.filter(numb => numb == number);
    if (!diffOccurrences.includes(number)) {
      diffOccurrences.push(number);
    }
    if (arr.length == 1) {
      oneOccurrence++;
    }
    if (arr.length > maximumOccurrences) {
      maximumOccurrences = arr.length;
    }
  }
  for (const number of lst) {
    let arr = lst.filter(numb => numb == number);
    if (arr.length == maximumOccurrences) {
      if (!numbersWithMaximumOccurrences.includes(number)) {
        numbersWithMaximumOccurrences.push(number);
      }
    }
  }
  numbersWithMaximumOccurrences.sort((a, b) => a - b);

  return [lst.length, diffOccurrences.length, oneOccurrence, [numbersWithMaximumOccurrences, maximumOccurrences]];
}