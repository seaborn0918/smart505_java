public class Dog2 extends Animals2 {
  public Dog2() {
    this.kind = "포유류";
  }

  // 상속받은 추상 메소드를 오버라이딩한 메소드
  @Override
  public void sound() {
    System.out.println("멍!");
  }
}
