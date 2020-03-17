package bilanganprima;

public class Testttt {
	public static void main(String[] args) {
		int sumGanjil = 0;
		int sumGenap = 0;
		int [] number = {1,10}; 
		
		
		for (int i = number[0]; i <=number[1]; i++) {
			if (i % 2 == 1 && i <= 5) {
				sumGanjil +=i;
				System.out.println(i+ " Ganjil");
				
			} else if (i % 2 == 0 && i > 5) {
				sumGenap +=i;
				System.out.println(i+ " Genap");
				
			}
			
		}
		
		System.out.println("=======HasilGanjil=======");
		System.out.println(sumGanjil);
		System.out.println("=======HasilGenap=======");
		System.out.println(sumGenap);
		
	}

}
