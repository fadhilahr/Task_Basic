package bilanganprima;

public class tes {

	public static void main(String[] args) {
		int sumGanjil = 0;
		int sumGenap = 0;
		int [] number = {1,15};
		
		for (int i = number[0]; i <= number[1]; i++) {
			if (i % 2 == 0) {
				sumGenap +=i;
				
			}else {
				sumGanjil +=i;
			}
			
			 
			
		}
		System.out.println(sumGenap);
		System.out.println(sumGanjil);
	}

}
