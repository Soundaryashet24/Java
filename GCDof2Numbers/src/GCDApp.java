import java.util.Scanner;

public class GCDApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter 2 numbers to find GCD:");
	int m = scan.nextInt();
	int n = scan.nextInt();
	//GCD gcd = new GCD();
	//int res = gcd.findGCD(m, n);
	int res = GCD1.findGCD(m, n);
	System.out.println("The GCD of "+m+" and "+n+" is "+res);
}
}
