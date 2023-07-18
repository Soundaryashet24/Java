import java.util.Scanner;

public class Factors {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number to find factors:");
	int n= scan.nextInt();
	int count=0;
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			System.out.println(i + " is factor of "+n);
			count++;
		}
	}
	System.out.println("Total fcators of "+n+" are "+count);
	
}
}
