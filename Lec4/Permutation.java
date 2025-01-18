package Lec4;

import java.util.*;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sol("23"));
	}

	public static List<String> sol(String str) {
		if (str.length() == 0) {
			ArrayList<String> list = new ArrayList();
			list.add(" ");
			return list;
		}
		List<String> mr = new ArrayList();
		char ch = str.charAt(0);
		String s = get(ch);
		for (int i = 0; i < s.length(); i++) {
			List<String> res = sol(str.substring(1));
			for (int j = 0; j < res.size(); j++) {
				mr.add(s.charAt(i) + res.get(j));
			}

		}
		return mr;
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
		return "";
	}
}