import Algorithms.DivideAndConquer;

class Main {
	public static void main(String[] args) {

		if(args.length == 0) {
			System.err.println("Argument Expected");
			System.exit(1);
		} else {

			final String algorithm = args[0];
			String inputFile = "../data/" + args[0] + ".txt";



			if(args.length == 2) {
				inputFile = "../data/" + args[1];
			}
			
			switch(algorithm) {
				case "MergeSort":
        case "MissingNumber":
					DivideAndConquer.main(new String[] { algorithm, inputFile });
					break;

				default:
					System.err.println(algorithm + " Not Recognized");
					System.exit(1);
			}
			
		}

	}
}