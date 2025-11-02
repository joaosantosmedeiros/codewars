//https://www.codewars.com/kata/57f780909f7e8e3183000078
#include <stddef.h>

int grow(size_t size, const int arr[size]) {
  int result = 1;
  while(size --) {
    result *= arr[size];
  }
  return result;
}
