package make_one;
import java.io.*;
import java.util.*;

public class baekjoon_1463 {

	public static void main(String[] args) throws IOException{
		//ù°�� N �Է�(N <10^6)
		// 3���� ������ ����Ͽ� 1�� ���鶧 ������ ����ϴ� Ƚ���� �ּڰ��� ����Ͻÿ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		// dp[] : ������ i�� 1�� ���� �� ������ �ϴ� Ƚ���� �ּڰ�
		int dp[] = new int[N+1];
		dp[0] = dp[1] = 0;
		// 1. 3���� �����ų�
		// 2. 2�� �����ų�
		// 3. 1�� ���ų�
		// ���� �ּҰ��� ����
		for(int i= 2; i <= N; i++) {
			dp[i] = dp[i-1]+1; // ���� 1�� ���ش�.
			if(i%2==0) dp[i] = Math.min(dp[i], dp[i/2]+1); // �켱 1������ 2�� ���� �� �� �ּڰ��� dp[i]�� �����Ѵ�  
			if(i%3==0) dp[i] = Math.min(dp[i], dp[i/3]+1); // �ٽ� 3���� �������� dp[i]�� �ּҰ� ���Ѵ�.
		}
		System.out.println(dp[N]);
	
	}
}
