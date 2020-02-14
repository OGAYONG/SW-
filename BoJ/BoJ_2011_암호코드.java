package BoJ;

import java.util.Scanner;

public class BoJ_2011_암호코드 {

	public static void main(String[] args) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) < '0' || s.charAt(i) > '9') {
				System.out.println(0);
				return;
			}
		}
		if(s.charAt(0) == '0') {
			System.out.println(0);
			return;
		}
		int [] dp = new int[5001]; // dp[][n]은 앞자리가 n인 경우
		dp[1] = 1;
		if(s.length() == 1) {
			System.out.println(1);
			return;
		}
		if(s.charAt(0) == '1' && s.charAt(1) > '0') {
			dp[2] =2;
		}
		else if(s.charAt(0) == '2'&& s.charAt(1) <= '6'&& s.charAt(1) > '0') {
			dp[2] =2;
		}
		else {
			dp[2] =1;
		}
		for(int i=3;i<=s.length();i++) {
			int a1 = s.charAt(i-2) - '0';
			int a2 = s.charAt(i-1) - '0';
			int num = a1 *10 + a2;
			if(num >0 && num <=26) {
				dp[i] = dp[i-2] + dp[i-1];
			}
			else if(num ==0) {
				System.out.println(0);
				return;
			}
			else {
				dp[i] = dp[i-1];
			}
			dp[i] %= 1000000;
		}
		System.out.println(dp[s.length()]);

	}

}