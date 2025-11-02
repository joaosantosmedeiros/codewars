//https://www.codewars.com/kata/5513795bd3fafb56c200049e
void count_by(unsigned x, unsigned n, unsigned result[n]) {
  for(int i = 0; i < n; i ++) {
    result[i] = x * (i + 1);
  }
}
