import java.util.Scanner;//not proper

public class FibonacciApp3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to calculate fibonacci series:");
		int n = scan.nextInt();
		Fibonacci3 fb = new Fibonacci3();
		int res[]=fb.fibonacciSeries(n);
		System.out.println(res);
	}
}
