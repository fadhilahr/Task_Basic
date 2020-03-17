package bilanganprima;

public class BilaPrim {
	public static void main(String[] args) {
		int angka = 10;
		
		for (int i = 2; i < angka ; i++) {
			boolean isPrima = true;
			for (int j = 2 ; j <i; j++) {
				if(i%j==0) {
					isPrima = false;
					break;
				}
			}
			
			if(isPrima==true) {
				System.out.print(i+ " " );
			}
					
		}

	}
}
