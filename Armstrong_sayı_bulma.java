import java.util.Scanner;

public class Armstrong_sayı_bulma {
	public static void main (String[] arg) {
	
		Scanner arm = new Scanner(System.in);
		System.out.print("Bir sayı giriniz lütfen : ");
		int sayi = arm.nextInt();
		int gecici = sayi;
		int top = 0;
		
		do {
			top += ((sayi%10)*(sayi%10)*(sayi%10));
			sayi /= 10;
			System.out.println("Sayınız : " +sayi);
			
		}
		while(sayi>0); {
			System.out.println("Sayıların rakamları toplamı : " +top);
		}
		if(gecici == top) {
			System.out.println("Sayınız amstrong sayıdır...");
		}
		else
			System.out.println("Sayınız amstrong sayı değildir...");
	}
}
