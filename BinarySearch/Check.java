package BinarySearch;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol("III", 0, '*', "", new int[10]);
	}

	public static void sol(String str, int num, char prev, String ans, int arr[]) {
		if (str.length() == 0) {
			if (prev == 'D') {

				for (int i = 1; i < 10; i++) {
					if (i < num && arr[i] == 0) {
						arr[i] = i;
						System.out.println(ans + i);
//							sol(str.substring(1),i,str.charAt(0),ans+i,arr);
						arr[i] = 0;
						return;
					}
				}
			}

			else {

				if (prev == 'I') {
					for (int i = 1; i < 10; i++) {
						if (num < i && arr[i] == 0) {
							arr[i] = i;
//						sol(str.substring(i),i,str.charAt(0),ans+i,arr);
							System.out.println(ans + i);

							arr[i] = 0;
							return;
						}
					}
				}
			}
//			System.out.println(ans);
			return;
		}
		if (ans.length() == 0) {
			for (int i = 1; i < 10; i++) {
				arr[i] = i;
				sol(str.substring(1), i, str.charAt(0), ans + i, arr);
				arr[i] = 0;
			}
		} else {
			if (prev == 'D') {
				for (int i = 1; i < 10; i++) {
					if (i < num && arr[i] == 0) {
						arr[i] = i;
						sol(str.substring(1), i, str.charAt(0), ans + i, arr);
						arr[i] = 0;
					}
				}
			} else if (prev == 'I') {
				for (int i = 1; i < 10; i++) {
					if (num < i && arr[i] == 0) {
						arr[i] = i;
						sol(str.substring(i), i, str.charAt(0), ans + i, arr);
						arr[i] = 0;
					}
				}
			}
		}

	}

}
