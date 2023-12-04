// https://www.codewars.com/kata/52449b062fb80683ec000024/train/javascript
function generateHashtag(str) {
  if (str.length == 0 || str.split(" ").every(el => el == '')) {
    return false;
  }
  const arr = str.split(" ");
  let i = 0;
  while (i != -1) {
    i = arr.indexOf("");
    if (i != -1) {
      arr.splice(i, 1);
    }
  }

  const capitalizedArr = arr.map((word) => word[0].toUpperCase() + word.slice(1));
  const capitalizedStr = '#' + capitalizedArr.join("");

  return capitalizedStr.length <= 140 ? capitalizedStr : false;
}