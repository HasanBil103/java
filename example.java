package example;

import java.util.Scanner;

public class example {


private static int ort1;
private static int ort2;
private static int ort3;
private static int ort4;
private static int ort5;
private static int ort6;

public static void main(String[] arg) {
	
	/*int x =0 , y = 0;
	Scanner sayi = new Scanner(System.in);
	System.out.print("Lütfen bir sayı giriniz:");
	 x = sayi.nextInt();
	System.out.print("Lütfen bir sayı daha giriniz:");
	y = sayi.nextInt();
	System.out.println(x+ "   Eşittir       "+y+"   "+ (x==y));
	System.out.println(x+"   Eşit değil    "+y+"   "+(x!=y));
	System.out.println(x+"   Küçüktür      "+y+"   "+(x<y));
	System.out.println(x+"   Küçük değil   "+y+"   "+(x<=y));
	System.out.println(x+"   Büyüktür      "+y+"   "+(x>y));
	System.out.println(x+"   Büyük değil   "+y+"   "+(x>=y)); */
	
	
	/*Scanner yas = new Scanner(System.in);
	System.out.print("İsminiz Lütfen : ");
    String isim = yas.nextLine();
	System.out.print("Lütfen Yaşınızı giriniz : ");
    int x = yas.nextInt();  
    if(x<18)
    {
    System.out.print("Yaşınız küçük olduğundan giremezsiniz!!!");
    }
    else
    	System.out.print("Hoşgeldiniz " +isim);*/
	
	
	/*Scanner sayi = new Scanner(System.in);
	System.out.print("Birinci vize notunuzu giriniz lütfen : ");
	int nt1 = sayi.nextInt();
	
	System.out.print("Birinci vize notunuzu giriniz lütfen : ");
	int nt2 = sayi.nextInt();
	System.out.print("Birinci vize notunuzu giriniz lütfen : ");
	int nt3 = sayi.nextInt();
	
	double not = nt1*0.2 + nt2*0.2 + nt3*0.6;
	
	if(not >=90)     {
		
		System.out.println("Ortalamanız : " +not+ "Notunuz : AA");
	}
	else if(not>=85){ 
		
		System.out.println("Ortalamanız : " +not+ "Notunuz : BB");
		
	}
	else if(not >=80) {
		
		System.out.println("Ortalamanız : " +not+ "Notunuz : BB");
		
	}
	else if(not >=75) {
		
		System.out.println("Ortalamanız : " +not+ "Notunuz : CB");
		
	}
	else if (not >=70) {
		
		System.out.println("Ortalamanız : " +not+ "Notunuz : CC");
	
	}
	else {
		
		System.out.println("Ortalamanız : " +not+ " Notunuz : FF ...  Dersten kaldınız...)");
		
	}*/
	
	double ort = (ort1+ort2+ort3+ort4+ort5+ort6)/6; ;
	Scanner islem = new Scanner(System.in);
	System.out.print("Ders seçiniz:");
	int not =islem.nextInt();
	
	
	
	
	
	
	

	
	switch(not) {
	
	case 1: {
		
		System.out.print("Lütfen 1. vize notunuzu giriniz : ");
		int vz11 = islem.nextInt();
		System.out.print("Lütfen 2. vize notunuzu giriniz : ");
		int vz12 = islem.nextInt();
		System.out.print("Lütfen final notunuzu giriniz : ");
		int fnl1 = islem.nextInt();
		
		ort1 = (int)(vz11*0.2 + vz11*0.2 + fnl1*0.6);
		
		if(ort1>=90) {
		System.out.print("Ortalamanız : "+ort1+ "\n Notunuz : AA");
		}
		
		else if(ort1>=85) {
		System.out.print("Ortalamanız : "+ort1+ "\n Notunuz : BA");
		}
		
		else if(ort1>=80) {
			System.out.print("Ortalamanız : "+ort1+ " \nNotunuz : BB");
			}
		
		else if(ort1>=75) {
			System.out.print("Ortalamanız : "+ort1+ " \nNotunuz : CB");
			}
		
		else if(ort1>=70) {
			System.out.print("Ortalamanız : "+ort1+ "\n Notunuz : CC");
			}
		
		else if(ort1>=60) {
			System.out.print("Ortalamanız : "+ort1+ " \nNotunuz : DC");
			}
		
		else if(ort1>=60) {
			System.out.print("Ortalamanız : "+ort1+ "\n Notunuz : DD");
			}
		
		else {
			System.out.print("Ortalamanız : "+ort1+ "\n Notunuz : FF");
			
	}
		
	}
	
	case 2:{
		
		System.out.print("\n\nLütfen 1. vize notunuzu giriniz : ");
		int vz21 = islem.nextInt();
		System.out.print("Lütfen 2. vize notunuzu giriniz : ");
		int vz22 = islem.nextInt();
		System.out.print("Lütfen final notunuzu giriniz : ");
		int fnl2 = islem.nextInt();
		ort2 = (int)(vz21*0.2 + vz22*0.2 + fnl2*0.6);
		
		
		if(ort2>=90) {
		System.out.print("Ortalamanız : "+ort2+ "\n Notunuz : AA");
		}
		
		else if(ort2>=85) {
		System.out.print("Ortalamanız : "+ort2+ "\n Notunuz : BA");
		}
		
		else if(ort2>=80) {
			System.out.print("Ortalamanız : "+ort2+ "\n Notunuz : BB");
			}
		
		else if(ort2>=75) {
			System.out.print("Ortalamanız : "+ort2+ "\n Notunuz : CB");
			}
		
		else if(ort2>=70) {
			System.out.println("Ortalamanız : "+ort2+ "\n Notunuz : CC");
			}
		
		else if(ort2>=60) {
			System.out.print("Ortalamanız : "+ort2+ "\n Notunuz : DC");
			}
		
		else if(ort2>=60) {
			System.out.println("Ortalamanız : "+ort2+ "\n Notunuz : DD");
			}
		
		else {
			System.out.print("\nOrtalamanız : "+ort2+ "\n Notunuz : FF");
			
	}
		
	}
		
case 3: {
		
		System.out.print("\n\nLütfen 1. vize notunuzu giriniz : ");
		int vz31 = islem.nextInt();
		System.out.print("Lütfen 2. vize notunuzu giriniz : ");
		int vz32 = islem.nextInt();
		System.out.print("Lütfen final notunuzu giriniz : ");
		int fnl3 = islem.nextInt();
		
		ort3 = (int)(vz31*0.2 + vz31*0.2 + fnl3*0.6);
		
		if(ort3>=90) {
		System.out.print("Ortalamanız : "+ort3+ "\n Notunuz : AA");
		}
		
		else if(ort3>=85) {
		System.out.print("Ortalamanız : "+ort3+ "\n Notunuz : BA");
		}
		
		else if(ort3>=80) {
			System.out.print("Ortalamanız : "+ort3+ " \nNotunuz : BB");
			}
		
		else if(ort3>=75) {
			System.out.print("Ortalamanız : "+ort3+ " \nNotunuz : CB");
			}
		
		else if(ort3>=70) {
			System.out.print("Ortalamanız : "+ort3+ "\n Notunuz : CC");
			}
		
		else if(ort3>=60) {
			System.out.print("Ortalamanız : "+ort3+ " \nNotunuz : DC");
			}
		
		else if(ort3>=60) {
			System.out.print("Ortalamanız : "+ort3+ "\n Notunuz : DD");
			}
		
		else {
			System.out.print("Ortalamanız : "+ort3+ "\n Notunuz : FF");
			
	}
		
	}
case 4: {
	
	System.out.print("\n\nLütfen 1. vize notunuzu giriniz : ");
	int vz41 = islem.nextInt();
	System.out.print("Lütfen 2. vize notunuzu giriniz : ");
	int vz42 = islem.nextInt();
	System.out.print("Lütfen final notunuzu giriniz : ");
	int fnl4 = islem.nextInt();
	
	 ort4 = (int)(vz41*0.2 + vz41*0.2 + fnl4*0.6);
	
	if(ort4>=90) {
	System.out.print("Ortalamanız : "+ort4+ "\n Notunuz : AA");
	}
	
	else if(ort4>=85) {
	System.out.print("Ortalamanız : "+ort4+ "\n Notunuz : BA");
	}
	
	else if(ort4>=80) {
		System.out.print("Ortalamanız : "+ort4+ " \nNotunuz : BB");
		}
	
	else if(ort4>=75) {
		System.out.print("Ortalamanız : "+ort4+ " \nNotunuz : CB");
		}
	
	else if(ort4>=70) {
		System.out.print("Ortalamanız : "+ort4+ "\n Notunuz : CC");
		}
	
	else if(ort4>=60) {
		System.out.print("Ortalamanız : "+ort4+ " \nNotunuz : DC");
		}
	
	else if(ort4>=60) {
		System.out.print("Ortalamanız : "+ort4+ "\n Notunuz : DD");
		}
	
	else {
		System.out.print("Ortalamanız : "+ort4+ "\n Notunuz : FF");
		
}
	
}
case 5: {
	
	System.out.print("\n\nLütfen 1. vize notunuzu giriniz : ");
	int vz51 = islem.nextInt();
	System.out.print("Lütfen 2. vize notunuzu giriniz : ");
	int vz52 = islem.nextInt();
	System.out.print("Lütfen final notunuzu giriniz : ");
	int fnl5 = islem.nextInt();
	
	 ort5 = (int)(vz51*0.2 + vz51*0.2 + fnl5*0.6);
	
	if(ort5>=90) {
	System.out.print("Ortalamanız : "+ort5+ "\n Notunuz : AA");
	}
	
	else if(ort5>=85) {
	System.out.print("Ortalamanız : "+ort5+ "\n Notunuz : BA");
	}
	
	else if(ort5>=80) {
		System.out.print("Ortalamanız : "+ort5+ " \nNotunuz : BB");
		}
	
	else if(ort5>=75) {
		System.out.print("Ortalamanız : "+ort5+ " \nNotunuz : CB");
		}
	
	else if(ort5>=70) {
		System.out.print("Ortalamanız : "+ort5+ "\n Notunuz : CC");
		}
	
	else if(ort5>=60) {
		System.out.print("Ortalamanız : "+ort5+ " \nNotunuz : DC");
		}
	
	else if(ort5>=60) {
		System.out.print("Ortalamanız : "+ort5+ "\n Notunuz : DD");
		}
	
	else {
		System.out.print("Ortalamanız : "+ort1+ "\n Notunuz : FF");
		
}
	
}
case 6: {
	
	System.out.print("\n\nLütfen 1. vize notunuzu giriniz : ");
	int vz61 = islem.nextInt();
	System.out.print("Lütfen 2. vize notunuzu giriniz : ");
	int vz62 = islem.nextInt();
	System.out.print("Lütfen final notunuzu giriniz : ");
	int fnl6 = islem.nextInt();
	
	 ort6 = (int)(vz61*0.2 + vz61*0.2 + fnl6*0.6);
	
	if(ort6>=90) {
	System.out.print("Ortalamanız : "+ort6+ "\n Notunuz : AA");
	}
	
	else if(ort6>=85) {
	System.out.print("Ortalamanız : "+ort6+ "\n Notunuz : BA");
	}
	
	else if(ort6>=80) {
		System.out.print("Ortalamanız : "+ort6+ " \nNotunuz : BB");
		}
	
	else if(ort6>=75) {
		System.out.print("Ortalamanız : "+ort6+ " \nNotunuz : CB");
		}
	
	else if(ort6>=70) {
		System.out.print("Ortalamanız : "+ort6+ "\n Notunuz : CC");
		}
	
	else if(ort6>=60) {
		System.out.print("Ortalamanız : "+ort6+ " \nNotunuz : DC");
		}
	
	else if(ort6>=60) {
		System.out.print("Ortalamanız : "+ort6+ "\n Notunuz : DD");
		}
	
	else {
		System.out.print("Ortalamanız : "+ort6+ "\n Notunuz : FF");
		
}
	break;
}
default:{
	System.out.print("\n\nYanlış ders seçimi yaptınız...");
	}
	}
	System.out.println("\n\n GNO : "+((ort1+ort2+ort3+ort4+ort5+ort6)/6));

}
	}
	


