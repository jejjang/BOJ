import java.util.Scanner;

public class test_4796 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 1; // case 문을 위한 count 변수

		while (true) {
			int L = sc.nextInt(); // 사용 가능한 일수 10
			int P = sc.nextInt(); // 연속하는 일수 20
			int V = sc.nextInt(); // 휴가 일수 28

			if (L < 1 || P < 1 || V < 1) { // (1 < L < P < V) 범위 설정, 범위에 맞지 않는 수가 들어올 경우 강제 종료
				break;
			} else if ((L > P || L > V) || (P < L || P > V) || (V < L || V < P)) {
				break;
			}

			if (L == 0 && P == 0 && V == 0) { // L, P, V가 모두 0일 경우 반복문 종료
				System.exit(0);
			}

			int rest = (V % P) > L ? L : V % P; // 나머지가 L(사용 가능한 일수)보다 크면 그대로 L, 아니면 V % P(휴가 일수 % 연속하는 일수)
			int result = ((V / P) * L) + rest; // 결과값, ((휴가 일수 / 연속하는 일수 ) * 사용가능한 일수) + 나머지 값
			System.out.println("Case " + count + ": " + result);
			count++; // 반복문이 끝날 때마다 count 값 1씩 증가
		}
	}

}
