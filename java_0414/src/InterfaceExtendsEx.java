public class InterfaceExtendsEx {
  public static void main(String[] args) {
    // 인터페이스 InterC를 구현한 클래스 ImplC 타입의 객체 생성
    ImplC implC = new ImplC();

    System.out.println("------- 인터페이스를 구현한 객체 -------");
    // ImplC 클래스에 구현한 methodA, B, C를 사용
    implC.methodA();
    implC.methodB();
    implC.methodC();

    System.out.println("------- InterA 타입의 변수에 대입 -------");
    // 조상인 InterA 타입의 변수에 자손 객체를 대입
    InterA interA = implC;
    // InterA의 멤버인 methodA만 사용 가능
    interA.methodA();
    // interA.methodB();
    // interA.methodC();

    System.out.println("------- InterB 타입의 변수에 대입 -------");
    // 조상인 InterB 타입의 변수에 자손 객체를 대입
    InterB interB = implC;
    // interB.methodA();
    // InterB의 멤버인 methodB만 사용 가능
    interB.methodB();
    // interB.methodC();

    System.out.println("------- InterC 타입의 변수에 대입 -------");
    // 조상인 InterC 타입의 변수에 자손 객체를 대입
    // InterC는 InterA, InterB를 다중 상속했기 때문에 InterA의 methodA와 InterB의 methodB, 자신 전용의 methodC를 모두 사용할 수 있음
    InterC interC = implC;
    interC.methodA();
    interC.methodB();
    interC.methodC();
  }
}
