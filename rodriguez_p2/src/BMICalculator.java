/*
Program calculates the users BMI and displays what category they fall under.
Ask User which formula they want to use to calculate BMI.
Calculate the height and weight of the user.
Print the results + a chart that shows BMI.
*/

import java.util.Scanner;

public class BMICalculator {
	
	Scanner getData = new Scanner (System.in);
	int kiloGrams,meters,pounds,inches,option;
	float BMI;
	String results = "";

	public static void main(String[] args) {
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}

	private void displayBmi() {
		getBmiCategory();
		caculateBmiCategory();
		getBmi();
	}

    private void calculateBmi() {
    	
	float poundsForumula, kilogramsFormula;
	if (option == 1) {
	poundsForumula = (float) ((703 * pounds) / Math.pow(inches, 2));
	BMI = poundsForumula;
	}else if (option == 2) {
	kilogramsFormula = (float) (kiloGrams / Math.pow(meters, 2));
	BMI = kilogramsFormula;
	}	
 }

	public void readUserData() {
		readUnitType();
		readMeasurementData();
	}
	
	private void readUnitType () {
		int i =0;
		while (i!=1) {
			if (option == 1) {
				break;
			}else if (option == 2) {
				break;
			}else {
				readMetricData();
			}
		}
		
	}
	
	private void readMeasurementData () {
		getHeight();
		getWeight();
	}

	private void readMetricData () {
		char c;
		System.out.print("Would you like to use meters and kilograms to caculate BMI (y/n): ");
		c = getData.next().charAt(0);
		 if (c == 'y') {
			option = 1;
		}else {
			readImperialData();
		}
	}
	
	private void readImperialData () {
		char c;
		System.out.print("Would you like to use inches and pounds (y/n): ");
		c = getData.next().charAt(0);
		if (c == 'y') {
			option = 2;
		}else {
			readMetricData();
		}
	}
	
	private void caculateBmiCategory () {
		if (BMI < 18.5) {
			results = "Underweight";
		}else if (BMI >= 18.5 && BMI <=24.9) {
			results = "Normal weight";
		}else if (BMI >=25 && BMI <=29.9) {
			results = "Overwight";
		}else if (BMI >=30) {
		    results = "Obesity";
		}
	}
	
	public void getWeight () {
	if (option == 1) {	
		System.out.print("Enter weight in pounds: ");
		pounds = getData.nextInt();
	}else if (option == 2){
		System.out.print("Enter weight in kiloGrams: ");
		kiloGrams = getData.nextInt();
   }
	if (pounds < 0 || kiloGrams <0 ) {
		System.out.print("Invalid cant be negative");
		System.exit(0);
	}
	
	}
	
	
	public void getHeight () {
		if (option == 1) {
		System.out.print("Enter height in inches: ");
		inches = getData.nextInt();
		}else if (option == 2) {
		System.out.print("Enter height in meters: ");	
		meters = getData.nextInt();
		}
		
		if (inches < 0 || meters <0 ) {
			System.out.print("Invalid cant be negative");
			System.exit(0);
		}
		
	}
	
	
	public void getBmi () {
		System.out.printf("Bmi is: %.2f \n", BMI);
		System.out.println("BMI category is: " + results);
	}
	
	public void getBmiCategory () {
		System.out.println("BMI Categories:");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = < BMI of 30 or greater");
		
	}
}