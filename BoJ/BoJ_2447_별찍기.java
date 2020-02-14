package BoJ;

import java.util.Scanner;

public class BoJ_2447_별찍기 {
	static int n;
	static char[][] arr = new char[3000][3000];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = ' ';
			}
		}
		Star(0,0,n);
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}

	}

	private static void Star(int x, int y, int n2) {
		if(n2 == 1) {
			arr[x][y] = '*';
			return;
		}
		int div = n2/3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i == 1 && j == 1) {
					continue;
				}
				Star(x+div*i, y+div*j,div);
			}
		}
		
	return;	
	}

}
