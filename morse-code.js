// https://www.codewars.com/kata/54b724efac3d5402db00065e/train/javascript
const MORSE_CODE = {
  '.-': 'A',
  '-...': 'B',
  '-.-.': 'C',
  '-..': 'D',
  '.': 'E',
  '..-.': 'F',
  '--.': 'G',
  '....': 'H',
  '..': 'I',
  '.---': 'J',
  '-.-': 'K',
  '.-..': 'L',
  '--': 'M',
  '-.': 'N',
  '---': 'O',
  '.--.': 'P',
  '--.-': 'Q',
  '.-.': 'R',
  '...': 'S',
  '-': 'T',
  '..-': 'U',
  '...-': 'V',
  '.--': 'W',
  '-..-': 'X',
  '-.--': 'Y',
  '--..': 'Z',
  '-.-.--': '!',
  '...---...': 'SOS',
  '.-.-.-': '.'
}

export function decodeMorse(morseCode) {
  morseCode = morseCode.trim().split('   ');
  let fullPhrase = [];

  for (let j = 0; j < morseCode.length; j++) {
    let word = morseCode[j].split(" ");
    for (let i = 0; i < word.length; i++) {
      if( word[i] in MORSE_CODE){
        word[i] = MORSE_CODE[word[i]]
      }
    }
    fullPhrase.push(word.join(""));
  }
  return fullPhrase.join(" ");
}