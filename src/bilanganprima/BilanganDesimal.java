package bilanganprima;

import java.text.DecimalFormat;

public class BilanganDesimal {
	public static void main(String[] args) {
		DecimalFormat angka = new DecimalFormat ("0.00");
		
		double A = 14;
		double B = 9;
		double C = A/B ; 
		System.out.println(angka.format(C));
	}

}
