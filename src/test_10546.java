import java.util.*;

//백준 10546 - 배부른 마라토너
// 결과값은 나오나 시간초과 뜸

public class test_10546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		if (N < 1 || N > 100000)
			return;

		Map<String, Integer> hashMap = new HashMap<String, Integer>(); // 해시맵 생성

		for (int i = 0; i < N; i++) { // 참가자의 이름
			String name = sc.next();

			if (name.length() < 1 || name.length() > 20) // 이름 길이 제한
				return;

			if (hashMap.containsKey(name)) {
				int value = hashMap.get(name);
				hashMap.put(name, value + 1);
			} else {
				hashMap.put(name, 1);
			}
		}

		for (int i = 0; i < N - 1; i++) { // 완주한 참가자의 이름, 얘는 value 값이 1인 애가 정답
			String name = sc.next();

			if (name.length() < 1 || name.length() > 20)
				return;

			if (hashMap.containsKey(name)) {
				int value = hashMap.get(name);
				if (value == 1) {
					hashMap.remove(name, value);
				}
			}
		}

		for (String mapkey : hashMap.keySet()) { // 완주하지 못한 참가자의 이름 출력
			System.out.println(mapkey.toLowerCase()); // 대문자가 들어올 경우 소문자로 변경하여 출력
		}
	}
}
