
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
		int max = 0; int min =0;
		if(y1>y2) {    // büyük olan sayıyı bulmaya çalışıyoz 
			max = y1;
			min = y2;
		}
		else {
			max = y2;
			min = y1;
		}
		for(int i=max; i>=1; i--) {      //i'yi 1 den değilden max sayıdan başladıyoz ve işlem bittikten sonra da i'yi
			                            // azalta azalta gifiyoz(i--)
	    
			if(max%i==0 && min%i==0) {   // her ikisayıyı bölebilen en büyük sayı bulduğumuzda bu aslında ebob oluyor.
				                         //iki sayıyı çarpıp obeb'ine böldüğümüz zaman ekok'unu buluruz. 
			topekok = (y1*y2)/i;
			break;
			}
		 
		}
			System.out.println(y1 +" ve " +y2+ " ekokları " +topekok);
	}
	}