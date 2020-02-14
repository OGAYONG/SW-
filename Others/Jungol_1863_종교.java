package Others;
import java.util.Scanner;

public class Jungol_1863_종교 {
	static int[][] student;
	static int n;
	static int m;
	static boolean[] check;
	static int answer = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		student = new int[n+1][n+1];
		check = new boolean[n+1];
		for(int i=0;i<m;i++) {
			int temp1 = sc.nextInt();
			int temp2 = sc.nextInt();
			student[temp1][temp2] = 1;
			student[temp2][temp1] = 1;
		}
		for(int i=1;i<=n;i++) {
			if(check[i] == false) {
				answer++;
				dfs(i);
			}
		}
		System.out.println(answer);

	}
	public static void dfs(int index) {
		check[index] = true;
		for(int j=1;j<=n;j++) {
			if(student[index][j] == 1 && check[j] == false) {
				dfs(j);
			}
		}
	}

}
