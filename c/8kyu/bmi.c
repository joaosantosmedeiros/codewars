//https://www.codewars.com/kata/57a429e253ba3381850000fb
const char *bmi (int weight, double height)
{
  double bmi = (double) weight / (height * height); 
  if(bmi <= 18.5) return "Underweight";
  if(bmi <= 25.0) return "Normal";
  if(bmi <= 30.0) return "Overweight";
	return "Obese";
}
