package ebob_ekok_bulma2;

import java.util.Scanner;

public class ebob_ekok_bulma2 {
	
	


	


	
	private static int x1;
	private static int x2;


	public static int ebob_bulma(int x1, int x2) {
		 
			int topebob = 1;
			
			for(int i=2; i<x1&&i<x2; i++) {
				
				if(x1%i==0&&x2%i==0) {
					
					topebob =i; 
					
				}
				}
			return topebob;
	 }
	 
	 public static int ekok_bulma(int y1, int y2) {
    	
    		
		 int topekok = 0 ; int max  ,  min ;
		
		 if(y1>y2) {
			 max = y1;
			 min = y2;
		 }
		 else {
			 max = y2;
			 min = y1;
		 }
			
			for(int i=max; i>=1; i--) {
             
		if(max%i==0 && min%i==0) {
			
			topekok = (max*min)/i;
			break;
		}
	             	 
	              }
			
			 	
			return topekok;
		 
	 }
	
	
	public static void main(String[] args) {
		
		String islemler = "Ekok işlemi için 1 e basın lütfen\n"
				          +"Ebob işlemi için 2'ye basın lütfen";
		System.out.println("**********************");
		System.out.println(islemler);
		System.out.println("**********************");
		Scanner islem = new Scanner(System.in);
		System.out.print("Lütfen bir işlem giriniz : ");
		int sayı = islem.nextInt();
		
		if(sayı == 1) {
Scanner ebob = new Scanner(System.in);
    		
    		System.out.print("Lütfen bir sayı giriniz : ");
    		int sayi1 = ebob.nextInt();
    		System.out.print("Lütfen bir sayı giriniz : ");
    		int sayi2 = ebob.nextInt();
    		System.out.println(sayi1 +" ve "+ sayi2 +" ekokları " +ekok_bulma( sayi1,  sayi2) );
		}
			
		
		
        if(sayı == 2) {
        	Scanner ebob = new Scanner(System.in);
        	System.out.print("Lütfen bir sayı giriniz : ");
   		int sayi1 = ebob.nextInt();
   		System.out.print("Lütfen bir sayı giriniz : ");
   		 int sayi2 = ebob.nextInt();
   	
		 
   		System.out.println(sayi1 +" ve "+ sayi2 +"ebobları " +ebob_bulma(x1, x2));
		}
		
		
		
		
		
	}

}
