import java.util.Scanner;

public class Switch_case {
	private static double toptutar = 0;
	public static void main(String[] args)
    {
   
    	String fiyat  = "\n1. 1 kilo domates   3.50 TL'dir."
    	              +"\n 2. 1 kilo patlıcan  4.25 TL'dir."
    	              +"\n 3. 1 kilo biber     4.50 TL'dir."
    	              +"\n 4. 1 kilo salatalık 3.00 TL'dir."
    	              +"\n 5. 1 kilo kabak     2.50 TL'dir."
    	              +"\n 6. 1 kilo enginar   6.50 TL'dir."
    	              +"\n 7. 1 kilo muz       7.50 TL'dir."
    	              +"\n 8. 1 kilo çilek     5.50 TL'dir."
    	              +"\n 9. 1 kilo elma      3.50 TL'dir."
    	              +"\n 10. 1 kilo portakal  4.50 TL'dir."
    	              +"\n 11. Çıkış için 0'a basın...";
    	System.out.print("****************************");
    	System.out.println(fiyat);
    	System.out.print("****************************");
    	int sayi =0;
    	while(sayi>=0) {
    		
    		       
       		Scanner secim = new Scanner(System.in);
    		System.out.print("\nLütfen bir sayı giriniz : ");
    		  sayi = secim.nextInt();
    		 
			switch (sayi) {
			
    		case 1:
    			
    			System.out.print("\nKaç kilo domates istersiniz : ");
    			int kg = secim.nextInt();
    			toptutar +=(3.50*kg);
    			System.out.println("Domatesin toplam tutarı :" +(3.50*kg)+ " toplam tutar : " +toptutar);
    			break;

    		case 2:
    			System.out.print("\nKaç kilo patlıcan istersiniz : ");
    			int kg1 =  secim.nextInt();
    			toptutar +=(4.25*kg1);
    			System.out.println("Patlıcan'ın toplam tutarı :" +(4.25*kg1)+ " toplam tutar : " +toptutar);
    			break;
    		

    		case 3:
        	    System.out.print("\nKaç kilo biber istersiniz : ");
        		kg = secim.nextInt();
        		toptutar +=(4.50*kg);
        		System.out.println("Biber'in toplam tutarı :" +(4.50*kg)+ " toplam tutar : " +toptutar);
        		break;
        		
        			
        	case 4:
        		System.out.print("\nKaç kilo salatalık istersiniz : ");
        		kg = secim.nextInt();
        		toptutar +=(3.00*kg);
        		System.out.println("Salatalık'ın toplam tutarı :" +(3.00*kg)+ " toplam tutar : " +toptutar);	
        		break;
        	
        	case 5:
        		System.out.print("\nKaç kilo kabak istersiniz : ");
        		kg = secim.nextInt();
        		toptutar +=(2.50*kg);
        		System.out.println("Kabak'ın toplam tutarı :" +(2.50*kg)+ " toplam tutar : " +toptutar);
        		
        		
        	case 6:
        		System.out.print("\nKaç kilo enginar istersiniz : ");
        		kg = secim.nextInt();
        		toptutar +=(6.50*kg);
        		System.out.println("Enginar'ın toplam tutarı :" +(6.50*kg)+ " toplam tutar : " +toptutar);
        		
        		
        	case 7:
        		System.out.print("\nKaç kilo muz istersiniz : ");
        		kg = secim.nextInt();
        		toptutar +=(7.50*kg);
        		System.out.println("Muz'un toplam tutarı :" +(7.50*kg)+ " toplam tutar : " +toptutar);	
        		
        		
        	case 8:
        		System.out.print("\nKaç kilo çilek istersiniz : ");
        		kg = secim.nextInt();
        		toptutar +=(5.50*kg);
        		System.out.println("Çilek'in toplam tutarı :" +(5.50*kg)+ " toplam tutar : " +toptutar);
        		
        		
        	case 9:
        		System.out.print("\nKaç kilo pelma istersiniz : ");
        		kg = secim.nextInt();
        		toptutar +=(3.50*kg);
        		System.out.println("Elma'nın toplam tutarı :" +(3.50*kg)+ " toplam -utar : " +toptutar);
        		
        		
        	case 10:
        		System.out.print("\nKaç kilo portakal istersiniz : ");
        		kg = secim.nextInt();
        		toptutar +=(4.50*kg);
        		System.out.println("Portakal'ın toplam tutarı :" +(4.50*kg)+ " toplam tutar : " +toptutar);
        		
        		
			case 0:
				break;
    			
    			
  }
}
}
}


    
    

