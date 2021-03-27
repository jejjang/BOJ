import java.util.Scanner;

public class test_19947 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();
		int Y = sc.nextInt() + 1; // 예를 들어, Y+1을 안해줄 경우 투자 기한이 3년이면 배열의 최종 값은 3년차가 아닌 2년차로 나옴.

		int[] array = new int[Y];
		array[0] = H; // 배열의 첫 번째 값은 투자 기간 0년차

		for (int i = 1; i < Y; i++) {
			array[i] = (int) (array[i - 1] * 1.05);
			if (i >= 3)
				array[i] = (int) Math.max(array[i], array[i - 3] * 1.2);
			if (i >= 5)
				array[i] = (int) Math.max(array[i], array[i - 5] * 1.35);
		}

		System.out.println(array[Y - 1]);

	}
}