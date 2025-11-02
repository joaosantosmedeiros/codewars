//https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a
int past(int hours, int minutes, int seconds) {
  return (seconds * 1000) + (minutes * 60 * 1000) + (hours * 60 * 60 * 1000);
}
