// https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/javascript
export function validatePIN(pin) {
  if(pin.includes(" ") || pin.includes("\n")){
    return false;
  }
  let digits = 0;
  for (const digit of pin) {
    if (!Number.isInteger(Number(digit))) {
      return false;
    }
    digits++;
  }
  return (digits == 4 || digits == 6) ? true : false;
}