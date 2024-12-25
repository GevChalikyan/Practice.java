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

    if(arr.length > 1) {
      
      final int BEGIN = 0;
      final int END = arr.length;
      final int MIDDLE = (BEGIN + END) / 2;
      
      int[] left = MergeSort(Arrays.copyOfRange(arr, BEGIN, MIDDLE));
      int[] right = MergeSort(Arrays.copyOfRange(arr, MIDDLE, END));
      

      
      arr = Merge(left, right);
      
    }
    
    return arr;

	}

  public static int[] Merge(int[] left, int[] right) {

    int[] result = new int[left.length + right.length];

    int index_L = 0;
    int index_R = 0;



    for(int i = 0; i < result.length; i++) {

      if(index_L == left.length) {
        result[i] = right[index_R];
        index_R++;
      } else if(index_R == right.length) {
        result[i] = left[index_L];
        index_L++;
      } else if(left[index_L] <= right[index_R]) {
        result[i] = left[index_L];
        index_L++;
      } else{
        result[i] = right[index_R];
        index_R++;
      }

    }

    return result;

  }

}
