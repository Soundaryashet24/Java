import java.util.Scanner;

public class Solution3 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number till where the number divisible by 3 should be printed:");
	int num = scan.nextInt();
	divisibleBy3(num);
}
public static void divisibleBy3(int num) {
	for(int i=0;i<=num;i++) {
		if(i%3==0) {
			System.out.println(i);
		}
	}
}
}
