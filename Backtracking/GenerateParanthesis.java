package Backtracking;

public class GenerateParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		sol(2 * n, 0, 0, "");
	}

	public static void sol(int n, int ob, int cb, String ans) {
		if (cb > ob)
			return;
		if (ob > n / 2)
			return;
		if (ob + cb == n) {
			System.out.println(ans);
			return;
		}
		sol(n, ob + 1, cb, ans + "( ");
		sol(n, ob, cb + 1, ans + ") ");

	}
}