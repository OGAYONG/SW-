//package BoJ;
//
//import java.awt.Point;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class BoJ_17135_캐슬디펜스 {
//	static int[][] map;
//	static int[][] copymap;
//	static int max=0;
//	static int[] x1 = {0,-1,0};
//	static int[] y1 = {-1,0,1};
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int d = sc.nextInt();
//		map = new int[n+1][m];
//		copymap = new int[n+1][m];
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<m;j++) {
//				map[i][j] = sc.nextInt();
//			}
//		}
//		
//		for(int j=0;j<n;j++) {
//			map[n][j] = 2;
//		}
//		
//		for(int i=0;i<m-2;i++) {
//			for(int j=i+1;j<m-1;j++) {
//				for(int k=j+1;k<m;k++) {
////					for(int l=0;l<=n;l++) {
////						copymap[l] = map[l].clone();
////					}
//					int[][] check = new int[n+1][m];
//					int pos1 = i; // i
//					int pos2 = j;
//					int pos3 = k;
//					int answer=0;
//					int dist=0;
////					int dist1 = 0;
////					int dist2 = 0;
////					int dist3 = 0;
//					Queue <Point> q = new LinkedList<Point>();
//					
//					q.add(new Point(n,pos1));
//					q.add(new Point(n,pos2));
//					q.add(new Point(n,pos3));
//					// 사정거리 안의 사물 제거하기 X
//					// 3중 bfs? - 거리순으로 하나씩?
//					// 1 : 궁수 위치 q 3개에 입력, check all 0설정
//					for(int l=n;l>0;l--) { // 궁수 위치 i,l 
//						while(!q.isEmpty()) {
//							
//							//거리 d 이내의 한 점 찾아내기 , 밑으론 안가게
//							Point p1 = q.poll();
//							int temp1x = p1.x;
//							int temp1y = p1.y;
//							check[temp1x][temp1y] = 1;
//							if(dist > d) {
//								break;
//							}
//							if(check[temp1x][temp1y] == 0 && map[temp1x][temp1y] == 1) {
//								answer++;
//								check[temp1x][temp1y] = -1;
//								break;
//							}
//							for(int c=0;c<3;c++) {
//								int temper1 = x1[c] + temp1x;
//								int temper2 = y1[c] + temp1y;
//								if(temper1 <0 || temper2 <0 || temper2 >=m) {
//									continue;
//								}
//								if(check[temper1][temper2] == 0 && dist1 <= d) {
//									q1.add(new Point(temper1, temper2));
//								}
//								
//							}
//							dist1 ++;
//							
//						}
//						while(!q2.isEmpty()) {
//							
//							//거리 d 이내의 한 점 찾아내기 , 밑으론 안가게
//							Point p2 = q2.poll();
//							int temp2x = p2.x;
//							int temp2y = p2.y;
//							check[temp2x][temp2y] = 1;
//							if(dist2 > d) {
//								break;
//							}
//							if(temp2x < l) {
//								continue;
//							}
//							if(check[temp2x][temp2y] == 0 && map[temp2x][temp2y] == 1) {
//								answer++;
//								break;
//							}
//							for(int c=0;c<3;c++) {
//								int temper1 = x1[c] + temp2x;
//								int temper2 = y1[c] + temp2y;
//								if(temper1 <0 || temper2 <0 || temper2 >=m) {
//									continue;
//								}
//								if(check[temper1][temper2] == 0 && dist2 <= d) {
//									q1.add(new Point(temper1, temper2));
//								}
//								
//							}
//							dist2 ++;
//						}
//						while(!q2.isEmpty()) {
//							
//							//거리 d 이내의 한 점 찾아내기 , 밑으론 안가게
//							Point p2 = q2.poll();
//							int temp2x = p2.x;
//							int temp2y = p2.y;
//							check[temp2x][temp2y] = 1;
//							if(dist2 > d) {
//								break;
//							}
//							if(temp2x < l) {
//								continue;
//							}
//							if(check[temp2x][temp2y] == 0 && map[temp2x][temp2y] == 1) {
//								answer++;
//								break;
//							}
//							for(int c=0;c<3;c++) {
//								int temper1 = x1[c] + temp2x;
//								int temper2 = y1[c] + temp2y;
//								if(temper1 <0 || temper2 <0 || temper2 >=m) {
//									continue;
//								}
//								if(check[temper1][temper2] == 0 && dist2 <= d) {
//									q1.add(new Point(temper1, temper2));
//								}
//								
//							}
//							dist2 ++;
//						}
//						
//						
//					}
//					// 2 : q에서 1개씩 돌아가면서 pop, 잡은 적 check 1로  설정
//					// 3 : 못잡고 성으로 가는 적 check -1로 설정
//					
//					
//					
//				}
//			}
//		}
//
//	}
//	// 전체 찾아보기
//
//}
