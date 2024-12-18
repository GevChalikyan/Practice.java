package Algorithms;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DivideAndConquer {

	// ********************* //
	// CLASS LEVEL VARIABLES //
	// ********************* //

	private static int[] input;



	// ************* //
	// MAIN FUNCTION //
	// ************* //

	public static void main(String[] args) {

		if(args.length == 0) {
			System.err.println("Argument Expected");
			System.exit(1);
		} else {
			
			String inputFile = "input.txt";
			
			
			
			if(args.length == 2) {
				inputFile = args[1];
			}

			try(Scanner scanner = new Scanner(new File(inputFile))){
				readInput(scanner);
			} catch(Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
			
			switch(args[0]) {
				case "MergeSort":
					System.out.println(
						"Input:  " + Arrays.toString(input) + '\n' +
						"Result: " + Arrays.toString(MergeSort(input))
						);
					break;

				default:
					System.err.println(args[0] + " Not Recognized");
					System.exit(1);
			}
			
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

    int[] result = MergeSortHelper(arr);

		return result;

	}
  
  private static int[] MergeSortHelper(int[] arr) {

    System.out.println("IN:\n\t" + Arrays.toString(arr));

    if(arr.length > 2) {

      final int BEGIN = 0;
      final int END = arr.length;
      final int MIDDLE = (BEGIN + END) / 2;

      int[] left = MergeSortHelper(Arrays.copyOfRange(arr, BEGIN, MIDDLE));
      int[] right = MergeSortHelper(Arrays.copyOfRange(arr, MIDDLE, END));

      arr = IntStream.concat(Arrays.stream(left), Arrays.stream(right)).toArray();

    }
      
    //
    //  Sorting Logic
    //
    
    return arr;

  }

}
