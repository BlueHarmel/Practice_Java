
import java.io.*;

public class baekjoon_9095 {
	static int T;
	
	public static void main(String[] args) throws IOException{
		// ���� n �� 123�� ������ ��Ÿ���� ����� �� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		int arr[] = new int[11]; //n+2�� �ϸ� �ȵǴ� ����? ArrayIndexOutOfBounds�� ��
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		for(int a=0; a<T; a++) {
			int n = Integer.parseInt(br.readLine());
			// 4�� ���� ���
			// 1+3 => 3�� ����Ǽ� 4
			// 2+2 => 2�� ����� �� 2
			// 3+1 => 1�� ����� �� 1
			// 3���� ���� ��� ������ ����� �� ���ϸ� ��
			for(int i=4; i<n+1; i++) {
				arr[i] = arr[i-1]+arr[i-2]+arr[i-3];
			}
			System.out.println(arr[n]);
		}

	}
}
