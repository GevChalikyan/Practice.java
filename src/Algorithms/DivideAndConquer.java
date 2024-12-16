package Algorithms;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class DivideAndConquer {

	// ********************* //
	// CLASS LEVEL VARIABLES //
	// ********************* //

	private static int[] input;

	

	// ************* //
	// MAIN FUNCTION //
	// ************* //

	public static void main(String[] args) {

		String inputFile = "input.txt";



		if(args.length != 0) {
			inputFile = args[0];
		}

		try(Scanner scanner = new Scanner(new File(inputFile))){
			readInput(scanner);
		} catch(Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}



	// ********** //
	// READ INPUT //
	// ********** //

	private static void readInput(Scanner scanner) {

		final String[] stringArray = scanner.nextLine().split("\\s+");
		input = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();

	}



	// ********** //
	// MERGE SORT //
	// ********** //

	public static int[] MergeSort(int[] arr) {

		int[] result = new int[input.length];

		return null;

	}

}
