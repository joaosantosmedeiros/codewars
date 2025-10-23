//https://www.codewars.com/kata/54edbc7200b811e956000556/
#include <stdbool.h>
#include <stddef.h>

size_t count_sheep(const bool sheep[/* count */], size_t count)
{ 
  int sheeps = 0;
  while(count --){
    if(sheep[count]) sheeps ++;
  }
  return sheeps;
}
