
public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			int smallest = smallest(a, i);
			swap(a, smallest, i);
		} 
		
	}
	
	public int smallest(int[] a, int start) {
		int smallest = start;
		for (int i = start + 1; i < a.length; i++) {
			if (a[i] < a[smallest]) {
				smallest = i;
			}
		} return smallest;
	}
	
	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
