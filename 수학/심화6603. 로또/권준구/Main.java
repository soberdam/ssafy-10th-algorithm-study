import java.util.Scanner;

public class Main {

	static int[] arr;
	static boolean[] visit;
	static int N;

	public static void dfs(int start, int depth) {
		if(depth == 6) {	// 탈출 조건(출력)
			for(int i=0; i<N; i++) {
				if(visit[i] == true) {	// 탐색된곳을 출력
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
                        return;	// 재귀 함수 종료

		}
		
		for(int i=start; i<N; i++) {
			visit[i] = true;	// 방문한 곳 체크
			dfs(i+1, depth+1);	// 재귀호출, 하나의 깊이를 탐색 후 => 다음 호출시 깊이+1
			visit[i] = false;	// 초기화
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			N = scan.nextInt();
			arr = new int[N];
			visit = new boolean[N];
			
			if(N == 0)
				break;
			
			for(int i=0; i<N; i++) {
				arr[i] = scan.nextInt();
			}
			
			dfs(0, 0);
			System.out.println();
		}

		scan.close();
	}

}
