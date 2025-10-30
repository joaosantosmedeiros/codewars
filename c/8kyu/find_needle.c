//https://www.codewars.com/kata/56676e8fabd2d1ff3000000c
#include <stdlib.h>
#include <string.h>
char *find_needle(const char *const haystack[/* count */], size_t count){
  int pos = 0; 
  while(count --) {
    if(strcmp(haystack[count], "needle") == 0) pos = count;
  }
  char* str;
  asprintf(&str, "found the needle at position %d", pos);
  return str;
}
