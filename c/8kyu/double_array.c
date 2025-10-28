//https://www.codewars.com/kata/57f781872e3d8ca2a000007e
#include <stddef.h>
#include <stdlib.h>

int *maps(const int *arr, size_t size) {
  int* mapped = malloc(size * sizeof(*arr));
  while(size --) {
    mapped[size] = arr[size] * 2;
  }
  return mapped;
}
