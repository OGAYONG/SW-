package Others;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Jungol_1858_냉장고 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] c = new int[n][2];
	
		for(int i=0;i<n;i++) {
			c[i][0] = sc.nextInt();
			c[i][1] = sc.nextInt();
		}
		Arrays.sort(c, new Comparator<int[]>() {

			public int compare(int[] o1, int[] o2) {
				final int temp1 = o1[1];
				final int temp2 = o2[1];
				return Integer.compare(temp1, temp2);
			}
			
		});
		int min = c[0][1];
		int answer =1;
		for(int i=1;i<n;i++) {
			if(min < c[i][0]) {
				answer ++;
				min = c[i][1];
			}
		}
		System.out.println(answer);
	}

}
