import java.util.Scanner;
import java.util.Stack;

// 백준 4949 - 균형잡힌 세상

public class test_4949 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			String s = sc.nextLine(); // 문장 한 라인 전체를 입력받는 것이기 때문에 nextLine을 사용해주어야 함.
			String[] array = s.split("");
			Stack<String> stack = new Stack<>(); // Stack 생성

			if (s.equals(".")) { // "." 이 들어올 경우 입력 종료
				System.exit(0);
			}

			for (String str : array) {
				if (str.equals("(") || str.equals("[")) { // 왼쪽 소괄호, 왼쪽 대괄호가 있으면 stack에 push
					stack.push(str);
				} else if (str.equals(")") && !stack.isEmpty() && stack.peek().equals("(")) { // 오른쪽 소괄호가 있고 stack이 비어있지
																								// 않고 stack의 가장 위에 있는
																								// 항목이 왼쪽 소괄호이면 pop
					stack.pop();
				} else if (str.equals("]") && !stack.isEmpty() && stack.peek().equals("[")) { // 오른쪽 대괄호가 있고 stack이 비어있지
																								// 않고 stack의 가장 위에 있는
																								// 항목이 왼쪽 대괄호이면 pop
					stack.pop();
				} else if (str.equals(")") || str.equals("]")) // 오른쪽 소괄호, 오른쪽 대괄호만 있을 경우에는 stack에 push
					stack.push(str);

			}

			if (stack.empty()) { // stack이 비어있다는 것은 문장이 균형을 이루고 있다는 의미이므로 yes 출력, 그렇지 않으면 no 출력
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		}
	}
}
