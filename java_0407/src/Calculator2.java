public class Calculator2 {
  int plus(int x, int y) {
    int result = x + y;
    return result;
  }

  double avg(int x, int y) {
    // plus() 메소드는 동일한 클래스의 멤버이므로 이름으로만 호출이 가능
    // 자동 타입 변환에 의해서 plus() 메소드의 반환값이 double 타입의 변수 sum에 저장
    double sum = plus(x, y);
    // 큰 데이터 타입과 작은 데이터 타입을 연산시 큰 데이터 타입으로 자동 타입 변환이 발생함
    double reslut = sum / 2;
    return reslut;
  }

  void execute() {
    // avg() 메소드를 직접 호출해서 사용
    // 동일한 클래스의 멤버이므로 메소드의 이름으로만 호출이 가능
    double result = avg(7, 10);
    println("실행 결과 : " + result);
  }

  // 절차지향이 아니라 객체지향이므로 메소드의 작성 순서는 상관 없음.
  void println(String message) {
    System.out.println(message);
  }

  // 메소드 4가지 형태(js와 동일)
  // 1. 매개변수 x, 반환값 x
  // 2. 매개변수 x, 반환값 o
  // 3. 매개변수 o, 반환값 x
  // 4. 매개변수 o, 반환값 o
}
