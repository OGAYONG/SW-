package Others;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Jungol_1863_종교2 {
	static LinkedList<Integer>[] student;
	static Queue<Integer> q = new LinkedList<Integer>();
	static int n;
	static int m;
	static boolean[] check;
	static int answer = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		student = new LinkedList[n+1];
		for(int i=1;i<n+1;i++) {
			student[i] = new LinkedList();
		}
		check = new boolean[n+1];
		for(int i=0;i<m;i++) {
			int temp1 = sc.nextInt();
			int temp2 = sc.nextInt();
			student[temp1].add(temp2);
			student[temp2].add(temp1);
		}
		
		
		for(int i=1;i<=n;i++) {
			if(check[i] == false) {
				answer++;
				check[i] = true;
				q.add(i);
				while(!q.isEmpty()) {
					int temp = q.poll();
					while(!student[temp].isEmpty()) {
						int temp3 = student[temp].pop();
						if(check[temp3] == false) {
							check[temp3] = true;
							q.add(temp3);
						}
					}
				}
				
			}
		}
		System.out.println(answer);

	}
//	public static void dfs(int index) {
//		
//		while(!student[index].isEmpty()) {
//			int temp3 = student[index].pop();		
//			if(check[temp3] == false) {
//				check[temp3] = true;
//				dfs(temp3);
//			}
//			
//		}
//	
//		
//	}

}
