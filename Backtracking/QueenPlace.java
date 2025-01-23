package Backtracking;

public class QueenPlace {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int arr[][] = new int[1][4];
		sol(arr, 0, arr.length - 1, 0, arr[0].length - 1, 0, 2, new boolean[1][4]);
	}

	public static void sol(int arr[][], int cr, int er, int cc, int ec, int qp, int tq, boolean[][] visited) {
		if (tq == qp) {
			System.out.println("ans ml gya");
			return;
		}
		if (cc > ec)
			return;
		visited[cr][cc] = true;
		sol(arr, cr, er, cc + 1, ec, qp + 1, tq, visited);
		visited[cr][cc] = false;
		sol(arr, cr, er, cc + 1, ec, qp, tq, visited);
	}

}
