import java.util.Scanner;

public class Faiz_uygulaması {
private static final String String = null;

public static void main(String[] arg) {
	
	Scanner  faiz = new Scanner(System.in);
	String miktar  = "1 0-25.000 TL için\n"
	                +"2 25.000-100.000TL için\n"
			        +"3 100.000-250.000 için\n"
	                +"4 250.000-500.000 için\n"
			        +"5 500.000-1.000.000 için\n";
    String oran =    "6 0-32 gün için faiz oranı %19.75\n"
    		        +"7 33-181 gün için faiz oranı %20.25\n"
    		        +"8 182-366 gün için faiz oranı %21\n";
    System.out.println("**********************************");
    System.out.println(miktar);
    System.out.println("**********************************");
    System.out.println(oran);
    System.out.println("**********************************");
    
    System.out.print("\nLütfen yatırmak istediğiniz tutarı giriniz :");
	String tutar= faiz.nextLine();
	
	
	System.out.print("Lütfen yatırmak istediğiniz vadeyi yazınız : ");
	String vade = faiz.nextLine();
	
	double tutar1 = Double.valueOf(tutar);  
	
	double  vade1 = Double.valueOf((vade));   
	
	//double vadesonu1 = tutar1*19.75/100*0.95*vade1/365;
	 
 while(true) {
	 if(vade1>366) {
			System.out.println("En fazla vade günümüz 366 gündür. Lütfen yeni vade seçiniz...");
		}

		if(tutar1 <=25000 && vade1 <= 32){
    		
    		System.out.println("Anapara : " +tutar1+ "\nFaizden kazancınız : " + (tutar1*19.75/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*19.75/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*19.75/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*19.75/100*0.95*vade1/365));
    		break;
		}else if(tutar1<=25000 && vade1 <=181) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*19.85/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*19.85/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*19.85/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*19.85/100*0.95*vade1/365));
			break;
		}
		else if(tutar1<=25000 && vade1 <=366) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*20/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*20/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*19.75/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*20/100*0.95*vade1/365));
			break;
		}
		else if(tutar1<=100000 && vade1 <=32) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*19.85/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*19.85/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*19.85/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*19.85/100*0.95*vade1/365));
			break;
		}
		else if(tutar1<=100000 && vade1 <=181) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*19.95/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*19.95/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*19.95/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*19.95/100*0.95*vade1/365));
			break;
		}
		else if(tutar1<=100000 && vade1 <=366) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*20.10/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*20.10/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*20.10/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*20.10/100*0.95*vade1/365));
			break;
		}
		else if(tutar1<=250000 && vade1 <=32) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*19.95/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*19.95/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*19.95/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*19.95/100*0.95*vade1/365));
			break;
		}
		else if(tutar1<=250000 && vade1 <=181) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*20.05/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*20.05/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*20.05/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*20.05/100*0.95*vade1/365));
			break;
		}
		else if(tutar1<=250000 && vade1 <=366) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*20.20/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*20.20/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*20.20/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*20.20/100*0.95*vade1/365));
			break;
		}
		else if(tutar1<=500000 && vade1 <=32) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*20.05/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*20.05/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*20.05/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*20.05/100*0.95*vade1/365));
			break;
		}
		else if(tutar1<=500000 && vade1 <=181) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*20.15/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*20.15/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*20.15/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*20.15/100*0.95*vade1/365));
			break;
		}
		else if(tutar1<=500000 && vade1 <=366) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*20.30/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*20.30/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*20.30/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*20.30/100*0.95*vade1/365));
			break;
		}
		else if(tutar1<=1000000 && vade1 <=32) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*20.15/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*20.15/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*20.15/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*20.15/100*0.95*vade1/365));
			break;
		}
		else if(tutar1<=1000000 && vade1 <=181) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*20.25/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*20.25/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*20.25/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*20.25/100*0.95*vade1/365));
			break;
		}
		else if(tutar1<=1000000 && vade1 <=366) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*20.40/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*20.40/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*20.40/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*20.40/100*0.95*vade1/365));
			break;
		}
		else if(tutar1>1000000 && vade1 <=32) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*20/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*20/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*20/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*20/100*0.95*vade1/365));
			break;
		}
		else if(tutar1>1000000 && vade1 <=181) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*20.10/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*20.10/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*20.10/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*20.10/100*0.95*vade1/365));
			break;
		}
		else if(tutar1>1000000 && vade1 <=366) {
			System.out.println("Anapara : " +tutar1+"\nFaizden kazancınız : " + (tutar1*20.25/100*vade1/365)+"\nKesilen vergi tutarı : " + (tutar1*20.25/100*0.05*vade1/365) + "\nFaizden net kazancınız : " + (tutar1*20.25/100*0.95*vade1/365) + "\nVade sonu  net bakiyen : " + (tutar1+tutar1*20.25/100*0.95*vade1/365));
			break;
		}
		else if( vade1 >366) {
			System.out.println("En fazla 366 gün vadeli yapılabiliyor. Lütfen yeni vade seçiniz.");
			break;
		}
		
	
    }
	
}
}
