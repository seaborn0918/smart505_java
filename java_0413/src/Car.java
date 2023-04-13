public class Car {
    // Car 클래스를 생성하면 Tire 객체들 생성
    // hankook, kumhoTire의 부모 객체들
    Tire frontLeftTire = new Tire("앞왼쪽", 6);
    Tire frontRightTire = new Tire("앞오른쪽", 2);
    Tire backLeftTire = new Tire("뒤왼쪽", 3);
    Tire backRightTire = new Tire("뒤오른쪽", 3);


    int run() {
      System.out.println("[자동차가 달립니다.]");
      if (frontLeftTire.roll() == false) {
        stop();
        return 1;
      }

      if (frontRightTire.roll() == false) {
        stop();
        return 2;
      }

      if (backLeftTire.roll() == false) {
        stop();
        return 3;
      }

      if (backRightTire.roll() == false) {
        stop();
        return 4;
      }
      return 0;
    }

  void stop() {
    System.out.println("[자동차가 멈춥니다.]");
  }



}
