// https://www.codewars.com/kata/513e08acc600c94f01000001/train/javascript
function rgb(r, g, b) {
  return [r, g, b].map((value, index, arr) => {
      if (arr[index] > 255) arr[index] = 255;
      if (arr[index] < 0) arr[index] = 0;

      return Math.floor(arr[index] / 16).toString(16) + (arr[index] % 16).toString(16);
    }).join("").toUpperCase();
}