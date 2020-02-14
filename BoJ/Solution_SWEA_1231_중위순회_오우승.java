package BoJ;
import java.util.Scanner;

public class Solution_SWEA_1231_중위순회_오우승 {
	static char[] arr;
	static int n;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(int t=1;t<=10;t++) {
			
			n = sc.nextInt();
			arr = new char[n+1];
			for(int i=1;i<=n;i++) {
				int a = sc.nextInt();
				arr[i] = sc.next().charAt(0);
				if(n % 2 == 0 && n/2 >i || n%2 == 1 && n/2 >=i) {
					int b = sc.nextInt();
					int c = sc.nextInt();
				}
				else if (n%2 == 0 && i == n/2) {
					int b = sc.nextInt();
				}
			}
			System.out.print("#" + t + " ");
			eOrder(1);
			System.out.println();
			
			
			
		}
	}
	private static void eOrder(int index) {
		if(index > n) {
			return;
		}
		eOrder(index*2);
		System.out.print(arr[index]);
		eOrder(index*2+1);
		
	}

}
