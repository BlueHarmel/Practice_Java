//������ �ý� - �ǹ�1
import java.io.*;

public class baekjoon_2156 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n+1];
		for(int i=1; i < n+1; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		// ����� �� ������ (dp�迭�� n��° ���α��� ������ �� ���� �� �ִ� �ִ��)
		// 1. ������������ �ִ� �� + ����°(n-1)��° �� + ���� ��
		// 2. ����(n-2)���� �ִ� �� + ���� ��
		// 3. ������(n-1) �ִ� �� (����� x)
		int[] dp = new int[n+1];
		dp[1] = arr[1];
		if(n>1) { // n =1 �� ��� ���
			dp[2] = arr[1]+arr[2];
		}
		 for(int i=3; i<n+1; i++) {
			 dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+arr[i], dp[i-3]+arr[i-1]+arr[i]));
		 }
		 System.out.println(dp[n]);
	}
}
