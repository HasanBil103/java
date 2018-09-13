import java.util.Scanner;
import java.util.*;

public class burc {
	public static void main(String[] args) {
		System.out.println("Burcunuzu gösteren program, programdan cıkıs yapmak için ay kısmına cikis yazabilirsiniz");
		for (int repeat = 0; repeat < 99; repeat++) {
			int day;
			String month;

			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter your birth month: ");
			month = keyboard.nextLine();
			String lowermonth = month.toLowerCase(); // yazılanları küçük harfe çevirir.
			char result = lowermonth.charAt(0); // yazılan stringin ilk harfini alır
			char result3 = lowermonth.charAt(1); // ikinci harf
			char result2 = lowermonth.charAt(2); // üçüncü harf
			if (result == 'c') { // programdan exit yapabilmek için
				System.out.println("Programı kullandıgınız icin tesekkurler!");
				break;
			}

			;
			System.out.print("Enter your birth day: ");
			day = keyboard.nextInt();

			if (result == 'o') { // Ocak ayı
				if (day >= 20 && day <= 31) {
					System.out.println("Kova burcusun.");
				}
				if (day <= 19) {
					System.out.println("Oglak burcusun");
				} else {
					System.out.println("Yanlış bilgi");
				}

			}
			if (result == 's') { // Subat ayı
				if (day <= 18) {
					System.out.println("Kova burcusun");
				}
				if (day >= 19 && day <= 28) {
					System.out.println("Balik burcusun");
				} else {
					System.out.println("Yanlış bilgi");
				}

			}
			if (result == 'm' && result2 == 'r') { // Mart ayı
				if (day <= 20) {
					System.out.println("Balik burcusun");
				}
				if (day >= 21 && day <= 31) {
					System.out.println("Koc burcusun");
				} else {
					System.out.println("Yanlış bilgi");
				}
			}
			if (result == 'n') { // Nisan ayı
				if (day <= 19) {
					System.out.println("Koc burcusun");
				}
				if (day >= 20 && day <= 30) {
					System.out.println("Boga burcusun");
				}
			}
			if (result == 'm' && result2 == 'y') { // Mayıs ayı
				if (day <= 20) {
					System.out.println("Boga burcusun");
				}
				if (day >= 21 && day <= 31) {
					System.out.println("Ikizler burcusun");
				} else {
					System.out.println("Yanlış bilgi");
				}
			}
			if (result == 'h') { // Haziran ayı
				if (day <= 20) {
					System.out.println("Ikizler burcusun");
				}
				if (day >= 21 && day <= 30) {
					System.out.println("Yengec burcusun");
				} else {
					System.out.println("Yanlış bilgi");
				}
			}

			if (result == 't') { // Temmuz ayı
				if (day <= 22) {
					System.out.println("Yengec burcusun");
				}
				if (day >= 23 && day <= 31) {
					System.out.println("Aslan burcusun");
				} else {
					System.out.println("Yanlış bilgi");
				}
			}
			if (result == 'a' && result3 == 'g') { // Agustos ayı
				if (day <= 22) {
					System.out.println("Aslan burcusun");
				}
				if (day >= 23 && day <= 30) {
					System.out.println("Basak burcusun");
				} else {
					System.out.println("Yanlış bilgi");
				}
			}
			if (result == 'e' && result2 == 'y') { // Eylul ayı
				if (day <= 22) {
					System.out.println("Basak burcusun");
				}
				if (day >= 23 && day <= 30) {
					System.out.println("Terazi burcusun");
				} else {
					System.out.println("Yanlış bilgi");
				}
			}
			if (result == 'e' && result2 == 'k') { // Ekim ayı
				if (day <= 22) {
					System.out.println("Terazi burcusun");
				}
				if (day >= 23 && day <= 31) {
					System.out.println("Akrep burcusun");
				} else {
					System.out.println("Yanlış bilgi");
				}
			}
			if (result == 'k') { // Kasım ayı
				if (day <= 21) {
					System.out.println("Akrep burcusun");
				}
				if (day >= 22 && day <= 30) {
					System.out.println("Yay burcusun");
				} else {
					System.out.println("Yanlış bilgi");
				}
			}
			if (result == 'a' && result3 == 'r') { // Aralık ayı
				if (day <= 21) {
					System.out.println("Yay burcusun");
				}
				if (day >= 22 && day <= 31) {
					System.out.println("Oglak burcusun");
				} else {
					System.out.println("Yanlış bilgi");
				}
			}

		}
	}

}
