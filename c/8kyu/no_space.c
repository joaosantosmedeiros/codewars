//https://www.codewars.com/kata/57eae20f5500ad98e50002c5/
#include <stdlib.h>
#include <string.h>

char *no_space(const char *str_in) {
  
  int length = strlen(str_in);
  int number_of_spaces = 0;
  
  for(int i = 0; i < length; i ++) {
    if(str_in[i] == 32) number_of_spaces ++;
  }
  
  char* str_out = malloc(length + 1 - number_of_spaces); 

  for(unsigned int i = 0; i < length; i ++) {
    if(str_in[i] != 32) strncat(str_out, (str_in + i), 1);
  }
  
  str_out[length - number_of_spaces] = '\0';
  return str_out;
}
