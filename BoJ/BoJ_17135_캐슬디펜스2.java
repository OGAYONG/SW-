package BoJ;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BoJ_17135_캐슬디펜스2 {
	static int[][] map;
	static int max=0;
	static int[] x1 = {-1,0,0};
	static int[] y1 = {0,1,-1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		map = new int[n+1][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		for(int j=0;j<m;j++) {
			map[n][j] = 2;
		}
		int answer=0;
		
		for(int i=0;i<m-2;i++) {
			for(int j=i+1;j<m-1;j++) {
				for(int k=j+1;k<m;k++) {
					int[][] check1 = new int[n+1][m];
					int[][] check2 = new int[n+1][m];
					int[][] check3 = new int[n+1][m];
					int pos1 = i; // i
					int pos2 = j;
					int pos3 = k;
					answer=0;
					
					for(int l=n;l>0;l--) { // 궁수 위치 l,i
						Queue <Point> q1 = new LinkedList<Point>();
						Queue <Point> q2 = new LinkedList<Point>();
						Queue <Point> q3 = new LinkedList<Point>();
						q1.add(new Point(l,pos1));
						q2.add(new Point(l,pos2));
						q3.add(new Point(l,pos3));
						loop1:
						while(!q1.isEmpty()) {
							Point p1 = q1.poll();
							int temp1x = p1.x;
							int temp1y = p1.y;
							check1[temp1x][temp1y] = 1;
							if(map[temp1x][temp1y] == 1 && temp1x != l) {
								answer++;
								check1[temp1x][temp1y] = -1 * l;
								break;
							}
							int dist1 = Math.abs(temp1x -l) + Math.abs(temp1y - pos1);
							if(dist1 > d) {
								break;
							}
							for(int c=0;c<3;c++) {
								int temper1 = x1[c] + temp1x;
								int temper2 = y1[c] + temp1y;
								if(temper1 <0 || temper2 <0 || temper2 >=m) {
									continue;
								}
								if(check1[temper1][temper2] == (-1 * l)) {
									break loop1;
								}
								if(check1[temper1][temper2] == 0) {
									q1.add(new Point(temper1, temper2));
								}
								
							}
						}
						loop2:
							while(!q2.isEmpty()) {
								Point p2 = q2.poll();
								int temp2x = p2.x;
								int temp2y = p2.y;
								check2[temp2x][temp2y] = 1;
								if(map[temp2x][temp2y] == 1 && temp2x != l) {
									answer++;
									check2[temp2x][temp2y] = -1 * l;
									break;
								}
								int dist2 = Math.abs(temp2x -l) + Math.abs(temp2y - pos2);
								if(dist2 > d) {
									break;
								}
								for(int c=0;c<3;c++) {
									int temper1 = x1[c] + temp2x;
									int temper2 = y1[c] + temp2y;
									if(temper1 <0 || temper2 <0 || temper2 >=m) {
										continue;
									}
									if(check2[temper1][temper2] == (-1 * l)) {
										break loop2;
									}
									if(check2[temper1][temper2] == 0) {
										q2.add(new Point(temper1, temper2));
									}
									
								}
							}
						loop3:
							while(!q3.isEmpty()) {
								Point p3 = q3.poll();
								int temp3x = p3.x;
								int temp3y = p3.y;
								check3[temp3x][temp3y] = 1;
								if( map[temp3x][temp3y] == 1 && temp3x != l) {
									answer++;
									check3[temp3x][temp3y] = -1 * l;
									break;
								}
								int dist3 = Math.abs(temp3x -l) + Math.abs(temp3y - pos3);
								if(dist3 > d) {
									break;
								}
								for(int c=0;c<3;c++) {
									int temper1 = x1[c] + temp3x;
									int temper2 = y1[c] + temp3y;
									if(temper1 <0 || temper2 <0 || temper2 >=m) {
										continue;
									}
									if(check3[temper1][temper2] == (-1 * l)) {
										break loop3;
									}
									if(check3[temper1][temper2] == 0) {
										q3.add(new Point(temper1, temper2));
									}
									
								}
							}
					
					
						
					}
					// 2 : q에서 1개씩 돌아가면서 pop, 잡은 적 check 1로  설정
					// 3 : 못잡고 성으로 가는 적 check -1로 설정
					
					
					
				}if(max < answer) {
					max = answer;
				}
			}
		}
		System.out.println(max);

	}
	// 전체 찾아보기

}
