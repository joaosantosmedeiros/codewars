//https://www.codewars.com/kata/5a00e05cc374cb34d100000d
#include <stdlib.h>

unsigned short *reverse_seq(unsigned short num){
  unsigned short* nums = malloc(sizeof(unsigned short) * num);
  
  for(int i = 0; i < num; i ++) nums[i] = num - i; 
  
  return nums;
}
