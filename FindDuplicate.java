/*************************************************************************
 *  Compilation:  javac FindDuplicate.java
 *  Execution:    java FindDuplicate
 *
 *  @author: Anushka Kondur
 *
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.
 *
 *  % java FindDuplicate 2 10 8 5 4 1 3 6 7 9
 *  false
 *
 *  % java FindDuplicate 2 4 5 2 1
 *  true
 *************************************************************************/

public class FindDuplicate {

	public static void main(String[] args) {

		int length = args.length;

		int[] intArray = new int[length];
		boolean duplicate = false;
		for (int index = 0; index < length; index++) {
			int newValue = Integer.parseInt(args[index]);
			for(int j = 0; j<index; j++) {
				if(intArray[j] == newValue)
					duplicate = true;
			}
			intArray[index] = newValue;
		}

		System.out.println(duplicate);




	}
}




