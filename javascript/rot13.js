// https://www.codewars.com/kata/530e15517bc88ac656000716/train/javascript

function rot13(message) {
  return message.split("").map(letter => {
    let asciiChar = letter.charCodeAt(0);
    if((65 <= asciiChar && asciiChar <= 90) || (97 <= asciiChar && asciiChar <= 122)){
      return ((77 < asciiChar && asciiChar < 91) || (109 < asciiChar && asciiChar < 123) ) ? String.fromCharCode(asciiChar - 13) : String.fromCharCode(asciiChar + 13)
    }else{
      return String.fromCharCode(asciiChar);
    }
  }).join("")
}