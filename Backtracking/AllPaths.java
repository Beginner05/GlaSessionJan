package Backtracking;

import java.util.*;

public class AllPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 15, 18, 35 };
		int b[] = { 20, 25, 40 };
		sol(a, b, true, "", 0, 0, -1);
	}

	public static void sol(int a[], int b[], boolean flag, String ans, int ai, int bi, int prev) {
		if (flag == true && ans.length() != 0) {
			System.out.println(ans);

		}
		if (flag == true) {
			for (int i = ai; i < a.length; i++) {
				if (a[i] > prev) {
					sol(a, b, false, ans + " " + a[i], i + 1, bi, a[i]);
				}

			}
		} else {

			for (int i = bi; i < b.length; i++) {
				if (b[i] > prev) {
					sol(a, b, true, ans + " " + b[i], ai, i + 1, b[i]);
				}
			}

		}
	}

}