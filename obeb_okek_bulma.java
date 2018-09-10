package obeb_okek_bulma;

import java.util.Scanner;

public class obeb {

	public static void main(String[] args) {
		Scanner ebob = new Scanner(System.in);
		System.out.print("Lütfen bir sayı giriniz : ");
		int x1 = ebob.nextInt();
		System.out.print("Lütfen bir sayı giriniz : ");
		int x2 = ebob.nextInt();
		int topebob = 1;
		
		for(int i=2; i<x1&&i<x2; i++) {
			
			if(x1%i==0&&x2%i==0) {
				
				topebob =i;
				System.out.println(x2 +" ve "+ x2 +" ebobları " +topebob);
			}
			
		}
		Scanner ekok = new Scanner(System.in);
		System.out.print("Lütfwn bir sayi giriniz : ");
		int y1 = ekok.nextInt();
		System.out.print("Lütfwn bir sayi giriniz : ");
		int y2 = ekok.nextInt();
		int topekok =1;
		for(int i=2; i<=y1&&i<=y2; i++) {
			if(y1%i==0 && y2%i !=0) {
              y1 /=i;
            
			 }
              else if(y2%i ==0 && y1%i !=0) {
            	  y2 /= i;
            	 
			}
              else if(y1%i==0 && y2%i==0) {
            	  y1 /= i; y2 /= i;
            	 
              }
		 topekok *=i;
		 System.out.println(y1 +" ve " +y2+ " ekokları " +topekok);
		}
		
		
		
	}
}
