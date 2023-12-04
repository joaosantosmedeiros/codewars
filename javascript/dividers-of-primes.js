// https://www.codewars.com/kata/64600b4bbc880643faa343d1/train/javascript
function getDividers(values, powers) {
  const dividers = [];
  const numbers = values.map((value, index) => value ** powers[index]);
  const result = numbers.reduce((previousValue, currentValue) => previousValue * currentValue);

  for (let i = result; i >= 1; i--) {
    if (result % i == 0) {
      dividers.push(result / i);
    }
  };
  return dividers;
}