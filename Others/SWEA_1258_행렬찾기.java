package Others;
import java.awt.Point;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class SWEA_1258_행렬찾기 {
	static int[] x1 = {1,0,0,-1};
	static int [] y1 = {0,-1,1,0};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t=1;t<=testcase;t++) {
			int n = sc.nextInt();
			int[][] arr = new int[n][n];
			int[][] check = new int[n][n];
			int count =0;
			Stack<Point> s = new Stack<Point>();
			for(int i=0;i<n;i++) {
				for(int j=0 ;j<n;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(arr[i][j] !=0 && check[i][j] == 0) {
						count ++;
						s.add(new Point(i,j));
					}
					while(!s.empty()) {
						Point p = s.pop();
						int tempx = p.x;
						int tempy = p.y;
						check[tempx][tempy] = count;
						for(int k=0;k<4;k++) {
							if(tempx + x1[k] >=n || tempy+y1[k] >=n || tempx +x1[k] <0 || tempy + y1[k] < 0) {
								continue;
							}
							if(check[tempx+x1[k]][tempy+y1[k]] == 0 && arr[tempx+x1[k]][tempy+y1[k]] != 0) {
								s.add(new Point(tempx+x1[k], tempy+y1[k]));
							}
						}
					}
				}
			}
			int[][] answer = new int[count][3];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(arr[i][j] !=0 && answer[check[i][j]][0] !=0 && answer[check[i][j]][1] != 0) {
						for(int k=i;k<n;k++) {
							if(arr[k][j] == 0) {
								answer[check[i][j]][0] = k-i;
								break;
							}
						}
						for(int l=j;l<n;l++) {
							if(arr[i][l] == 0) {
								answer[check[i][j]][1] = l-j;
								break;
							}
						}
					}
					else if(i ==0 && j == 0 && arr[i][j]!=0) {
						for(int k=i;k<n;k++) {
							if(arr[k][j] == 0) {
								answer[check[i][j]][0] = k-i;
								break;
							}
						}
						for(int l=j;l<n;l++) {
							if(arr[i][l] == 0) {
								answer[check[i][j]][1] = l-j;
								break;
							}
						}
					}
				}
			}
			for(int i=0;i<count;i++) {
				answer[i][2] = answer[i][0] * answer[i][1];
			}
			Arrays.sort(answer, new Comparator<int[]> (){

				@Override
				public int compare(int[] o1, int[] o2) {
					final int temp1 = o1[2];
					final int temp2 = o2[2];
					if(temp1 < temp2) {
						return -1;
					}
					else if(temp1 == temp2) {
						return (o1[1] < o2[1]) ? -1 : 1;
					}
					else {
						return 1;
					}
					
				}
				
			});
			
			System.out.println("#" + t + " " + count + " ");
			for(int i=0;i<count;i++) {
				System.out.print(answer[i][0] + " " + answer[i][1] + " ");
			}
		}

	}

}
