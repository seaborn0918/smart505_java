public class CarEx {
  public static void main(String[] args) {
    Car car = new Car();
    for (int i = 1; i <= 5; i++) {
      int problemLocation = car.run();
      switch (problemLocation) {
        case 1:
          System.out.println("앞왼쪽 HanKookTire로 교체");
          car.frontLeftTire = new HanKookTire("앞왼쪽", 15);
          break;
        case 2:
          System.out.println("앞오른쪽 KumhoTire로 교체");
          car.frontRightTire = new KumhoTire("앞오른쪽", 13);
          break;
        case 3:
          System.out.println("뒤왼쪽 HanKookTire로 교체");
          car.backLeftTire = new HanKookTire("뒤왼쪽", 14);
          break;
        case 4:
          System.out.println("뒤오른쪽 KumhoTire로 교체");
          car.backRightTire = new KumhoTire("뒤오른쪽", 17);
          break;
      }
      System.out.println("------------------------------");


      System.out.println("\n==============================\n");
      Car2 car2 = new Car2();

      for (i = 1; i <= 5; i++) {
        problemLocation = car2.run();

        if (problemLocation != 0) {
          System.out.println(car2.tires[problemLocation - 1].location + " HanKookTire로 교체");
          car2.tires[problemLocation - 1] = new HanKookTire(car2.tires[problemLocation - 1].location, 15);
        }
        System.out.println("------------------------------");

      }

    }

  }
}
