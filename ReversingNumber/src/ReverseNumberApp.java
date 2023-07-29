import java.util.Scanner;

public class ReverseNumberApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number:");
	int n= scan.nextInt();
	ReverseNumber reverseNum = new ReverseNumber();
	int res = reverseNum.reverse(n);
	System.out.println("The reversed number is:"+res);
	if(n==res) {
		System.out.println("Entered number "+n+ " is palindrome");
	}
	else {
		System.out.println("Entered number "+n+ " is not palindrome");
	}
}
}
