package Others;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BoJ_10989_정렬3 {
	static int[] arr = new int[10001];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		
		for(int i=0;i<n;i++) {
			arr[Integer.parseInt(br.readLine())] ++;
		}
		for(int i=1;i<10001;i++) {
			if(arr[i] == 0) {
				continue;
			}
			for(int j=arr[i];j>0;j--) {
				bf.write(Integer.toString(i) + "\n");
			}
		}
		bf.flush();
		bf.close();
	}
		
		
		
		

}
