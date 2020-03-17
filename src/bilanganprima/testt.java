package bilanganprima;

public class testt {
	public static void main(String[] args) {
		int sumGanjil = 0;
		int sumGenap = 0;
		int number = 10;
		
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 1) {
				sumGanjil +=i;
				
			} else {
				sumGenap +=i;
			}
			
			
		}
		System.out.println(sumGanjil);
		System.out.println(sumGenap);
	}

}
