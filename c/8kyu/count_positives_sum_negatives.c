//https://www.codewars.com/kata/576bb71bbbcf0951d5000044
#include <stddef.h>
void count_positives_sum_negatives(
    const int values[/* count */], size_t count,
    int *positives_count, int *negatives_sum
){
  *positives_count = 0;
  *negatives_sum = 0;
    
  while(count --) {
    int aux = values[count];
    if(aux > 0) *positives_count = *positives_count + 1;
    else *negatives_sum = *negatives_sum + aux;
  }
}
