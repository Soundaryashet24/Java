import java.util.Scanner;

public class HalveNumberApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number :");
	double num = scan.nextDouble();
	System.out.printf("%.2f",halveTheNumber(num));
	scan.close();
}
public static double halveTheNumber(double num) {
	return num/2;
}
}
