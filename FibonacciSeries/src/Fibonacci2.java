//return value accept parameters - 4th type
public class Fibonacci2 {
String fibonacciSeries(int n) {
	int fib1=0;
	int fib2=1;
	int nextNo;
	if(n==0) {
		System.out.println("please enter number starting from 1");
		return "Completed";
	}
	else if(n==1) {
		System.out.println(fib1+"");
		return "Completed";
	}
	else if(n==2) {
		System.out.println(fib1+" "+fib2);
		return "Completed";
	}
	else {
		System.out.print(fib1+" "+fib2+" ");
		for(int i=3;i<=n;i++) {
			nextNo = fib1+fib2;
			fib1 = fib2;
			fib2 = nextNo;
			System.out.print(nextNo+" ");
			
		}
		return "Completed";
	}
}
}
