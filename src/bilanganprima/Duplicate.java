package bilanganprima;

public class Duplicate {

	public static void main(String[] args) {
		int [] number = {1,2,3,2,1,4,4};
		for (int i = 0; i < number.length; i++) {
			for (int j = i + 1; j < number.length; j++) {
				if(number[i] == number[j] ) {
					System.out.println("duplicate array:" + number[i]);
				}
			}
		}

	}

}
