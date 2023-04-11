public class Calculator4Ex {
  public static void main(String[] args) {
    // 정적(static) 멤버: 클래스의 멤버로 동작하는 필드와 메소드
    // 객체 생성없이 클래스의 이름을 통해서 필드와 메소드에 접근이 가능
    // 정적 멤버는 데이터를 공유
    // 클래스명.멤버명으로 접근
    // 일반 인스턴스 멤버는 정적 멤버를 사용할 수 있음
    // 정적 멤버는 일반 인스턴스 멤버를 사용할 수 없음(클래스 로딩 시 함께 로딩 됨. main 메소드가 실행되지 않은 상태면 객체 존재하지 않음 즉, 객체 존재하는지 보장되지 않음)

    double result1 = 10 * 10 * Calculator4.pi;
    int result2 = Calculator4.plus(10, 5);
    int result3= Calculator4.minus(10, 5);

    System.out.println("result1 : " + result1);
    System.out.println("result2 : " + result2);
    System.out.println("result3 : " + result3);
  }
}
