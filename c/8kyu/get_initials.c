//https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3
#include <string.h>
#include <ctype.h>

char *get_initials (const char *full_name, char initials[4]){
  int len = strlen(full_name);
  initials[0] = toupper(full_name[0]);
  initials[1] = '.';
  
  for(int i = 0; i < len; i ++) {
    if(i != 0 && full_name[i - 1] == ' '){
      initials[2] = toupper(full_name[i]);
      break;
    }
  }
  
  initials[3] = '\0';
  return initials;
}
