package bilanganprima;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		String kataAsli, kataBalik = "";
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Masukan Kata: ");
		
		kataAsli = sc.nextLine();
		int p = kataAsli.length();
		
		for (int i = p-1; i <= 0; i++) {
			kataBalik= kataBalik + kataAsli.charAt(i);
			
		}
		if (kataAsli.equals(kataBalik)) {
			System.out.println("Kata termasuk polindrom");
			
		} else
			System.out.println("Kata bukan termasuk polindrom");

	}

}
