public class MergeSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		if (a.length > 1) {
			int[] top = new int[a.length / 2];
			int[] bot = new int[a.length - top.length];
			divide(a, top, bot);
			sort(top);
			sort(bot);
			merge(a, top, bot);
		}
	}

	private void merge(int[] a, int[] top, int[] bot) {
		int topIndex = 0;
		int botIndex = 0;
		int aIndex = 0;
		while (topIndex < top.length && botIndex < bot.length) {
			if (top[topIndex] <= bot[botIndex]) {
				a[aIndex++] = top[topIndex];
			} else {
				a[aIndex++] = bot[botIndex++];
			}
		}
		while (topIndex < top.length) {
			a[aIndex++] = top[topIndex++];
		}
		while (botIndex < bot.length) {
			a[aIndex++] = bot[botIndex++];
		}
	}
	
	private void divide(int[] a, int[] top, int[] bot) {
		int pivot = a.length / 2;
		for (int i = 0; i < pivot; i++) {
			top[i] = a[i];
		}
		for (int i = 0, j = pivot; j < a.length; i++, j++) {
			bot[i] = a[j];
		}
	}
}
