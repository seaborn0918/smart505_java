public class Car {
  // 인터페이스 타입의 변수 선언
  // 해당 변수에 자식 클래스 타입의 객체를 저장
  Tire frontLetfTire = new HanKookTire();
  Tire frontRightTire = new HanKookTire();
  Tire backLeftTire = new HanKookTire();
  Tire backRightTire = new HanKookTire();

  void run() {
    frontLetfTire.roll();
    frontRightTire.roll();
    backLeftTire.roll();
    backRightTire.roll();
  }
}
