package Lec2;

public class AllPath2 {

	public static void main(String[] args) {
		int ans = sol(0, 3, 3, "");
		System.out.println(ans);
	}

	public static int sol(int cp, int dest, int dice, String ans) {
		if (cp == dest) {
			System.out.println(ans);
			return 1;
		}
		if (cp > dest)
			return 0;
		int tc = 0;
		tc += sol(cp + 1, dest, dice, ans + "1 ");
		tc += sol(cp + 2, dest, dice, ans + "2 ");
		tc += sol(cp + 3, dest, dice, ans + "3 ");
		return tc;
	}
}