package dogmgunu2;

import java.util.Scanner;

public class dogumgunu2 {
	
	

	
		public static void main(String[] args) {
			
			String set1 = "1  3  5  7\n" + "9  11 13 15\n" + "17 19 21 23\n" + "25 27 29 31\n";
			String set2 = "2  3  6  7 \n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31\n";
			String set3 = "4  5  6  7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31\n";
			String set4 = "8  9  10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31\n";
			String set5 ="16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31\n";
			
			String set6 = "1  3  5\n" + "7  9  11\n";
			String set7 = "2  3  6\n" + "7  10 11\n";
			String set8 = "4  5\n" + "6  7  12\n";
			String set9 = "8  9\n" + "10 11 12\n";
			
			String set10= "1 3 5 7 9\n";
			String set11= "2 3 6 7\n";
			String set12= "4 5 6 7\n";
			String set13= "8 9\n";
		
			
			int top = 0, sayi = 0 , ay=0, y1=1, y2=0, y3=0, y4=0;
			
			System.out.println(set1);
			Scanner scanner = new Scanner(System.in);
			System.out.println("Doğum gününüz bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			
			sayi = scanner.nextInt();
			
			if(sayi == 1 ) {
			
				top += 1;
			}
			
			System.out.println(set2);
			System.out.println("Doğum gününüz bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi1 = scanner.nextInt();
			
			if(sayi1 == 1 ) {
			
				top += 2;
			}
			
			
			System.out.println(set3);
			System.out.println("Doğum gününüz bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi2 = scanner.nextInt();
			
			if(sayi2 == 1 ) {
			
				top += 4;
			}
			
			System.out.println(set4);
			System.out.println("Doğum gününüz bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi3 = scanner.nextInt();
			
			if(sayi3 == 1 ) {
			
				top += 8;
			}
			
			System.out.println(set5);
			System.out.println("Doğum gününüz bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi4 = scanner.nextInt();
			
			if(sayi4 == 1 ) {
			
				top += 16;
			}
			
			
			
			System.out.println(set6);
			System.out.println("Doğum ayınız bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi5 = scanner.nextInt();
			
			if(sayi5 == 1 ) {
			
				ay += 1;
			}
			
			

			System.out.println(set7);
			System.out.println("Doğum ayınız bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi6 = scanner.nextInt();
			
			if(sayi6 == 1 ) {
			
				ay += 2;
			}
		

			System.out.println(set8);
			System.out.println("Doğum ayınız bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi7 = scanner.nextInt();
			
			if(sayi7 == 1 ) {
			
				ay += 4;
			}
			

			System.out.println(set9);
			System.out.println("Doğum ayınız bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi8 = scanner.nextInt();
			
			if(sayi8 == 1 ) {
			
				ay += 8;
			}
			
			
			System.out.println("Doğum yılınızı rakam rakam inceleyeceğiz!");
			
			System.out.println(set10);
			System.out.println("Doğum yılınızın ikinci basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi9 = scanner.nextInt();
			
			if(sayi9 == 1 ) {
			
				y2 += 1;
			}
			System.out.println(set11);
			System.out.println("Doğum yılınızın ikinci basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi10 = scanner.nextInt();
			
			if(sayi10 == 1 ) {
			
				y2 += 2;
			}
			System.out.println(set12);
			System.out.println("Doğum yılınızın ikinci basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi11 = scanner.nextInt();
			
			if(sayi11 == 1 ) {
			
				y2 += 4;
			}
			System.out.println(set13);
			System.out.println("Doğum yılınızın ikinci basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi12 = scanner.nextInt();
			
			if(sayi12 == 1 ) {
			
				y2 += 8;
			}
			
			System.out.println("Doğum yılınızın 3. basamağı 0 ise 0'a bas değilse 1'e bas");
			int sayi13 = scanner.nextInt();
			if(sayi13 ==0) {
				
				y3 +=0;
			}
			else
				System.out.println("Doğum yılınızı rakam rakam inceleyeceğiz!");
			
			System.out.println(set10);
			System.out.println("Doğum yılınızın ücüncü basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi14 = scanner.nextInt();
			
			if(sayi14 == 1 ) {
			
				y3 += 1;
			}
			System.out.println(set11);
			System.out.println("Doğum yılınızın ücüncü basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi15 = scanner.nextInt();
			
			if(sayi15 == 1 ) {
			
				y3 += 2;
			}
			System.out.println(set12);
			System.out.println("Doğum yılınızın ücüncü basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi16 = scanner.nextInt();
			
			if(sayi16 == 1 ) {
			
				y3 += 4;
			}
			System.out.println(set13);
			System.out.println("Doğum yılınızın üçüncü basamağı bunlardan biri mi?" );
			System.out.println("Evet için 1'e Hayır için 0'a basınız.");
			int sayi17 = scanner.nextInt();
			
			if(sayi17 == 1 ) {
			
				y3 += 8;
			} 
			
			
				
				
			
		
		System.out.println("Doğum yılınızın 4. basamağı 0 ise 0'a bas değilse 1'e bas");
		int sayi18 = scanner.nextInt();
		if(sayi18 ==0) {
			
			y4 +=0;
			
		}
		
		else {
			System.out.println("Doğum yılınızı rakam rakam inceleyeceğiz!");
		
		System.out.println(set10);
		System.out.println("Doğum yılınızın dördüncü basamağı bunlardan biri mi?" );
		System.out.println("Evet için 1'e Hayır için 0'a basınız.");
		int sayi19 = scanner.nextInt();
		
		if(sayi19 == 1 ) {
		
			y4 += 1;
		}
		System.out.println(set11);
		System.out.println("Doğum yılınızın dördüncü basamağı bunlardan biri mi?" );
		System.out.println("Evet için 1'e Hayır için 0'a basınız.");
		int sayi20 = scanner.nextInt();
		
		if(sayi20 == 1 ) {
		
			y4 += 2;
		}
		System.out.println(set12);
		System.out.println("Doğum yılınızın dördüncü basamağı bunlardan biri mi?" );
		System.out.println("Evet için 1'e Hayır için 0'a basınız.");
		int sayi21 = scanner.nextInt();
		
		if(sayi21 == 1 ) {
		
			y4 += 4;
		}
		System.out.println(set13);
		System.out.println("Doğum yılınızın dördüncü basamağı bunlardan biri mi?" );
		System.out.println("Evet için 1'e Hayır için 0'a basınız.");
		int sayi22 = scanner.nextInt();
		
		if(sayi22 == 1 ) {
		
			y4 += 8;
		} 
		
		}
			System.out.println("Doğum gününüz : " +top+"."+ay+"."+y1+y2+y3+y4);
			
		}
			
			
			
		

	}


