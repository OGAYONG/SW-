//import java.util.Scanner;
//
//public class BoJ_17471 {
//	static int n;
//	static int[] popul;
//	static int[][] map;
//	static int[] check;
//	static int[] check2;
//	static int suma=0;
//	static int sumb =0;
//	static int min = Integer.MAX_VALUE;
//	static int count =0;
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		popul = new int[n+2];
//		map = new int[n+2][n+2];
//		check = new int[n+2];
//		check2 = new int[n+2];
//		for(int i=1;i<=n;i++) {
//			popul[i] = sc.nextInt();
//		}
//		for(int i=1;i<=n;i++) {
//			int temp = sc.nextInt();
//			for(int j=1;j<=temp;j++) {
//				int temp2 = sc.nextInt();
//				map[i][temp2] = 1;
//			}
//		}
//		// dfs로 연결구역 나누기
//		// 그래프가 3개이상이면 -1
//		// 그래프가 2개면 그대로 
//		// 그래프가 1개면 
//		// 2^10 경우의 수 도전
//		// 1) 1~n까지 index 차례대로 true / false 분기
//		// 2) index가 n일 때 min 값 비교하기
//		// 3) check 초기화
//		for(int i=1;i<=n;i++) {
//			if(check[i] == 0) {
//				count ++;
//				dfs(i);
//			}
//		}
//		if(count >=3) {
//			System.out.println(-1);
//			return;
//		}
//		else if(count == 2) {
//			for(int i=1;i<=n;i++) {
//				if(check[i] == 1) {
//					suma += popul[i];
//				}
//				else {
//					sumb += popul[i];
//				}
//			}
//			System.out.println(absolu(suma, sumb));
//			return;
//		}
//		else {
//			dfs2(1,1);
//		}
//	}
//	
//	public static int absolu(int a, int b) {
//		if(a > b) {
//			return a-b;
//		}
//		else {
//			return b-a;
//		}
//	}
//	public static void dfs (int a) {
//		check[a] = count;
//		for(int j=1;j<=n;j++) {
//			if(map[a][j] == 1 && check[j] == 0) {
//				dfs(j);
//			}
//		}
//		
//	}
//	public static void dfs2 (int index, int team) {
//		if(index >n) {
//			suma =0;
//			sumb =0;
//			for(int k=1;k<=n;k++) {
//				if(check2[k] == 1) {
//					
//				}
//				else {
//					
//				}
//			}
//			return;
//		}
//		
//		check2[index] = team;
//		dfs2(index+1, team);
//		
//		dfs2(index+1, team * (-1));
//		
//	}
//	
//	
//	
//	
//
//}
