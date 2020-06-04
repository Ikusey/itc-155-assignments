package itc155_workspace;
//
//4. the complexity class is linear O(N) since there is just one for loop with 2 statements in the algorithm
//with 2 statements outside the loop and iterates over the entire array
//5.  the complexity class is linear O(N) since there is just 1 for loop with 4 statements inside
//
//
//
public class selectionSortMain {

	public static void main(String[] args) {
		  int[] array = {9,14,3,2,43,11,58,22}; 
		  for(int num: array) {
			  System.out.print(num + " ");
		  }
		  selectionSortMax(array);
		  System.out.println();
		  for(int num: array) {
			  System.out.print(num + " ");
		  }

	}
	
	public static void selectionSortMax(int[] array) {
		for(int i = array.length - 1; i >= 0; i-- ) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			
		}
		
	}

}
