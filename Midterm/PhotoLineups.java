package itc155_workspace;

import java.util.Scanner;
import java.util.ArrayList;

public class PhotoLineups {

// TODO: Write method to create and output all permutations of the list of names.
	public static void allPermutations(ArrayList<String> permList, ArrayList<String> nameList) {
		int i;
		int size = nameList.size();
		
		if (size == 0) {
		for (i = 0; i < permList.size(); ++i) {
			System.out.print(permList.get(i) + " ");
		}
		System.out.println();
		}
		
		else { 
		for (i = 0; i < size; ++i) {
		ArrayList<String> newPerms = new ArrayList<String>(permList);
		newPerms.add(nameList.get(i));

		ArrayList<String> newNames = new ArrayList<String>(nameList);
		newNames.remove(i);
		allPermutations(newPerms, newNames);
		}
	}
}
public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);
System.out.println("Enter in a set of one word names, finish the list with -1:");
ArrayList<String> nameList = new ArrayList<String>();
ArrayList<String> permList = new ArrayList<String>();
String name;
while(!scnr.hasNextInt()) {
	name = scnr.next();
	nameList.add(name);
}
allPermutations(permList, nameList);

// TODO: Read in a list of names; stop when -1 is read. Then call recursive method.
}
}