package xyz;

import java.util.Scanner;

public class xyz {


	public static void main(String[] args) {
		
		/*double sayı = 128.58469762254;
	    int rakam = 43;
	    String str = "Merhaba JAVA";
	    boolean deger =true;
	    char deger2 = 'A';
	    System.out.printf("String : %s\nDouble sayı : %f\nİnteger sayı %d\nBoolen değer : %b\nChar akrakteri : %c\n" ,str,sayı,rakam,deger,deger2);
	    System.out.printf("String : %s\nDouble sayı : %4.2f\nİnteger sayı %d\nBoolen değer : %b\nChar akrakteri : %c" ,str,sayı,rakam,deger,deger2);
		*/
	    
	    
	    String set1 = "1  3  5  7\n"+"9  11 13 15\n"+"17 19 21 23\n"+"25 27 29 31\n";
	    String set2 = "2  3  6  7\n"+"10 11 14 15\n"+"18 19 22 23\n"+"26 27 30 31\n";
	    String set3 ="4  5  6  7\n"+"12 13 14 15\n"+"20 21 22 23\n"+"28 29 30 31\n";
	    String set4 = "8  9 10 11\n"+"12 13 14 15\n"+"24 25 26 27\n"+"28 29 30 31\n";
	    String set5 = "16 17 18 19\n"+"20 21 22 23\n"+"24 25 26 27\n"+"28 29 30 31\n";
	    
	   Scanner sayi = new Scanner(System.in);
	   int answer;
	   int day=0;
	   System.out.println("Is your birthday in set1?");
	   System.out.println(set1);
	   System.out.println("Enter 0 for no 1 for yes");
       answer = sayi.nextInt();
		
       if(answer ==1) {
    	   
    	   day +=1;
       }
       
       
       
       System.out.println("Is your birthday in set2?");
	   System.out.println(set2);
	   System.out.println("Enter 0 for no 1 for yes");
       answer = sayi.nextInt();
		
       if(answer ==1) {
    	   
    	   day +=2;
       }
      
    	   System.out.println("Is your birthday in set3?");
    	   System.out.println(set3);
    	   System.out.println("Enter 0 for no 1 for yes");
           answer = sayi.nextInt();
    		
           if(answer ==1) {
        	   
        	   day +=4;
           }
          
        	   System.out.println("Is your birthday in set4?");
        	   System.out.println(set4);
        	   System.out.println("Enter 0 for no 1 for yes");
               answer = sayi.nextInt();
        		
               if(answer ==1) {
            	   
            	   day +=8;
               }
              
            	   System.out.println("Is your birthday in set5?");
            	   System.out.println(set5);
            	   System.out.println("Enter 0 for no 1 for yes");
                   answer = sayi.nextInt();
            		
                   if(answer ==1) {
                	   
                	   day +=16;
                   }
       
		System.out.printf("\nYour birthday %d",day );
		
		
		
	}
}
