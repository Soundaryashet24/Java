
public class SumOfNumbers {
int sumFunction(int n) {
	int sum=0;
	while(n!=0) {
		int rem = n%10;
		sum+=rem;
		n/=10;
	}
	return sum;
}
}
