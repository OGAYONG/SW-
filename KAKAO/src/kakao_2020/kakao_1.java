package kakao_2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kakao_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int answer = solution(s);
		
		System.out.println(answer);

	} // end of main

	private static int solution(String s) {
		int len = s.length();
		int answer = len;
		for(int i=1;i<=len/2;i++) {
			String cycle = "";
			String temp = "";
			int j=i;
			int cycle_count =1;
			for(int l=0;l<i;l++) {
				cycle += s.charAt(l);
				temp += s.charAt(l);
			}
			while(j<len) {
				if(j+i > len) {
					if(cycle_count !=1) {
						temp += cycle_count;
					}
					while(j<len) {
						temp+=s.charAt(j);
						j++;
					}
					break;
				}
				for(int k=0;k<i;k++) {
					if(cycle.charAt(k) != s.charAt(k+j)) {
						cycle = "";
						for(int l=0;l<i;l++) {
							cycle += s.charAt(j+l);
							if(cycle_count !=1) {
								temp += cycle_count;
							}
							temp += s.charAt(j+l);
							cycle_count = 1;
						}
						break;
					}
					if(k == i-1) {
						cycle_count++;
					}
				}
				j+= i;
				if(j == len) {
					if(cycle_count !=1) {
						temp += cycle_count;
					}
					break;
				}
			} // end of while ( 전체 돌기)
			if(answer > temp.length()) {
				answer = temp.length();
			}


			
		} // end of game
		return answer;
	}
 
} // end of class
