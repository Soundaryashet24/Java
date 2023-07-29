import java.util.Scanner;

public class Solution7 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number till where prime numbers are to be printed:");
	int num = scan.nextInt();
	if(num>2) {
		for(int i=3;i<=num;i++) {
			int res = checkPrime(i);
			if(res!=0) {
				System.out.println(res);
			}
		}
	}
	else {
		System.out.println("Enter number greater than 2");
	}
	
}
public static int checkPrime(int number) {
	for(int i=2;i<number;i++) {
		if(number%i==0) {
			return 0;
		}
	}
	return number;
}
}
