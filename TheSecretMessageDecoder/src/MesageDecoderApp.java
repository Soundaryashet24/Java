import java.util.Scanner;

public class MesageDecoderApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a character:");//Uni-code Transitional Format(UTF) - character set contains binary digits 16bits
	char ch = scan.next().charAt(0);
	MessageDecoder decoder = new MessageDecoder();
	System.out.println(decoder.decodeCharacter(ch));
	scan.close();
}
}
