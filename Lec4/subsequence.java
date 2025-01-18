package Lec4;

public class subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		sol(str, "");
	}

	public static void sol(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		sol(str.substring(1), ans + ch);
		sol(str.substring(1), ans);
	}

}
