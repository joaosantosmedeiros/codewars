//https://www.codewars.com/kata/53dc54212259ed3d4f00071c
#include <stddef.h>

int sum_array(const int values[/* count */], size_t count){
  int sum = 0;
  while(count --){
    sum += values[count];
  }
  return sum;
}
