package bilanganprima;

import java.util.Scanner;

public class Umur {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int hra,bla,tha,hrb,blb,thb,u,utha, uthb,ubla,ublb,uhra,uhrb,ua,ub ; 
		
		System.out.println("Masukan Tanggal Lahir Anda : ");
		hra = input.nextInt();
		System.out.println();
		
		System.out.println("Masukan Bulan Lahir Anda : ");
		bla = input.nextInt();
		System.out.println();
		
		System.out.println("Masukan Tahun Lahir Anda : ");
		tha = input.nextInt();
		
		System.out.println();
		System.out.println("Masukan Tanggal Sekarang : ");
		hrb = input.nextInt();
		
		System.out.println();
		System.out.println("Masukan Bulan Sekarang : ");
		blb = input.nextInt();
		
		System.out.println();
		System.out.println("Masukan Tahun Sekarang : ");
		thb = input.nextInt();
		
		utha = tha*365;
		ubla = bla*30;
		uhra = hra*1;
		ua= utha+ubla+uhra;
		
		uthb = thb*365;
		ublb = blb*30;
		uhrb = hrb*1;
		ub= uthb+ublb+uhrb;
		
		u= ub-ua;
		
		System.out.println();
		System.out.println("Usia Anda Dalam Hitungan Hari : " +u);
		System.out.println();
		
	}

}
