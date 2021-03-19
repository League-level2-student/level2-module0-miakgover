package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random rand = new Random();
		//1. make an array of 5 Strings
		String[] numbers = {"one", "two", "three", "four", "five"};
		//2. print the third element in the array
		System.out.println(numbers[2]);
		//3. set the third element to a different value
		numbers[2] = "six";
		//4. print the third element again
		System.out.println(numbers[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		//6. make an array of 50 integers
		int[] randoms = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i=0;i<randoms.length;i++) {
			randoms[i] = rand.nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = 49;
		for(int i=0;i<randoms.length;i++) {
			if(randoms[i]<smallest) {
				smallest=randoms[i];
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for(int i=0;i<randoms.length;i++) {
			System.out.println(randoms[i]);
		}
		//10. print the largest number in the array.
		int largest = 0;
		for(int i=0;i<randoms.length;i++) {
			if(randoms[i]>largest) {
				largest = randoms[i];
			}
		}
		System.out.println(largest);
	}
}
