package BinarySearch;

import java.util.*;

public class AggresiveCows {

	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			int nos = scn.nextInt();
			int noc = scn.nextInt();
	//nos=no of stalls;
	//noc=no of cows;
			int stalls[] = new int[nos];
			for (int i = 0; i < stalls.length; i++) {
				stalls[i] = scn.nextInt();
			}
			Arrays.sort(stalls);
			int lo = stalls[0];
			int hi = stalls[stalls.length - 1] - stalls[0];
			int ans = -1;
			while (lo <= hi) {
				int mid = (lo + hi) / 2;
				if (isItPossible(noc, mid, stalls) == true) {
					ans = mid;
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			}

			System.out.println(ans);
		}

		public static boolean isItPossible(int noc, int dist, int stalls[]) {
			int cpsf = 1;
			int lp = stalls[0];
			for (int i = 1; i < stalls.length; i++) {
				if (stalls[i] - lp >= dist) {
					lp=stalls[i];
					cpsf += 1;
				}
				if (cpsf >= noc) {
					return true;
				}
			}
			return false;

		}
	}
