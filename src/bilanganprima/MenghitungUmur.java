package bilanganprima;

import java.util.Scanner;
import java.util.Calendar;

public class MenghitungUmur {

	public static void main(String[] args) {
		
		Scanner inputUser = new Scanner (System.in);
		Calendar kalender = Calendar.getInstance();
		int tahunSekarang = kalender.get(Calendar.YEAR);
		
		System.out.println("Masukan Nama Disini : ");
		
		String nama = inputUser.nextLine();
		System.out.println("Masukan Tahun Lahir Disini : ");
		
		int tahunLahir = inputUser.nextInt();
		
		int umur = tahunSekarang - tahunLahir;
		
		System.out.println("Hasilnya Nama : "+nama+" Dengan Umur Sekarang : "+umur+" Tahun ");
		
		
		

	}

}
