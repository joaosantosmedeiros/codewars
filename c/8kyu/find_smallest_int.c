//https://www.codewars.com/kata/55a2d7ebe362935a210000b2
#include <stddef.h>

int find_smallest_int(const int array[/* len */], size_t len){
  int min = array[len - 1];
  while(len--)
    if(array[len] < min) min = array[len];
  
  return min;
}
