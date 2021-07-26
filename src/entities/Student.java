package entities;

public class Student {
	
	//public double[] grade;
	public double grade1,grade2,grade3;
	public String name = "";
	public String status ="";
	public double finalGrade = 0.00;
	public double missingGrade = 0.00;
	
	public double finalGradeCalc() {
		
		//finalGrade = grade[0]+grade[1]+grade[2];
		finalGrade = grade1+grade2+grade3;
		return finalGrade;
	}
	
	public void result() {
		
		if (finalGrade < 60 ) {
			status = "FAILED";
			missingGrade = 60.00 - finalGrade;
		}else {
			status = "PASSED";
		}
		
	}
	
	
	public String toString() {
		if (status == "PASSED") {
			return "FINAL GRADE: " + String.format("%.2f",finalGrade) + "%n Status: " + status;
		}else {
			return "FINAL GRADE: " + String.format("%.2f",finalGrade) + "%n Status: " + status + "%n MISSING: " + String.format("%.2f",missingGrade) + "POINTS";
		}
	}

}
