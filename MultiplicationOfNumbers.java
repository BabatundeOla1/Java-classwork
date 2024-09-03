public class MultiplicationOfNumbers{

   public static void main(String...args){
	


	int row = 10;
	int column =9;
	for (int count = 1; count <= column; count++){

		for(int counts = 1; counts <= row; counts++){
		System.out.printf("%d * %d = %d\t", count,counts, count * counts);	
		}

		System.out.println(" ");

	}

    }

}