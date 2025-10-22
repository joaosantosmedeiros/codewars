// https://www.codewars.com/kata/55d24f55d7dd296eb9000030/c
int summation(int number) {
  if(number <= 1) return 1; 
  return number + summation(number - 1);
}
