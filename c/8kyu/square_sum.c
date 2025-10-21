//https://www.codewars.com/kata/515e271a311df0350d00000f
#include <stddef.h>

int square_sum(const int values[/* count */], size_t count)
{
  int sum = 0;
  
  for(int i = 0; i < count; i ++) {
    int actual = values[i];
    sum += actual * actual;
  }
	return sum;
}
