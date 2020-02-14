package Others;
import java.util.Arrays;
import java.util.Scanner;

public class BoJ_17471_게리맨더링 {
	static int n;
	static int[] popul;
	static int[][] map;
	static int[] check;
	static int[] check2;
	static int[] check3;
	static int suma=0;
	static int sumb =0;
	static int min = Integer.MAX_VALUE;
	static int count =0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		popul = new int[n+2];
		map = new int[n+2][n+2];
		check = new int[n+2];
		check2 = new int[n+2];
		check3 = new int[n+2];
		for(int i=1;i<=n;i++) {
			popul[i] = sc.nextInt();
		}
		for(int i=1;i<=n;i++) {
			int temp = sc.nextInt();
			for(int j=1;j<=temp;j++) {
				int temp2 = sc.nextInt();
				map[i][temp2] = 1;
			}
		}
	
		for(int i=1;i<=n;i++) {
			if(check[i] == 0) {
				count ++;
				dfs(i);
			}
		}
		if(count >=3) {
			System.out.println(-1);
			return;
		}
		else if(count == 2) {
			for(int i=1;i<=n;i++) {
				if(check[i] == 1) {
					suma += popul[i];
				}
				else {
					sumb += popul[i];
				}
			}
			System.out.println(absolu(suma, sumb));
			return;
		}
		else {
			dfs2(1,1);
		}
		System.out.println(min);
	}
	
	public static int absolu(int a, int b) {
		if(a > b) {
			return a-b;
		}
		else {
			return b-a;
		}
	}
	public static void dfs (int a) {
		check[a] = count;
		for(int j=1;j<=n;j++) {
			if(map[a][j] == 1 && check[j] == 0) {
				dfs(j);
			}
		}
		
	}
	public static void dfs2 (int index, int team) {
		check2[index] = team;
		if(index >=n) {
			suma =0;
			sumb =0;
			Arrays.fill(check3, 0);
			dfs3(1,1);
			for(int k=1;k<=n;k++) {
				if(check2[k] == -1) {
					dfs3(k,-1);
					break;
				}
				if(k == n) {
					return;
				}
			}
			for(int k=1;k<=n;k++) {
				if(check3[k] == 0) {
					return;
				}
				else if(check3[k] == 1) {
					suma += popul[k];
				}
				else {
					sumb += popul[k];
				}
			}
			if(min > absolu(suma, sumb)) {
				min = absolu(suma, sumb);
			}
			return;
		}
		
		
		dfs2(index+1, team);
		dfs2(index+1, team * (-1));
		
	}
	public static void dfs3 (int index2, int team2) {
		check3[index2] = team2;
		for(int z=1;z<=n;z++) {
			if(map[index2][z] == 1 && team2 == check2[z] && check3[z] == 0) {
				dfs3(z,team2);
			}
		}
	}
	
	
	
	

}
