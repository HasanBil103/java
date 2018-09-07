import java.util.Scanner;

public class Kullanici_Giris_Kontrolu {

	public static void main(String[] arg){
		
		Scanner giris = new Scanner(System.in);		
		int giris_hakki = 3;
		String sys_kullanici_adi = "Hasan Özgün";
		String sys_kullanici_parola = "12345";
		System.out.println("****************************");
		System.out.println("Sisteme hoşgeldiniz...");
		System.out.println("****************************");
		
		while(true) {
			System.out.print("\nKullanıcı Adı Giriniz:");
			String kullanıcı = giris.nextLine();
			System.out.print("Kullanıcı Parolası Giriniz : ");
			String parola = giris.nextLine();
			
			if(kullanıcı.equals(sys_kullanici_adi) & parola.equals(sys_kullanici_parola) ) {
				
				System.out.println("Sisteme Hoşgeldiniz ");
				
			}
			else if(kullanıcı.equals(sys_kullanici_adi) & !parola.equals(sys_kullanici_parola)) {
				
			System.out.println("Parola hatalı. Lütfen tekrar deneyiniz...");
			giris_hakki -= 1;
			System.out.print("Kalan giriş hakkınız : " +giris_hakki);
			}
			else if(!kullanıcı.equals(sys_kullanici_adi) & parola.equals(sys_kullanici_parola)) {
				
				System.out.println("Kullanıcı adı hatalı. Lütfen tekrar deneyiniz...");	
				giris_hakki -= 1;
				System.out.print("Kalan giriş hakkınız : " +giris_hakki);
				}
			else  {
				
				System.out.println("Kullanıcı adı ve parola hatalı. Lütfen tekrar deneyiniz...");	
				giris_hakki -= 1;
				System.out.print("Kalan giriş hakkınız : " +giris_hakki);
				}
			if (giris_hakki==0) {
				System.out.print("\nGiriş Hakkınız bitti. Daha sonra tekrar bekleriz...");
				break;
			}
		
		}
	}
}
