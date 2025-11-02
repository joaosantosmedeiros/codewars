//https://www.codewars.com/kata/53dc23c68a0c93699800041d
#include <stdlib.h>
#include <string.h>
char *smash (const char *const words[/* count */], size_t count){
  char *str = malloc(1000);
  
  for(int i = 0; i < count; i ++) {
    strcat(str, words[i]);
    strcat(str, " ");
  }
  
  str[strlen(str) - 1] = '\0';
  return str;
}
