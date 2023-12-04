// https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
function duplicateCount(text) {
  let duplicates = 0;
  let textArray = text.toLowerCase().split("").sort();

  for (let i = 0; i < textArray.length; i++) {
    let duplicatesArray = textArray.filter((letter) => letter == textArray[i]);
    if (duplicatesArray.length > 1) {
      duplicates++;
  
      for (let j = 0; j < textArray.length; j++) {
        if(textArray[i] == duplicatesArray[0]){
          textArray.splice(i, 1);
        }        
      }
    }
  }

  return duplicates;
}