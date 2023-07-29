import java.util.Scanner;

public class Solution4 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number till where the number divisible by 5 should be printed:");
	int num = scan.nextInt();
	divisibleBy5(num);
}
public static void divisibleBy5(int num) {
	for(int i=0;i<=num;i++) {
		if(i%5==0) {
			System.out.println(i);
		}
	}
}
}
