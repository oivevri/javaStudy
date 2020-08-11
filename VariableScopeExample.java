public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 10;
		// int v2; v2는 선언만 했지 할당이 안됨
		int v2 = 0;
		if(v1>10) {          // if 안의 내용이 참(True)이면 중괄호 안의 함수를 실행해라
			int v2 = v1 - 10;
		}
		int v3 = v1 + v2 + 5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
		// v1가 10보다 크지않으므로(거짓 False) int v3으로 넘어간다
	}
}