//Object for storing a credit, grade, and name of a course
public class Course {
	private double credit;
	private double gradeVal;
	private String name;

	//constructor for courses with known grades
	//name does not matter (will not be outputted)
	public Course(double cr, String grade) {
		credit = cr;
		gradeVal = calcGradeVal(grade);
		name = null;
	}

	//constructor for courses with unknown grades
	//gradeVal initiated to 0.00
	public Course(String n, double cr) {
		credit = cr;
		name = n;
		gradeVal = 0.00;
	}

	//calculates gradeVal of a grade based on the grade
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

	//accessor methods
	public double getVal() {
		return gradeVal;
	}

	public double getCredit() {
		return credit;
	}

	public String getName() {
		return name;
	}
}