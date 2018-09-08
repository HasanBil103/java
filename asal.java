import java.util.Scanner;
public class asal {
public static void main (String[] args) {
	System.out.println("This program will check if your number is prime or not...");
	int asal;
	for(int tekrar = 0; tekrar<9; tekrar++) {
	Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number that you want to check: ");
	asal = input.nextInt();
	for( int i=1; i< asal; i++ ) {
	if(asal%i==0) {
		System.out.println("Your number is a prime number.");
	
	}
	else {
		System.out.println("Your number is not a prime number" + asal);
		
	}
	
	break;
	}
}
}
}