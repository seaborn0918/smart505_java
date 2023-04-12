// 클래스 Computer는 클래스 Calculator를 생성받아 모든 멤버를 가져옴
public class Computer extends Calculator {
  // 부모 클래스 Calculator가 상속해준 areaCircle() 메소드
  // 오버라이딩: 상속 받은 메소드의 접근제한자, 반환값, 메소드 이름, 매개변수의 개수/타입/순서까지 동일하게 구성하고 코드 블록의 내용만 수정하는 것
  @Override
  double areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle() 실행");
    return Math.PI * r * r;
  }

  // 오버라이딩된 메소드
  // 오버라이딩하려고 했지만 사용자의 실수에 의해서 선언부의 변경이 있을 경우 오버라이딩이 되지 않고 자식 클래스의 전용의 메소드로 인식됨
  // @Override 오류 표시
  public int total(int x, int y) {
    System.out.println("computer 클래스의 오버라이딩 된 total() 메소드");
    int result = x + y;
    System.out.println("두 수의 덧셈은 " + result + "입니다.");
    return result;
  }
}
