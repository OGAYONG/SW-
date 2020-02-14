package Others;
import java.util.Scanner;

public class SWEA_1233 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testcase = 10;
		for(int t=1;t<=testcase;t++) {
			int answer =1;

			int n = sc.nextInt();
			String[][] s = new String[n+1][3];
			for(int i=1;i<=n;i++) {
				int node = sc.nextInt();
				s[node][0] = Character.toString(sc.next().charAt(0));
				if(n%2 == 0 && n/2 > i || n % 2 == 1 && n / 2 >=i) {
					s[i][1] = sc.next();
					s[i][2] = sc.next();
				}
				else if(n%2 == 0 && n/2 == i) {
					s[i][1] = sc.next();
				}
			}
			
			for(int i=1;i<=n;i++) {
				if(n/2 < i) {
					if(s[i][0].charAt(0) == '+' || s[i][0].charAt(0) == '-' || s[i][0].charAt(0) == '*' || s[i][0].charAt(0) == '/') {
						answer = 0;
						break;
					}
				}
				else {
					if(s[i][0].charAt(0) != '+' && s[i][0].charAt(0) != '-' && s[i][0].charAt(0) != '*' && s[i][0].charAt(0) != '/') {
						answer = 0;
						break;
					}
				}
			}
			System.out.println("#" + t + " " + answer);
			
			
			
			
		}

	}

}
