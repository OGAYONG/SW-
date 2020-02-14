package Others;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SWEA_1258_행렬찾기2 {
	static int[] x1 = {1,0,0,-1};
	static int [] y1 = {0,-1,1,0};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for(int t=1;t<=testcase;t++) {
			int n = sc.nextInt();
			int[][] arr = new int[n+2][n+2];
			int[][] check = new int[n+2][n+2];
			int count =0;
			for(int i=1;i<=n;i++) {
				for(int j=1 ;j<=n;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int[][] answer = new int[n*n][3];
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					if(arr[i][j] !=0 && arr[i-1][j] ==0 && arr[i][j-1] == 0) {
						count ++;
						for(int k=i;k<=n+1;k++) {
							if(arr[k][j] == 0) {
								answer[count][0] = k-i;
								break;
							}
							
						}
						for(int l = j;l<=n+1;l++) {
							if(arr[i][l] == 0) {
								answer[count][1] = l-j;
								answer[count][2] = answer[count][0] * answer[count][1];
								break;
							}
						}
					}
				}
			}
			Arrays.sort(answer, 1, count+1, new Comparator<int[]> () {

				@Override
				public int compare(int[] o1, int[] o2) {
					if(o1[2] > o2[2]) {
						return 1;
					}
					else if(o1[2] < o2[2]) {
						return -1;
					}
					else {
						return o1[0] > o2[0] ? 1 : -1; 
					}
				}

				
			});
			System.out.print("#" + t + " " + count + " ");
			for(int i=1;i<=count;i++) {
				System.out.print(answer[i][0] + " " + answer[i][1] + " ");
				
			}
			System.out.println();
			
			
			
			
			
			
		}

	}

}
