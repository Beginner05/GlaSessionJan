package Backtracking;

public class mergeSort {

	public static void main(String[] args) {

		int arr[] = { 4, 3, 2, 43, 0, 1, -8 };
		int res[]=sort(arr, 0, arr.length - 1);
	for(int i=0;i<res.length;i++)
	{
		System.out.print(res[i]+" ");
	}
	}

	public static int[] sort(int arr[], int lo, int hi) {
		if (lo == hi) {
			int res[] = new int[1];
			res[0] = arr[lo];
			return res;
		}
		int mid = (lo + hi) / 2;
		int left[] = sort(arr, lo, mid);
		int right[] = sort(arr, mid + 1, hi);
		return merge(left, right);
	}

	public static int[] merge(int left[], int right[]) {
		int res[] = new int[left.length + right.length];
		int i = 0;
		int j = 0;
		int k = 0;
//		i track rkh rha h left array ka;
//		j track rkh rha h right array ka;
//		k track rakh rha h res array ka;
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				res[k] = left[i];
				k++;
				i++;
			} else if (left[i] > right[j]) {
				res[k] = right[j];
				k++;
				j++;
			}
		}
//		ho skta h j end tk phoch gya ho
//		agr, j end pr phoch gya mtlb i kch element baaki h

//		ho skta h i end tk phoch gya ho
//		agr, i end pr phoch gya mtlb j kch element baaki h
while(i<left.length)
{
	res[k]=left[i];
	i++;
	k++;
}
while(j<right.length)
{
	res[k]=right[j];
	j++;
	k++;
}
		
		return res;

	}
}