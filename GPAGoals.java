import java.util.ArrayList;
import java.util.Scanner;

public class GPAGoals {

	public static void main(String[] args) {
		//List of Pair objects containing user's known grades 
		//paired with their credits
		ArrayList<Pair> courses = new ArrayList<Pair>();
		//list of credit values that we need to pair with possible grades
		ArrayList<Integer> unknown = new ArrayList<Integer>();

		//Prompt user to enter credits and grade for their courses one by one
		Scanner input = new Scanner(System.in);
		
	}

	//calculates possible grades for each credit in unknown 
	//that causes all courses to collectively meet goal GPA
	//returns an ArrayList of lists of possibilities
	public static ArrayList<ArrayList<Character>> calcPaths(ArrayList<Pair> 
		courses, ArrayList<Integer> unknown) {
		ArrayList<ArrayList<Character>> paths = new ArrayList<ArrayList<Character>>();

		return paths;
	}
}