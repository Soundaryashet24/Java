import java.util.Scanner;

public class FibonacciApp2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number to calculate fibonacci series:");
	int n = scan.nextInt();
	Fibonacci2 fb = new Fibonacci2();
	String res = fb.fibonacciSeries(n);
	System.out.println();
	System.out.println(res);
}
}
