package Lec4;

public class KeyPad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol("45", "");
	}

	public static void sol(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
//		ch=4;
		String s = get(ch);
		for (int i = 0; i < s.length(); i++) {
			sol(str.substring(1), ans + s.charAt(i));
		}

	}

	public static String get(char ch) {
		if (ch == '2') {
			return "abc";
		}
		if (ch == '3') {
			return "def";
		}
		if (ch == '4') {
			return "ghi";
		}
		if (ch == '5') {
			return "jkl";
		}
		if (ch == '6') {
			return "mno";
		}
		if (ch == '7') {
			return "pqrs";
		}
		if (ch == '8') {
			return "tuv";
		}
		if (ch == '9') {
			return "wxyz";
		}
		return ".";
	}
}
