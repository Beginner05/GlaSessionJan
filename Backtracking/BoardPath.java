package Backtracking;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = sol(0, 50, 6, "");
		System.out.println(ans);
	}

	public static int sol(int cp, int dest, int dice, String ans) {
		if (cp == dest) {
//			System.out.println(ans);
			return 1;
		}
		if (cp > dest) {
			return 0;
		}
		int cnt = 0;
		for (int jump = 1; jump <= dice; jump++) {
			cnt += sol(cp + jump, dest, dice, ans + jump + " ");
		}
		return cnt;
	}
	
	
	
	
	
	
	

}
