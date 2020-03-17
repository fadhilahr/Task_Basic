package bilanganprima;


public class GanjilGenap {
	public static void main(String[] args) {
		int[] bilangan = {1,20};
		
		for (int i = bilangan[0]; i <= bilangan[1]; i++) {
			if (i % 2 == 0 ) {
				System.out.println(i+ " Adalah Bilangan Genap");
				
			} else  {
				System.out.println(i+ " Adalah Bilangan Ganjil" );
			}
			
		}
		
		
}
}
