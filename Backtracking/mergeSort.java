package Backtracking;

public class mergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 32, 43, 2, 4, 0 };
		sol(arr, 0, arr.length - 1);

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
}