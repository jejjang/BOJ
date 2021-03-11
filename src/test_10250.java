import java.util.Scanner;

public class test_10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt(); // 몇 번 반복할건지

		for (int i = 1; i <= T; i++) {
			int H = sc.nextInt(); // 각 호텔의 층 수
			int W = sc.nextInt(); // 각 층의 방 수
			int N = sc.nextInt(); // 몇 번째 손님인지

			int f = 0; // 층수
			int d = 0; // 호수

			if (N % H == 0) {
				f = H;
				d = N / H;
			} else {
				f = N % H;
				d = N / H + 1;
			}

			if (W * H < N) {
				break; // 인원수 초과시 강제 종료
			}

			// 출력
			System.out.println((f * 100) + d);
		}
		sc.close();
	}
}