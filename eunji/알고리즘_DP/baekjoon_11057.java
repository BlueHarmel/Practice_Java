import java.io.*;
//������ �� �ǹ�1
//������ �� : ���� �� �ڸ��� ���������� �̷��(���ϰ� ����) ��
//N�� ������ ������ ���� ������ 10007�� ���� ������ ���ϴ� ���α׷�
public class baekjoon_11057 {
	static int N;
	static int[][] dp;
	static final int MOD=10007;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		dp = new int[10][10];
		// �ʱⰪ ����!
		for(int j=0; j<=9; j++) {
			dp[0][j] = 1;
		}
		// dp[i][j] = p=i~9������ dp[p][j-1]���� �հ� ����!
		for(int i=1; i<=N;i++) {
			for(int j=0; j<=9;j++) {
				for(int p=j; p<=9; p++) {
					dp[i][j]+=dp[i-1][p];
					dp[i][j]%=MOD;
				}
			}
		}
		
		System.out.println(dp[N][0]%MOD);
			
	}
}
