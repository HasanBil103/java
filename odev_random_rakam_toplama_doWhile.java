package odev_random_rakam_toplama_doWhile;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class odev_random_rakam_toplama_doWhile {
	public static void main(String[] args) {
		ArrayList rakam = new ArrayList();
		int i =0;
		int adet =0;
		Scanner sonuc = new Scanner(System.in);
		System.out.println("Kaça adet oyun oynayalım ? ");
		 adet = sonuc.nextInt();
		do {
		
			int x1 = (int)(Math.random()*10);
			int x2 = (int)(Math.random()*10);
			
			System.out.println(x1 +" + "+x2 +" ?");
			int cevap = sonuc.nextInt();
			if(cevap ==(x1+x2)) {
				System.out.println("Cevabınız doğru.");
				rakam.add(x1+"+"+x2+"="+cevap);
			}
			else {
				System.out.println("Cevabınız yanlış!!!");
			}
			i +=1;
		}
		while( i<=adet); {
			
			
			
		}
		System.out.println("Doğru bildikleriniz : " +rakam);
		
	
	
	
	}
}
