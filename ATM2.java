import java.util.Scanner;

public class ATM2 {
public static void main(String[] arg) {
	
	Scanner para = new Scanner(System.in);
	double bakiye = 1349;
	
	String islemler = "\n\n1. işlem bakiye öğrenme\n"
			         +"2. işlem para çekme\n"
			         +"3. işlem para yatırma\n"
			         +"Çıkış için x'e basın...";
	System.out.print("*****************************");
	System.out.print(islemler);
	System.out.print("\n\n*****************************");
	
	while(true) {
		System.out.print("\nİşleminizi seçiniz : ");
		String islem = para.nextLine();
		
		if(islem.equals("q")) {
			System.out.print("Sistemden çıkılıyor...");
			break;
		}
		else if(islem.equals("1")) { 
			System.out.println("Bakiyeniz : " +bakiye);
		}
		
		else if(islem.equals("2")) { 
			System.out.println("Cekmek istediğiniz tutar ne kadar : ");
			int tutar = para.nextInt();
			para.nextLine();
			if(bakiye-tutar<0) {
				System.out.println("Yeterli bakiyeniz yoktur.  Bakiyeniz : " +bakiye);
			continue;
			}
			else {
				bakiye-=tutar;
				System.out.print("Bakiyeniz : " +bakiye);
				
			}continue;
		}
		
		
		else if(islem.equals("3"))  {
			System.out.println("Yatırmak istediğiniz tutar : ");
			int tutar = para.nextInt();
			para.nextLine();
			bakiye += tutar;
			System.out.println("Bakiyeniz : " +bakiye);
		}
		else {
			System.out.print("Geçersiz işlem Lütfen yeni işlem seçiniz...");}

	}
	
}
}
