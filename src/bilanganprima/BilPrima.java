package bilanganprima;

import java.util.Scanner;

public class BilPrima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Scanner input = new Scanner (System.in) ;
	System.out.println("Silahkan Masukan Jumlah Deret yang Diinginkan : ");
	int jumlahBilPrima = input.nextInt();
	
	System.out.println("Silahkan Masukan Jumlah baris yang Diinginkan");
	int baris = input.nextInt();
	
	System.out.println(jumlahBilPrima + " Bilangan Prima ");
	
	int hitung = 0;
	int angka = 2;
	
	while (hitung < jumlahBilPrima) {
		
		boolean prima = true;
		
		for (int pembagi = 2 ; pembagi <= angka/2 ; pembagi ++) {
			
			if (angka % pembagi == 0) {
				prima = false;
				break;
				
			}
		}
		
		if(prima)  {
			hitung++ ;
			
		if(hitung % baris == 0) {
			System.out.println(angka);
		}
		
		else {
			System.out.print(angka + " ");
		}
		}
		
		angka++ ;
	}
		
	}

}
