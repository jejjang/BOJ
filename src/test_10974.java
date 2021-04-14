import java.util.*;

//백준 10974 - 모든 순열

public class test_10974 {
	static int[] array;
	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt(); // N 입력받기

		array = new int[N]; // 데이터를 담을 N 크기의 array 생성

		for (int i = 0; i < array.length; i++) { // array 배열의 크기만큼 배열 생성 및 초기화. 예를 들어, 크기가 3일 경우 a[0]=1,a[1]=2,a[2]=3
			array[i] = i + 1;
		}

		sequence(0, new int[N], new boolean[N]); // sequence 메소드 호출

	}

	static void sequence(int M, int[] arr, boolean[] visited) { // sequence 메소드 생성, visited 배열은 방문 여부를 확인하는 역할
		if (M == N) { // M은 반복문이 몇 번째 돌고 있는지를 나타내고, M과 N이 같아질 경우 다 돌았다는 의미로 종료
			for (int i = 0; i < N; i++) {
				if (N == 0) {
					continue;
				}
				System.out.print(arr[i] + " ");

			}
			System.out.println("");
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[M] = array[i];
				sequence(M + 1, arr, visited);
				visited[i] = false;
			}
		}
	}
}
