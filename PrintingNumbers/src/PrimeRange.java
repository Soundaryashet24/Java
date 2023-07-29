import java.util.Scanner;

public class PrimeRange {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the range:");
	int n= scan.nextInt();
	int count=0;
	for(int i=3;i<=n;i++) {
		int res = checkPrime(i);
		if(res!=0) {
			System.out.println(res);
			count++;
		}
		
	}
	System.out.println("The total prime numbers are:"+count);
}
public static int checkPrime(int n) {
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			return 0;
		}
	}
	return n;
}
}
