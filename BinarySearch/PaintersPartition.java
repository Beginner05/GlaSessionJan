package BinarySearch;

import java.util.Scanner;

public class PaintersPartition {

	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
	//nop=number of painter
			int nop = scn.nextInt();
			int nob = scn.nextInt();
	//nob=no.of board
			int arr[] = new int[nob];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();

			}
		int ans=	sol(nop, arr);
		System.out.println(ans);
		}

		public static int sol(int nop, int arr[]) {
			int ans = 0;
			int lo = arr[0];
			int hi = 0;
			for (int i = 0; i < arr.length; i++) {
				hi = hi + arr[i];
			}
			while (lo <= hi) {
				int mid = (lo + hi) / 2;
				if (isItPossible(arr, nop, mid) == true) {
					ans = mid;
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
			}
			return ans;
		}
		public static boolean isItPossible(int arr[],int nop,int cap)
		{
			int psf=1;
			int pcap=cap;
			for(int i=0;i<arr.length;)
			{
				if(arr[i]<=pcap)
				{
					pcap=pcap-arr[i];
					i++;
				}
				else {
					psf++;
					pcap=cap;
				}
				if(psf>nop)return false;
			}
			return true;
		}
	}
