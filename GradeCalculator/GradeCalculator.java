
/**
 * The class calculates the yearly average of the CS121 class.
 * @author tom
 *
 */
public class GradeCalculator {
	//creating four int data types that stores exam grades 
	private int exam1 = 0;
	private int exam2 = 0;
	private int exam3 = 0;
	private int exam4 = 0;
	//creating three double data types to store averages 
	private double labAverage = 0.0;
	private double zyBooksAverage = 0.0;
	private double projectAverage = 0.0;

	/**
	 * Constructor is created, with all the parameters passed in. 
	 * @param projectAverage
	 * @param zyBooksAverage
	 * @param labAverage
	 * @param exam1
	 * @param exam2
	 * @param exam3
	 * @param exam4
	 */
	public GradeCalculator(double projectAverage, double zyBooksAverage, double labAverage,int exam1, int exam2, int exam3, int exam4) {
		this.labAverage = labAverage;
		this.zyBooksAverage = zyBooksAverage;
		this.projectAverage = projectAverage;
		this.exam1 = exam1;
		this.exam2 = exam2;
		this.exam3 = exam3;
		this.exam4 = exam4;
	} 

	/**
	 * Setter for zyBooksAverage.
	 * @param zyBooksAverage
	 */
	public void setzyBooksAverage(double zyBooksAverage) {
		this.zyBooksAverage = zyBooksAverage;
	}

	/**
	 * Getter for getting zyBooksAverage
	 * @return double 
	 */
	public double getZyBookAverage() {
		return zyBooksAverage;
	}

	/**
	 * Setter for projectAverage.
	 * @param projectAverage
	 */
	public void setProjectAverage(double projectAverage) {
		this.projectAverage = projectAverage;
	}

	/**
	 * Getter for getting projectAverage
	 * @return double
	 */
	public double getProjectAverage() {
		return projectAverage;
	}

	/**
	 * Setter for labAverage 
	 * @param labAverage
	 */
	public void setLabAverage(double labAverage) {
		this.labAverage = labAverage;
	}

	/**
	 * Getter for getting labAverage
	 * @return double
	 */
	public double getLabAverage() {
		return labAverage;
	}

	/**
	 * Setter for exam1. 
	 * @param exam1
	 */
	public void setExam1(int exam1) {
		this.exam1 = exam1;
	}

	/**
	 * Getter for getting exam1 
	 * @return int
	 */
	public int getExam1() {
		return exam1;
	}

	/**
	 * Setter for exam2
	 * @param exam2
	 */
	public void setExam2(int exam2) {
		this.exam2 = exam2;
	}

	/**
	 * Getter for exam2
	 * @return int
	 */
	public int getExam2() {
		return exam2;
	}

	/**
	 * Setter for exam3
	 * @param exam3
	 */
	public void setExam3(int exam3) {
		this.exam3 = exam3;
	}

	/**
	 * Getter for exam3 
	 * @return int 
	 */
	public int getExam3() {
		return exam3;
	}

	/**
	 * Setter for exam4
	 * @param exam4
	 */
	public void setExam4(int exam4) {
		this.exam4 = exam4;
	}

	/**
	 * Getter for exam4
	 * @return int
	 */
	public int getExam4() {
		return exam4;
	}

	/**
	 * function is used to calculate the exam average 
	 * @return double 
	 */
	public double getExamAverage() {
		return (exam1 + exam2 + exam3 + exam4)/4;

	}

	/**
	 * Calculator that calculates all the averages and also checks if the weights of all 4 componets adds to 1
	 * if they adds up to 1, the letter grade and numerical grade is printed out 
	 * if not, it would print out -1
	 * @param projectWeight
	 * @param zyBooksWeight
	 * @param labWeight
	 * @param examWeight
	 * @return double 
	 */
	public double averageCaluclator(double projectWeight, double zyBooksWeight, double labWeight, double examWeight){
		char letterGrade;
		double totalWeight = labWeight + zyBooksWeight +  projectWeight + examWeight;
		double examAverage = (double)(exam1 + exam2 + exam3 + exam4)/4;
		double average = (projectWeight*projectAverage) + (zyBooksWeight*zyBooksAverage) + (labWeight*labAverage) + ( examWeight*examAverage);

		// conditonal statements that determines what letter grade should be printed out with the average.
		if(examAverage < 50 || average < 60) {
			//this means that if the examAverage is below 50 or yearlyAverage is below 60, the letterGrade will be assigned "F"
			letterGrade = 'F';	
		}else if(average >= 60 && average < 70) {
			//this means that if the yearlyAverage is in the range of [60,70), then the letterGrade assigned will be "D"
			letterGrade = 'D';
		}else if(average >= 70 && average < 80) {
			//this means that if the yearlyAverage is in the range of [70,80), then the letterGrade assigned will be "C"
			letterGrade = 'C';
		}else if(average >= 80 && average < 90) {
			//this means that if the yearlyAverage is in the range of [80,90), then the letterGrade assigned will be "B"
			letterGrade = 'B';
		}else{
			//this means that if the yearlyAverage greater than or equal to 90, then the letterGrade assigned will be "A"
			letterGrade = 'A';
		} 

		if(totalWeight != 1.0) {
			average = -1.0;
			System.out.println(average); 
		}else {
			System.out.println("This student's average in CS121 in letter grades: " + letterGrade);
			System.out.printf("This student's average in CS121 in letter grades: %.2f\n" ,average);
		}

		return average;
	}

}


