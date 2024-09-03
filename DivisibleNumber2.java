public class DivisibleNumber2{

   public static void main(String...args){

	int counter = 0;

	for(int count = 100; count <= 1000; count = count + 1){
 
	   if(count % 3 == 0 && count % 4 == 0){

		System.out.print(count + " ");
		counter++;

		if(counter == 10){
		     System.out.println();
		      counter = 0;
		}

	
	    }


	}

   }


}