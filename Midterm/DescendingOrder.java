package itc155_workspace;

import java.util.Scanner;

public class DescendingOrder {
// TODO: Write a void method selectionSortDescendTrace() that takes
// an integer array and the number of elements in the array as arguments,
// and sorts the array into descending order.
public static void selectionSortDescendTrace(int [] numbers, int numElements) {
	for(int i = 0; i < numbers.length - 1; i++) {
		int temp = 0;
		for(int j = i + 1; j < numbers.length; j++) {
			if(numbers[i] < numbers[j]) {
				temp = numbers[j];
				numbers[j] = numbers[i];
				numbers[i] = temp;
			}
		}
		for(int k = 0; k <= numbers.length -1; k++) {
			System.out.print(numbers[k] + " ");
		}
		System.out.println();
	}
}


public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);

int input = 0;
int i = 0;
int numElements = 0;
int [] numbers = new int[10];

// TODO: Read in a list of up to 10 positive integers; stop when
// -1 is read. Then call selectionSortDescendTrace() method.
while(input != -1) {
	input = scnr.nextInt();
	if(input != -1) {numbers[i] = input;}
	i++;
}
numElements = numbers.length;

selectionSortDescendTrace(numbers, numElements);
}
}
