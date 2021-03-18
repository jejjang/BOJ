import java.util.Scanner;

/*      몸무게     키
1번째 - [0][0]  [0][1]
2번째 - [1][0]  [1][1]
3번째 - [2][0]  [2][1]
4번째 - [3][0]  [3][1]
5번째 - [4][0]  [4][1] */

public class test_7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[][] = null;

		int N = sc.nextInt(); // 사람 수
		array = new int[N][2]; // array[row][column] = arr[행][열], 행에는 사람 수, 열에는 몸무게와 키

		int rank[] = new int[N]; // 순위 배열

		for (int i = 0; i < array.length; i++) { // 이차원 배열의 length는 행의 크기, * 참고로 열의 크기는 array[x].length
			int weight = sc.nextInt(); // 몸무게
			int height = sc.nextInt(); // 키

			array[i][0] = weight; // 0번째 열에는 몸무게
			array[i][1] = height; // 1번째 열에는 키
		}

		for (int i = 0; i < array.length; i++) { //
			rank[i] = 1; // 모든 사람의 처음 순위를 1위로 설정
			for (int j = 0; j < array.length; j++) {
				if ((array[i][0] < array[j][0]) && (array[i][1] < array[j][1])) { // 배열마다 순차적으로 비교, 몸무게&&키가 작은 사람 찾기 ->
																					// 이 과정을 사람수만큼 반복
					System.out.println(array[i][0]);
					System.out.println(array[j][0]);
					rank[i] = rank[i] + 1; // 가장 작은 인덱스 번호의 순위를 1 증가시킴
				}
			}
		}

		for (int i = 0; i < array.length; i++) { // 순위 출력
			System.out.print(rank[i] + " ");
		}
	}
}