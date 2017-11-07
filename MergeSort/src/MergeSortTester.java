import java.util.*;
import java.io.*;
import java.util.concurrent.*;

public class MergeSortTester {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int n = scnr.nextInt();
		scnr.close();
		
		int[] testArray = new int[n];
		for (int i = 0; i < n; i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(-n, n + 1);
			testArray[i] = randomNum;
		}
		int[] original = new int[n];
		System.arraycopy(testArray, 0, original, 0, n);
		
		final long startTime = System.nanoTime();		
		MergeSorter.mergeSort(testArray, 0, n - 1);
        final long duration = System.nanoTime() - startTime;
        double secs = duration / 1.e+9;
		
		System.out.println("ORIGINAL     SORTED");
		System.out.println("-----------------------------");
		for (int i = 0; i < n; i++) {
			System.out.printf("%12d     %12d%n", original[i], testArray[i]);
		}
		System.out.println("\nSize of array: " + n);
		System.out.println("Sorting time (sec): " + secs);
		
	}
	
}
