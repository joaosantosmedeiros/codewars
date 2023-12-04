// https://www.codewars.com/kata/55c6126177c9441a570000cc/train/javascript
function orderWeight(strng) {
  const arr = strng.split(" ");
  const newArr = [];
  for (let i = 0; i < arr.length; i++) {
    let weight = 0;
    for (let j = 0; j < arr[i].length; j++) {
      weight += Number(arr[i][j])
    }
    newArr.push({ number: arr[i], weight });
  }
  return newArr.sort((n1, n2) => {
    if(n1.weight != n2.weight){
      return n1.weight - n2.weight
    }
    const number1 = n1.number.toString();
    const number2 = n2.number.toString();
    return number1 < number2 ? -1 : number1 > number2 ? 1 : 0;
  })
  .map(el => el.number).join(" ");
}