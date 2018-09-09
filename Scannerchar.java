import java.util.Scanner;
public class Scannerchar {
public static void main(String[] args) {
	for(int repeat = 0; repeat<10; repeat++) {
		char sc = 0;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a character: ");
	sc = input.next().charAt(0);
	
	 
	
	if (sc >= 'a' && sc <= 'z') {
		System.out.println("Lowercase");
	}
	if (sc >= 'A' && sc <= 'Z') {
		System.out.println("Uppercase");
	}
}
}
}