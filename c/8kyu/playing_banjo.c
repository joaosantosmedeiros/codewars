//https://www.codewars.com/kata/53af2b8861023f1d88000832
#include <stdlib.h>
#include <string.h>

char *are_you_playing_banjo(const char *name) {
  int plays_banjoo = *name == 'r' || *name == 'R' ? 1 : 0;
  char* suffix = plays_banjoo ? " plays banjo" : " does not play banjo";
  
  int len = strlen(name) + strlen(suffix) + 1;
  char* str = malloc(len);
  snprintf(str, len, "%s%s", name, suffix);
	return str;
}
