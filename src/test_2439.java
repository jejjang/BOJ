import java.util.Scanner;

public class test_2439 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) { // 만약 j=1 이면 공백 한 칸, j=2 이면 공백 두 칸, 이런식으로 출력
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) { // 만약 j=1 이면 * 한 개, j=2 이면 * 두 개, 이런식으로 출력
				System.out.print("*");
			}
			System.out.println();
		}

	}
}