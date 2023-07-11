import java.util.Scanner;

public class CubeMystery {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter number:");
	int num = scan.nextInt();
	System.out.println(cubeNumber(num));
	scan.close();
}
public static int cubeNumber(int num) {
	return num*num*num;
}
}
