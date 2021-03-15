import java.util.Scanner;

// next()와 hasNext()의 차이점
// next()는 Iterator가 자신이 가리키는 데이터 저장소에서 현재 위치를 순차적으로 하나씩 증가해서 이동하는 것을 말하고,
// hasNext()는 Iterator가 가리키는 데이터 저장소의 현재 위치에서 이동할 항목이 있는지 체크하고, 있으면 true를 리턴, 없으면 false를 리턴함

public class test_10591 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) { // 여기서 그냥 nextInt()를 사용하면 런타임 에러가 발생
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a + b);

		}
		sc.close();
	}
}