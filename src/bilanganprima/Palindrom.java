package bilanganprima;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
	
		String kataAsli, kataBalik = "";
	
	Scanner inputUser = new Scanner (System.in);
	System.out.println("Inputkan Kata");
	
	kataAsli = inputUser.nextLine();
	int panjang = kataAsli.length();
	
	for (int index = panjang -1; index >= 0; index--) {
		kataBalik = kataBalik + kataAsli.charAt(index);
		
	}
	
	if (kataAsli.equals(kataBalik)) {
		System.out.println("Kata Termasuk Palindrome");
		
	}
	
	else {
		System.out.println("kata Bukan Termasuk Palindrome");
	}
		
	}
	

	

}
