import java.util.Scanner;

public class Solution2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number till where the number divisible by 2 should be printed:");
	int num = scan.nextInt();
	divisibleBy2(num);
}
public static void divisibleBy2(int num) {
	for(int i=0;i<=num;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
}
}
