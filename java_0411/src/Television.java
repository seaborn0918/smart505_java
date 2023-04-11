public class Television {
  static String comany = "삼성";
  static String model = "LED";
  static String info;

  // 정적 초기화 블록
  // 정적 멤버만 사용 가능
  // 객체 없어도 실행가능
  // 인스턴스 멤버 사용 불가
  // this 사용 불가
  static {
    info = comany + " - " + model;
  }
}
