// this code is trash
#include <stdlib.h>

int numberOfDigits(int n);

char *number_to_string(int number) {
  int digits = numberOfDigits(number);
  char* string = malloc(sizeof(char) * (digits + 1));
  if(number < 0) *(string) = '-';
  
  int i = 0;
  do {
    *(string + digits - i - 1) = abs(number % 10) + 48;
    number /= 10;
    i ++;
  }while(number != 0);
  
  return string;
}

int numberOfDigits(int n) {
 int times = n <= 0 ? 1 : 0; 
  while(n != 0) {
    times ++;
    n /= 10;
  }
  return times;
}
