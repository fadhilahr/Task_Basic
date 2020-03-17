package bilanganprima;

import java.util.Scanner;

public class Usia {
	public static void main(String[] args)  {
		int tlahir, blahir, thlahir, tsekarang, bsekarang, thsekarang, tahun, bulan, tanggal;
		
		Scanner umur = new Scanner (System.in);
		
		System.out.println("Tahun Lahir Anda : ");
		thlahir = umur.nextInt();
		System.out.println("Tahun Sekarang : ");
		thsekarang = umur.nextInt();
		tahun = thsekarang - thlahir;
		
		System.out.println("Bulan Lahir Anda : ");
		blahir = umur.nextInt();
		System.out.println("Bulan Sekarang");
		bsekarang = umur.nextInt();
		bulan = (((thsekarang - thlahir)*12)-(bsekarang - blahir));
		
		System.out.println("Tanggal Lahir Anda : ");
		tlahir = umur.nextInt();
		System.out.println("Tanggal Lahir Sekarang");
		tsekarang = umur.nextInt();
		tanggal = ((((thsekarang - thlahir)*12)-(bsekarang - blahir))*30);
		
		System.out.println("Usia dalam Tahun : " +tahun );
		System.out.println("Usia dalam Bulan : " +bulan );
		System.out.println("Usia dalam Hari : " +tanggal);
		
		
		
	}
	

}


