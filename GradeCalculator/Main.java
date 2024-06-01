import java.util.*;
/**
 * @author tom
 * a class to test the GradeCalculator class
 * gradebook object is being created 
 * scanner class is being used to get keyboard input from user
 */
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type your project average: ");
		double pAverage = scan.nextDouble();
		System.out.println("Please type your zyBooks average: ");
		double zbookAverage = scan.nextDouble();
		System.out.println("Please type your lab average: ");
		double labAverage = scan.nextDouble();
		System.out.println("Please type your score for the first exam: ");
		int exam1 = scan.nextInt();
		System.out.println("Please type your score for the second exam: ");
		int exam2 = scan.nextInt();
		System.out.println("Please type your score for the third exam: ");
		int exam3 = scan.nextInt();
		System.out.println("Please type your score for the fouth exam: ");
		int exam4 = scan.nextInt();
		System.out.println("Please type the weight of the projects: ");
		double pWeight = scan.nextDouble();
		System.out.println("Please type the weight of the zyBooks: ");
		double zbWeight = scan.nextDouble();
		System.out.println("Please type the weight of the labs: ");
		double lWeight = scan.nextDouble();
		System.out.println("Please type the weight of the exams: ");
		double eWeight = scan.nextDouble();
		GradeCalculator gradebook = new GradeCalculator(pAverage,zbookAverage,labAverage,exam1,exam2,exam3,exam4);
		double average = gradebook.averageCaluclator(pWeight, zbWeight, lWeight, eWeight);
	}

}
