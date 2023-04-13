public class HanKookTire extends Tire {
  public HanKookTire(String location, int maxRotation) {
    // 부모 클래스 생성자 호출
    super(location, maxRotation);
  }

  // 부모 클래스에서 상속받은 메소드 오버라이딩
  @Override
  public boolean roll() {
    ++accRotation;
    if (accRotation < maxRotation) {
      System.out.println(location + " HankookTire 수명 : " + (maxRotation - accRotation) + "회");
      return true;
    } else {
      System.out.println("*** " + location + " HanKookTire 펑크 ***");
      return false;
    }
  }
}
