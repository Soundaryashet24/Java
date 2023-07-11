import java.util.Scanner;

public class FinanceCalculatorApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter principal amount, rate and time to calculate simple interest:");
	double principal = scan.nextDouble();
	double rate = scan.nextDouble();
	double time = scan.nextDouble();
	FinanceCalculator calculator = new FinanceCalculator();
	System.out.printf("%.2f",calculator.calculateSimpleInterest(principal, rate, time));
	scan.close();
	}
}
