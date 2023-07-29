import java.util.Scanner;

public class SumOfNumbersApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number to calculate sum of it's digits;");
	int n = scan.nextInt();
	SumOfNumbers sum1 = new SumOfNumbers();
	int res = sum1.sumFunction(n);
	System.out.println("The result is:"+res);
}
}
