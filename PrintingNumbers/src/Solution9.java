import java.util.Scanner;

public class Solution9 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number till where the odd numbers divisible by 5 should be printed:");
	int num = scan.nextInt();
	oddDivisibleBy5(num);
}
public static void oddDivisibleBy5(int num) {
	for(int i=0;i<=num;i++) {
		if(i%2!=0) {
			if(i%5==0) {
				System.out.println(i);
			}
				
		}
	}
}
}
