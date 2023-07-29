
public class Fibonacci3 {
	int[] fibonacciSeries(int n) {
		int []arr=new int[n];
		
		arr[0]=0;
		arr[1]=1;
		
		int nextNo;
		
		if(n==1) {
			return arr;
		}
		else if(n==2) {
			return arr;
		}
		else {
			
			for(int i=3;i<=n;i++) {
			    nextNo = arr[0]+arr[1];
				arr[0] = arr[1];
				arr[1] = nextNo;
			    //return nextNo;
			}
			return arr;
		}
	}
}
