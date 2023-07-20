import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of sides to identify polygon:");
	int sides = scan.nextInt();
	identifyPolygon(sides);
}
public static void identifyPolygon(int sides) {
	if(sides>0) {
	switch(sides) {
	case 1:System.out.println("Point");
		break;
	case 2:System.out.println("Line");
		break;
	case 3:System.out.println("Triangle");
		break;
	case 4:System.out.println("Quadrilateral");
		break;
	case 5:System.out.println("Pentagon");
		break;
	case 6:System.out.println("Hexagon");
		break;
	case 7:System.out.println("Heptagon");
		break;
	case 8:System.out.println("Octagon");
		break;
	case 9:System.out.println("Nonagon");
		break;
	case 10:System.out.println("Decagon");
		break;
	
	default:System.out.println("Polygon");
		break;
	
	}
	}
	else {
		System.out.println("Please check your eyes");
	}
}
}
