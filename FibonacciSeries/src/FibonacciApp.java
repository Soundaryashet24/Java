import java.util.Scanner;

public class FibonacciApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number to calculate fibonacci series:");
	int n = scan.nextInt();
	Fibonacci fb = new Fibonacci();
	fb.fibonacciSeries(n);
}
}
