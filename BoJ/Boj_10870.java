package BoJ;

import java.util.Scanner;

public class Boj_10870 {
	static int answer =0;
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(Fibo(n));
		
	}

	private static int Fibo(int a) {
		if(a == 1) {
			return 0;
		}
		if(a == 2) {
			return 1;
		}
		return Fibo(a-1) + Fibo(a-2);
		
		
	}
}
