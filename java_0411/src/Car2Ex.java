public class Car2Ex {
  public static void main(String[] args) {
    Car2 car = new Car2();

    // car.speed = 100; // 접근 불가능
    // setter를 사용하여 speed를 수정
    car.setSpeed(-50);

    // getter를 사용하여 speed를 가져옴
    System.out.println("현재 속도 : " + car.getSpeed());

    car.setSpeed(60);

    System.out.println("현재 속도 : " + car.getSpeed());

    if (!car.isStop()) {
      car.setStop(true);
    }

    System.out.println("현재 속도 : " + car.getSpeed());

  }
}
