package fibonacci;
import java.io.*;
public class baekjoon_1003 {
	static int T;
	static int[][] answer;
	// ��Ģ 1,2(2) 2,3(3) 3,5(4)�Τ��� ���� ������ 0,1�� ������ �Ǻ���ġ�� ���� ��Ģ
	
	public static void main(String[] args) throws IOException{
		//�Ǻ���ġ �Լ����� 0�� 1�� ���� ��� ��µǴ��� ���ϱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		answer = new int[T][2];
		for(int t=0; t<T; t++) {
			int N= Integer.parseInt(br.readLine());
			int[][]dp = new int [N+2][2];
			dp[0][0]=1;
			dp[0][1]=0;
			dp[1][0]=0;
			dp[1][1]=1;
			for(int i=0; i<N-1; i++) {
				dp[i+2][0] = dp[i+1][0]+dp[i][0];
				dp[i+2][1] = dp[i+1][1]+dp[i][1];
			}
			answer[t][0] = dp[N][0];
			answer[t][1] = dp[N][1];
		}
		
		for(int t=0; t<T; t++) {
			System.out.println(answer[t][0]+" "+answer[t][1]);
		}
	}
}
 