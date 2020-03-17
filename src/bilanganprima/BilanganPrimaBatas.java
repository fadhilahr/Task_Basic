package bilanganprima;

import java.util.Scanner;

public class BilanganPrimaBatas {
	public static boolean cekpr(int i) {
	
		
		boolean k = true;
		int j;
		for (j= 2 ; j<=i ; j++) {
			if (i % j == 0 && j !=i ) {
				k = false ;
			}
			
		}
		return k;
	}
	
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int awal, akhir ;
		
		System.out.println("Masukan Batas Awal Bilangan Prima : "); 
		
		awal = input.nextInt();
		
		System.out.println("Masukan Batas Akhir Bilangan Prima : ");
		
		akhir = input.nextInt();
		
		boolean prima = false;
		for (int i= awal; i<= akhir; i++) {
			
			prima = cekpr(i);
			if (prima == true) {
				if (i != 1 ) {
					
					System.out.print(""  +i);
				}
			}
			
		}
	}
	
	

}
