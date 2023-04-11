public class Singleton {
  // 싱글톤

  // 자신 타입의 객체 생성
  // 외부에서 직접적인 접근 찬단
  private static Singleton singleton = new Singleton();

  // 생성자
  public Singleton() {}

  // 정적 메소드 선언
  // 미리 만들어 놓은 객체를 우회하여 사용하도록 제공
  static Singleton getInstance() {
    // 정적 필드인 singletone을 외부로 전달
    return singleton;
  }
}
