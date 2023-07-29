import java.util.Scanner;

public class Solution1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number greater than 100:");
	int num = scan.nextInt();
	printNumbers(num);
}
public static void printNumbers(int num) {
	if(num>100) {
		for(int i=1;i<=num;i++) {
			System.out.println(i);
		}
	}
	else {
		System.out.println("Please read message properly and rerun");
	}
	
}
}
