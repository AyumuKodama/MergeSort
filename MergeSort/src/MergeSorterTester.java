import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class MergeSorterTester {

	@Test
	public void testMergeSort() {
		int[] test1 = {4, 7, -5, 3, 9, 22};
		int[] test2 = {-5, 3, 4, 7, 9, 22};
		assertTrue(Arrays.equals(test1, test2));
	}

	@Test
	public void testMerge() {
		int[] test3 = {-2, 0, 5, 3, 10};
		int[] test4 = {-2, 0, 3, 5, 10};
		assertTrue(Arrays.equals(test3, test4));
	}

}
