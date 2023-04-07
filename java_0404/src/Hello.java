// 클래스 규칙
// 1. 클래스의 이름은 해당 클래스 파일명
// 2. 하나의 파일에 하나의 클래스 작성이 기본
// 3. 클래스 이름 첫글자는 대문자, 나머지는 소문자
// 4. 2개 이상의 단어로 이름 정할 경우 각 단어의 첫글자 대문자, 나머지는 소문자
// 5. 파일명과 같은 클래스만 public을 사용할 수 있음

public class Hello {
    // 메소드(자바스크립트의 함수와 동일한 기능을 가지고 있으)
    // 클래스의 멤버인 함수를 메소드라고 함
    // 클래스의 멤버가 아닐 경우 함수라고 함
    public static int sum(int n, int m) {
        return n + m;
    }

    // 자바 프로그램의 시작점(main())
    // public static void로 선언
    // 실행 인자(실행 옵션)를 전달 받음
    public static void main(String[] args) {
        int i = 20;
        int s;
        char a;

        s = sum(i, 10);
        a = '?';

        System.out.println(a);
        System.out.println("Hello");
        System.out.println(s);
    }
}
