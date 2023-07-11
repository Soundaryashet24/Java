
public class ArithmeticOperationsApp {//boiler plate:constantly doing things repeatedly
public static void main(String[] args) {
	int res1=subtractNumbers(20, 5);

	int res2=multiplyNumbers(4, 5);

	double res3=divideNumbers(20, 4);

	int res4=findRemainder(10, 3);
	
	System.out.println(res1);
	System.out.println(res2);
	System.out.printf("%.2f\n",res3);//%.f -for 1 value after point
	System.out.println(res4);
}
public static int subtractNumbers(int num1, int num2) {
	return num1-num2;
}
public static int multiplyNumbers(int num1, int num2) {
	return num1*num2;
}
public static double divideNumbers(int num1, int num2) {
	return num1/num2;//int/int=int 22/7 = 3.0
}
public static int findRemainder(int num1, int num2) {
	return num1%num2;
}
}
