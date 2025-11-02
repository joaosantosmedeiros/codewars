//https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7/
#include <string.h>
char *makeUpperCase (char *string){
  int length = strlen(string);
  while(length --) {
    string[length] = toupper(string[length]);
  }
  return string;
}
