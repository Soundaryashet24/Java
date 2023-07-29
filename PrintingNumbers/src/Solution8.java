import java.util.Scanner;

public class Solution8 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number till where the number divisible by 3 and which are even numbers should be printed:");
	int num = scan.nextInt();
	evenDivisibleBy3(num);
}
public static void evenDivisibleBy3(int num) {
	for(int i=0;i<=num;i++) {
		if(i%2==0) {
			if(i%3==0) {
				System.out.println(i);
			}
				
		}
	}
}
}
