package CalcEngine;

public class CalcEngine {
	
	public double returnCalcEngine(double initialValue, double Years,
			double annualInterestRate) {
		return (int) initialValue * Math.pow(1 +
				((annualInterestRate / (100 * 12))), Years * 12);
	}
}
