package BoJ;

import java.util.Scanner;

public class BoJ_14501_퇴사 {
	static int[] b = new int[17];
	static int n;
	static int [][] pro;
	static int answer =0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		pro = new int[n+1][2]; //pro[][0]은 날짜 pro[][1] 은 이익
		for(int i=1;i<=n;i++) {
			pro[i][0] = sc.nextInt();
			pro[i][1] = sc.nextInt();
		}

		dfs(0,true);
		System.out.println(answer);
		
	}
	public static void dfs(int index, boolean check) {
		if(index ==0) {
			dfs(1,true);
			for(int i=1;i<=n;i++) {
				b[i] = 0;
			}
			dfs(1,false);
			return;
		}
		if(check == true && b[index] != 0) {
			return;
		}
		if(index == n) {
			int max=0;
			if(pro[index][0] == 1 && check == true) {
				b[index] = index;
			}
			else if(check == true && pro[index][0] > 1) {
				return;
			}
			
			for(int i=1;i<=n;i++) {
				if(b[i] == i) {
					max += pro[i][1];
				}
			}
			if(max > answer) {
				answer = max;
			}
			if(check == true) {
				b[index] = 0;
			}
			return;
		}
		int temp1 = pro[index][0];
		if(check == true && index + temp1 <= n+1) {
			for(int i=0;i<temp1;i++) {
				b[index+i] = index;
			}
			if(index + temp1 != n+1) {
				dfs(index+temp1, true);
				for(int i=index+temp1;i<=n;i++) {
					b[i] = 0;
				}
				dfs(index+temp1, false);
			}
			else {
				dfs(n,true);
				b[n] = 0;
				dfs(n, false);
			}
			
			
		}
		
		if(check == false) {
			dfs(index+1, true);
			for(int i=index;i<=n;i++) {
				b[i] = 0;
			}
			dfs(index+1, false);
		}
		
	}

}
