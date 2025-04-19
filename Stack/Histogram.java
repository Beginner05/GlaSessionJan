package Stack;

import java.util.*;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 1, 5, 6, 2, 3 };
		int res = sol(arr);
		System.out.println(res);
	}

	public static int sol(int arr[]) {
		int left[] = new int[arr.length];
		int right[] = new int[arr.length];
		Stack<Integer> s = new Stack();
		for (int i = 0; i < arr.length; i++) {
			while (!s.isEmpty() && arr[s.peek()] > arr[i]) {
				left[s.pop()] = i;
			}

			s.push(i);
		}

		while (!s.isEmpty()) {
			left[s.pop()] = -1;
		}

		for (int i = arr.length - 1; i >= 0; i--) {

			while (!s.isEmpty() && arr[s.peek()] > arr[i]) {
				right[s.pop()] = i;
			}
			s.push(i);
		}
		while (!s.isEmpty()) {
			right[s.pop()] = -1;
		}

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int cnt = 1;
			if (left[i] == -1 && right[i] == -1) {
				int len = arr.length;
				int area = len * arr[i];
				max = Math.max(max, area);
			} else if (left[i] == -1 && right[i] != -1) {
				int gap = arr.length - i - 1;
				cnt += gap;
				gap = i - right[i] - 1;
				cnt += gap;
				int area = cnt * arr[i];
				max = Math.max(max, area);
			}

			else if (right[i] == -1 && left[i] != -1) {
				int gap = left[i] - i - 1;
				cnt += gap;
				cnt += i;
				int area = cnt * arr[i];
				max = Math.max(area, max);
			} else if (right[i] != -1 && left[i] != -1) {
				int gap = left[i] - i - 1;
				cnt += gap;
				gap = i - right[i] - 1;
				cnt += gap;
				int area = cnt * arr[i];
				max = Math.max(area, max);
			}

		}

		return max;

	}
}
