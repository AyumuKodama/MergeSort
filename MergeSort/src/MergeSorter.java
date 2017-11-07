
public class MergeSorter {
	
	public static void mergeSort(int[] list, int lo, int hi) {
		if (lo < hi) {
			int mid = (lo + hi) / 2;
			mergeSort(list, lo, mid);
			mergeSort(list, mid + 1, hi);
			merge(list, lo, mid, hi);
		}
	}
	
	public static void merge(int[] list, int lo, int mid, int hi) {
		
		int length = hi + 1;
		
		int[] temp = new int[length];
		System.arraycopy(list, 0, temp, 0, length);
		
		int loToMid = 0;
		int midToHi = mid + 1;
		int count = 0;
		while (loToMid <= mid && midToHi <= hi) {
			if (temp[loToMid] < temp[midToHi]) {
				list[count] = temp[loToMid];
				loToMid++;
				count++;
			} else {
				list[count] = temp[midToHi];
				midToHi++;
				count++;
			}
		}
		while (loToMid <= mid) {
			list[count] = temp[loToMid];
			count++;
			loToMid++;
		}
			//2 3 4 9 10 | -9 -7 -6 -2 3			//-9 -7 -6 -2 2 3 3
	}
}