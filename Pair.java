//Object for storing a credit-gradeValue pair
public class Pair {
	private double credit;
	private double gradeVal;

	public Pair(double cr, String grade) {
		credit = cr;
		gradeVal = calcGradeVal(grade);
	}

	public double calcGradeVal(String grade) {
		double value = 0.00;
		
		switch(grade) {
			case "A+": gradeVal = 4.33;
			break;
			case "A": gradeVal = 4.00;
			break;
			case "A-": gradeVal = 3.67;
			break;
			case "B+": gradeVal = 3.33;
			break;
			case "B": gradeVal = 3.00;
			break;
			case "B-": gradeVal = 2.67;
			break;
			case "C+": gradeVal = 2.33;
			break;
			case "C": gradeVal = 2.00;
			break;
			case "C-": gradeVal = 1.67;
			break;
			case "D": gradeVal = 1.00;
			break;
		}
		return value;
	}
}