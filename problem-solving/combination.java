import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class combination {
	static int N, R;
	static int numbers[], combination[];

	public static void main(String[] args) throws IOException {
		// input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());	// numbers[]의 숫자 N개 중
		R = Integer.parseInt(st.nextToken());	// R개를 뽑은 조합
		numbers = new int[N];				// N개의 숫자 저장
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		combination = new int[R];		// 조합(결과) 저장
		comb(0, 0);
	}
	
	/** 
	 * numbers[]의 숫자 n개 중 r개를 뽑은 조합을 combination[]에 저장
	 * start : 뽑기 시작할 인덱스, cnt : 뽑은 개수
	 *  */
	private static void comb(int start, int cnt) {
		if(cnt == R) {
			for(int x : combination) {
				System.out.print(x + " ");
			}
			System.out.println();
		} else {
			for(int i = start; i < N; i++) {
				combination[cnt] = numbers[i];
				comb(i + 1, cnt + 1);
			}
		}
	}

}

/*
input
5 3
1 2 3 4 5

output
1 2 3 
1 2 4 
1 2 5 
1 3 4 
1 3 5 
1 4 5 
2 3 4 
2 3 5 
2 4 5 
3 4 5 
*/
