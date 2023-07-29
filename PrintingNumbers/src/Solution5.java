import java.util.Scanner;

public class Solution5 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number till where the number divisible by 2 and 5 should be printed:");
	int num = scan.nextInt();
	divisibleBy2And5(num);
}
public static void divisibleBy2And5(int num) {
	for(int i=0;i<=num;i++) {
		if(i%2==0) {
			if(i%5==0) {
				System.out.println(i);	
			}
			
		}
	}
}
}
