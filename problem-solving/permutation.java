import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class permutation {
	static int N, R;
	static int numbers[], permutation[];
	static boolean visited[];

	public static void main(String[] args) throws IOException {
		// input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());	// numbers[]의 숫자 N개 중
		R = Integer.parseInt(st.nextToken());	// R개를 뽑아서 나열한 순열
		numbers = new int[N];				// N개의 숫자 저장
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		visited = new boolean[N];		// 숫자를 뽑았는지 여부 체크
		permutation = new int[R];			// 순열(결과) 저장
		perm(0);
	}

	/** 
	 * numbers[]의 숫자 n개 중 r개를 뽑아서 나열한 순열을 permutation[]에 저장
	 * cnt : 뽑은 개수
	 *  */
	private static void perm(int cnt) {
		if(cnt == R) {		// r개를 뽑았으면 출력
			for(int x : permutation) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
		else {
			for(int i = 0; i < N; i++) {
				if(!visited[i]) {
					permutation[cnt] = numbers[i];
					visited[i] = true;
					perm(cnt + 1);
					visited[i] = false;
				}
			}
		}
	}
}

/*
input
4 2
1 2 3 4

output
1 2 
1 3 
1 4 
2 1 
2 3 
2 4 
3 1 
3 2 
3 4 
4 1 
4 2 
4 3 
*/
