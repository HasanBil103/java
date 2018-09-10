
package obeb_okek_bulma;

import java.util.Scanner;

public class obeb_okek_bulma {

	public static void main(String[] args) {
		Scanner ebob = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz : ");
		int x1 = ebob.nextInt();
		System.out.print("Lütfen bir sayı giriniz : ");
		int x2 = ebob.nextInt();
		int topebob = 1;
		
		for(int i=2; i<x1&&i<x2; i++) {
			
			if(x1%i==0&&x2%i==0) {
				
				topebob =i; //X1 ve X2'ye bölüne bilen her i değerini alıyor topebob'a atıyor ama her yeni i değeri
				            // aldığında topebob değeri değişiyor taki en büyük ortak bölüneblen i değerini alana kadar
				            // En büyük i değerini alınca topebob ekrana onu basıyor...
				System.out.println(x2 +" ve "+ x2 +" ebobları " +topebob);
			}
			
		}
		Scanner ekok = new Scanner(System.in);
		System.out.print("Lütfen bir sayi giriniz : ");
		int y1 = ekok.nextInt();
		System.out.print("Lütfen bir sayi giriniz : ");
		int y2 = ekok.nextInt();
		int topekok =1;
		for(int i=2; i<=y1&&i<=y2; i++) {
	    //Şimdi burda 3 durum inceledik çünkü y1 e bölüne bilir i değeri y2'ye bölünemeyebilir tam tersi durumda olabilir
		//yada her ikisine birden bölünebilir.	
			if(y1%i==0 && y2%i !=0) {
              y1 /=i;  //sayi i'ye bölününce y1'in yeni değerini y1'e güncellemek zorundayız
            
			 }
              else if(y2%i ==0 && y1%i !=0) {
            	  y2 /= i;  //sayi i'ye bölününce y2'in yeni değerini y2'e güncellemek zorundayız
            	 
			}
              else if(y1%i==0 && y2%i==0) {
            	  y1 /= i; y2 /= i;  //sayi her ikisine bölününce y1 ve y2'nin yeni değerini güncellemek zorundayız
            	 
              }
		 topekok *=i;
		 System.out.println(y1 +" ve " +y2+ " ekokları " +topekok);
		}
	}
	}