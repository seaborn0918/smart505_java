public class CarEx {
  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.run();

    myCar.frontLetfTire = new KumhoTire();
    myCar.frontRightTire = new KumhoTire();

    myCar.run();

    System.out.println("------------------");

    Car2 yourCar = new Car2();
    yourCar.run();

    yourCar.tires[0] = new HanKookTire();
    yourCar.tires[1] = new HanKookTire();

    yourCar.run();
  }
}
