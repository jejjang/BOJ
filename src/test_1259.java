import java.util.Scanner;

public class test_1259 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) { // while문을 통해서 첫 번째 자리에 0이 들어오기 전까지 계속해서 입력 반복
			String word = sc.next();
			String[] array = word.split("");

			if (array[0].equals("0")) { // 첫 번째 자리에 0이 들어올 경우 종료
				System.exit(0);
			}

			boolean chk = false;

			if (array.length % 2 == 0) { // 문자열의 길이가 짝수일 때
				for (int i = 0; i < array.length / 2; i++) {
					if (word.charAt(i) != word.charAt(array.length - 1 - i)) {
						chk = true;
						break;
					}
				}
			} else { // 문자열의 길이가 홀수일 때
				for (int i = 0; i < array.length / 2; i++) {
					if (word.charAt(i) != word.charAt(array.length - 1 - i)) {
						chk = true;
						break;
					}
				}
			}

			if (chk) {
				System.out.println("no");
			} else {
				System.out.println("yes");
			}
		}
	}
}