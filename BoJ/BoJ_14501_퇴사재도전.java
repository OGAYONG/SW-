package BoJ;

import java.util.Scanner;

public class BoJ_14501_퇴사재도전 {
	static int n;
	static int [][] pro;
	static int[] d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		pro = new int[n+2][2]; //pro[][0]은 날짜 pro[][1] 은 이익
		for(int i=1;i<=n;i++) {
			pro[i][0] = sc.nextInt();
			pro[i][1] = sc.nextInt();
		}
		int result =0;
		d = new int[n+2];
		for(int i=1;i<=n;i++) {
			if(i+pro[i][0] <=n+1) {
				d[i+pro[i][0]] = max(d[i+pro[i][0]], d[i] + pro[i][0]);
				result = max(result, d[i+pro[i][0]]);
			}
			d[i+1] = max(d[i+1], d[i]);
			result = max(result, d[i+1]);
		}
		System.out.println(result);

		
	}

	private static int max(int i, int j) {
		
		return i>j ? i: j;
	}
}
