package Backtracking;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 2, 4, 2, 1, 3, 5, 76 };
		int res[] = sol(arr, 0, arr.length - 1);
		for (int val : res) {
			System.out.print(val + " ");
		}
	}

	public static int[] sol(int arr[], int lo, int hi) {
		if (lo == hi) {
			int res[] = new int[1];
			res[0] = arr[lo];
			return res;
		}
		int mid = (lo + hi) / 2;
		int left[] = sol(arr, lo, mid);
		int right[] = sol(arr, mid + 1, hi);
		return merge(left, right);

	}

	public static int[] merge(int left[], int right[]) {
		int res[] = new int[left.length + right.length];
		int k = 0;
		int i = 0;
		int j = 0;
		while (i < left.length && j < right.length) {
			if (left[i] > right[j]) {
				res[k] = right[j];
				j++;
				k++;
			} else if (left[i] <= right[j]) {
				res[k] = left[i];
				i++;
				k++;
			}
		}
		while (i < left.length) {
			res[k] = left[i];
			i++;
			k++;
		}
		while (j < right.length) {
			res[k] = right[j];
			j++;
			k++;
		}

		return res;

	}

}