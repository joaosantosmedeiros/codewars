//https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0
// this code is trash
#include <string.h>

char *remove_char(char *dst, const char *src) {
  int length = strlen(src) - 2;  
  for(int i = 0; i < length; i ++) *(dst + i) = *(src + i + 1);
  *(dst + length) = '\0';
  
  return dst;
}
