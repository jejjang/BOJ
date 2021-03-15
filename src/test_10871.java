import java.util.Scanner;

public class test_10871 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 정수의 갯수
		int x = sc.nextInt(); // 주어진 정수

		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (x > array[i]) {
				System.out.print(array[i] + " ");
			}
		}
	}
}