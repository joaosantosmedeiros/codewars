// https://www.codewars.com/kata/5456812629ccbf311b000078/train/javascript
function cycle(dir, arr, cur) {
  if (!arr.includes(cur)) {
    return null;
  }
  const index = arr.findIndex((number) => number == cur);
  if (index == 0 && dir == -1) {
    return arr[arr.length - 1];
  } else if (index == arr.length - 1 && dir == 1) {
    return arr[0];
  }
  return arr[index + dir];
}