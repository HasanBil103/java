package dogumgunu;

import java.util.Scanner;

public class dogumgunu {
	
	public static void main(String[] args) {
		
		String set1 = "1  3  5  7\n"+"9  11 13 15\n"+"17 19 21 23\n"+"25 27 29 31\n";
	    String set2 = "2  3  6  7\n"+"10 11 14 15\n"+"18 19 22 23\n"+"26 27 30 31\n";
	    String set3 ="4  5  6  7\n"+"12 13 14 15\n"+"20 21 22 23\n"+"28 29 30 31\n";
	    String set4 = "8  9 10 11\n"+"12 13 14 15\n"+"24 25 26 27\n"+"28 29 30 31\n";
	    String set5 = "16 17 18 19\n"+"20 21 22 23\n"+"24 25 26 27\n"+"28 29 30 31\n";
	    
	   String set6 = "1 3 5 \n"+"7 9 11\n";
	   String set7 = "2 3  6\n"+"7 10 11\n";
	   String set8 = "4 5  6\n"+"7 12\n";
	   String set9 = "8  9  10\n"+"11 12\n";
	   
	   String set10 = "0 1 3\n"+"5 7 9\n";
	   String set11 = "0 2 3\n"+"6 7\n";
	   String set12 = "0 4 5\n"+"6 7\n";
	   String set13 ="0 8 9\n";
	    
	    Scanner sayi = new Scanner(System.in);
	    int rakam =0;
	    int gun =0;
	    int ay =0;
	   int dy1=0, dy2=0, dy3=0, dy4=0;
	    System.out.println("Senin doğum günün bu günlerden biri mi ? ");
	    System.out.println(set1);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	gun +=1;
	    }
	    System.out.println("Senin doğum günün bu günlerden biri mi ? ");
	    System.out.println(set2);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	gun +=2;
	    }
	    System.out.println("Senin doğum günün bu günlerden biri mi ? ");
	    System.out.println(set3);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	gun +=4;
	    }
	    System.out.println("Senin doğum günün bu günlerden biri mi ? ");
	    System.out.println(set4);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	gun +=8;
	    }
	    System.out.println("Senin doğum günün bu günlerden biri mi ? ");
	    System.out.println(set5);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	gun +=16;
	    }
	    System.out.println("Senin doğum günün bu aylardan biri mi ? ");
	    System.out.println(set6);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	ay +=1;
	    }
	    System.out.println("Senin doğum günün bu aylardan biri mi ? ");
	    System.out.println(set7);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	ay +=2;
	    }
	    System.out.println("Senin doğum günün bu aylardan biri mi ? ");
	    System.out.println(set8);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	ay +=4;
	    }
	    System.out.println("Senin doğum günün bu aylardan biri mi ? ");
	    System.out.println(set9);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	ay +=8;
	    }
	    System.out.println("Şimdi doğum yılınızı rakam rakam inceleyeceğiz.");
	    
		System.out.println("Doğum yılınızın ilk rakamı bu rakamlardan biri mi ?");
		System.out.println(set10);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy1 +=1;
	    }
	    System.out.println("Doğum yılınızın ilkrakamı bu rakamlardan biri mi ?");
		System.out.println(set11);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy1 +=2;
	    }
	    System.out.println("Doğum yılınızın ilk rakamı bu rakamlardan biri mi ?");
		System.out.println(set12);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy1 +=4;
	    }
	    System.out.println("Doğum yılınızın ilk rakamı bu rakamlardan biri mi ?");
		System.out.println(set13);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy1 +=8;
	    }
	    
	    System.out.println("Doğum yılınızın ikinci rakamı bu rakamlardan biri mi ?");
		System.out.println(set10);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy2 +=1;
	    }
	    System.out.println("Doğum yılınızın ikinci rakamı bu rakamlardan biri mi ?");
		System.out.println(set11);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy2 +=2;
	    }
	    System.out.println("Doğum yılınızın ikinci rakamı bu rakamlardan biri mi ?");
		System.out.println(set12);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy2 +=4;
	    }
	    System.out.println("Doğum yılınızın ikinci rakamı bu rakamlardan biri mi ?");
		System.out.println(set13);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy2 +=8;
	    }
	    System.out.println("Doğum yılınızın ücüncü rakamı bu rakamlardan biri mi ?");
		System.out.println(set10);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy3 +=1;
	    }
	    System.out.println("Doğum yılınızın ücüncü rakamı bu rakamlardan biri mi ?");
		System.out.println(set11);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy3 +=2;
	    }
	    System.out.println("Doğum yılınızın ücüncü rakamı bu rakamlardan biri mi ?");
		System.out.println(set12);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy3 +=4;
	    }
	    System.out.println("Doğum yılınızın ücüncü rakamı bu rakamlardan biri mi ?");
		System.out.println(set13);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy4 +=8;
	    }
	    System.out.println("Doğum yılınızın son rakamı bu rakamlardan biri mi ?");
		System.out.println(set10);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy4 +=1;
	    }
	    System.out.println("Doğum yılınızın son rakamı bu rakamlardan biri mi ?");
		System.out.println(set11);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy4 +=2;
	    }
	    System.out.println("Doğum yılınızın son rakamı bu rakamlardan biri mi ?");
		System.out.println(set12);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy4 +=4;
	    }
	    System.out.println("Doğum yılınızın son rakamı bu rakamlardan biri mi ?");
		System.out.println(set13);
	    System.out.println("Evet içiçn 1'e basın Hayır için 0'a basın");
	    rakam = sayi.nextInt();
	    if(rakam ==1) {
	    	dy4 +=8;
	    }
	    
	    System.out.println("Doğum tarihiniz : "+gun+"."+ay+"."+dy1+dy2+dy3+dy4);
	    
	    
	}
	

}
