import java.util.Scanner;

public class Main {
public static void calculateSumOfSeries(int n) {
	double sum=0;
	for(double i=1;i<=n;i++) {
		sum=sum+1/i;//int/double=double
	}
	System.out.println("Sum is:"+sum);
}
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number to calculate series of sum:");
	int n = scan.nextInt();
	calculateSumOfSeries(n);
	
}
}
