package BoJ;

import java.util.Scanner;

public class LED_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t = 1;t<=testcase;t++) {
			int n = sc.nextInt();
			int count =0;
			int[] arr = new int[n+1];
			int[] ans = new int[n+1];
			for(int i=1;i<=n;i++) {
				arr[i] = sc.nextInt();
			}
			for(int i=1;i<=n;i++) {
				int temp1 = arr[i];
				int temp2 = ans[i];
				if(temp1 == 1 && temp2 == 1) {
					continue;
				}
				else if(arr[i] == 1 && temp2 == 0) {
					for(int j = i;j<=n;j+=i) {
						if(ans[j] == 1 ) {
							ans[j] = 0;
						}
						else {
							ans[j] = 1;
						}
					}
					count ++;
				}
				else if(temp1 == 0 && temp2 == 1) {
					for(int j=1;j<=n;j+=i) {
						if(ans[j] == 1) {
							ans[j] = 0;
						}
						else {
							ans[j] = 1;
						}
					}
					count ++;
				}
				else {
					continue;
				}
			}
			System.out.println("#" + t + " " + count);
			
			
			
			
		}

	}

}
