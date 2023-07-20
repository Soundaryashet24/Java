import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter product code:");
	String productCode = scan.next();
	getProduct(productCode);
	}
public static void getProduct(String productCode) {
	switch(productCode) {
	case "p01":System.out.println("Coca-Cola");
		break;
	case "p02":System.out.println("Thumbs up");
		break;
	case "p03":System.out.println("Mazaa");
		break;
	case "p04":System.out.println("Mountain-dew");
		break;
	default:System.out.println("Bindu Jal-jeera");
		break;
	
	}
}
}
