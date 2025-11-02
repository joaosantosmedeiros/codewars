//https://www.codewars.com/kata/57eae65a4321032ce000002d/
include <string.h>

void fakeBin(const char *digits, char *binary) {
  int length = strlen(digits);
  for (int i = 0; i < length; i++)
    {
    binary[i] = (digits[i] < '5') ? '0' : '1';
  }
  binary[length] = '\0'; 
}
