package BoJ;

import java.util.Scanner;

public class BoJ_1753_최단경로 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		int[][] arr = new int[e+1][3];
		
		for(int i=1;i<=e;i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = sc.nextInt();
		}
	}
}
