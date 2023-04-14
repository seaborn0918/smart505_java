public class Driver3Ex {
  public static void main(String[] args) {
    // 다시 확인
    Driver3 driver = new Driver3();

    Bus3 bus = new Bus3();
    Taxi3 taxi = new Taxi3();

    driver.drive(bus);
    driver.drive(taxi);
  }
}
