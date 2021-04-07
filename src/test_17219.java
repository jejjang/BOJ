import java.util.*;

//백준 17219 - 비밀번호 찾기

public class test_17219 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int save = sc.nextInt(); // 저장된 사이트 주소의 수
		int find = sc.nextInt(); // 비밀번호를 찾으려는 사이트 주소의 수

		Map<String, String> hashMap = new HashMap<String, String>(); // 해시맵 생성

		for (int i = 1; i <= save; i++) { // 입력받은 save 만큼 반복문 돌리기
			String address = sc.next(); // 저장할 사이트 주소 입력받기
			String password = sc.next(); // 저장할 사이트 주소의 비밀번호 입력받기

			hashMap.put(address, password); // 입력받은 주소, 비밀번호를 해시맵에 저장
			String value = hashMap.get(address);
		}

		for (int i = 1; i <= find; i++) { // 입력받은 find 만큼 반복문 돌리기
			String address = sc.next(); // 비밀번호를 찾고자 하는 사이트 주소 입력받기

			if (hashMap.containsKey(address)) { // 해시맵에 찾고자 하는 사이트 주소가 있으면 비밀번호 출력, 아니면 출력 X
				System.out.println(hashMap.get(address));
			}
		}
	}
}
