package selectionsort;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		
		int[] array = {3, 8, 1, 10, 9, 7, 11};
		
		for(int i = 0; i < array.length; i++) {
			
			int minValue = array[i];
			int minIndex = i;
			
			//j iterates from each index as a starting point
			//a.k.a j = i; once a loop has been completed
			//it moves to the next item in the list
			//starts at 0 and move up from there 
			
			for(int j = i; j < array.length; j++) {
				//array[j] looks at the value of the index
				//is array[j] less than the value at array[i];
				if (array[j] < minValue) {
					//if so the new minValue is array[j]
					minValue = array[j];
					//the new minIndex is the index(j) of array[j]
					minIndex = j;
				}
				//compare the new minValue to the rest
				//of the items in the array 
				if(minValue < array[i]) {
					//hold the value at array[i] in temp
					int temp = array[i];
					//start iterating the for loop from array[i]
					//which is the value that corresponds to the new minIndex;
					array[i] = array[minIndex];
					array[minIndex] = temp;
				}
			}
			System.out.println(Arrays.toString(array));
		}
	};
	
	
}
