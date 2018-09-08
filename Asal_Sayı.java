import java.util.Scanner;



public class Asal_Sayı {
	
	private static int sayi1;
	public static int tumasal(int sayi) {
		Scanner asal = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz : ");
		int sayi1 = asal.nextInt();
		//System.out.println("2");
		
		for(int x=3; x<sayi1; x++) {
			
			for(int y=2; y<x; y++){
				
				if(x%y==0) {
					//System.out.println( "Sayı asal değildir");
					break;
				}
				else if(y==x-1){
					System.out.println(x );	
				}	
				
			}
		}
		return sayi1;
	}
	
	private static int sayi3;
	private static Scanner asal2;
	public static int asal2(int sayi2) {
		Scanner asal2 = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz : ");
		int sayi3 = asal2.nextInt();
		
		for(int i=3; i<sayi3; i++) {
			
			if(sayi3%i==0) {
				System.out.println(sayi3  +"Sayı asal değildir");
				break;
			}
			else if(i==(sayi3-1)){
				System.out.println(sayi3 +" Asal Sayıdır...");
			}
			
		}
		return sayi3;
	}
	
	
	public static void main(String[] arg) {
		String islem = "1. 1'den sayıya kadar olan asalları bulma\n"
			          +"2. Sayı asal mı değil mi bulma";
System.out.print("********************************\n");
System.out.println(islem);
System.out.println("********************************");
while(true) {
Scanner asal = new Scanner(System.in);
System.out.println("Lütfen yapmak sitediğiniz işlemi seçiniz : ");
int islemler = asal.nextInt();

if(islemler ==1) {
		System.out.println(tumasal(sayi1));
}
else if(islemler ==2)	{
		
	System.out.println(asal2(sayi3));
}
else if(!(islemler ==1)||(islemler ==2)){
	System.out.println("Yanlış işlem seçtiniz. Lütfen yeni işlem seçiniz...");
	
}
else {
	
	break;
}
	}
	}

}
