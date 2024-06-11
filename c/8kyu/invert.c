// https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/
#include <stddef.h>

void invert(int *values, size_t values_size) {
  for (int i = 0; i < values_size; i++) {
    values[i] = values[i] * -1;
  }
}