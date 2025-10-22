// https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/
#include <stdlib.h>
#include <string.h>

char *repeat_str(size_t count, const char *src){
  size_t len = (strlen(src) * count) + 1;
  char* dst = malloc(len);
  dst[0] = '\0';
  
  for(size_t i = 0; i < count; i ++) strcat(dst, src);
  dst[len - 1] = '\0';
  
  return dst;
}
