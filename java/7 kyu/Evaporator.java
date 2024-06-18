// https://www.codewars.com/kata/5506b230a11c0aeab3000c1f
public class Evaporator { 
	
	public static int evaporator(double content, double evap_per_day, double threshold) {
		double initialContent = content;
		int days = 0;
		while(content > initialContent * (threshold / 100)){
			content -= content * (evap_per_day / 100);
			days ++;
		}
		return days;
	}
}