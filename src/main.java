import Algorithms.DivideAndConquer;

class Main {
	public static void main(String[] args) {

		if(args.length == 0) {
			System.err.println("Argument Expected");
			System.exit(1);
		} else {

			String inputFile = "../data/input.txt";



			if(args.length == 2) {
				inputFile = args[1];
			}
			
			switch(args[0]) {
				case "MergeSort":
					DivideAndConquer.main(new String[] { inputFile, args[0] });
					break;

				default:
					System.err.println(args[0] + " Not Recognized");
					System.exit(1);
			}
			
		}

	}
}