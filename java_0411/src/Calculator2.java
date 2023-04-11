public class Calculator2 {
  // 메소드 오버로딩 미사용
  // 메소드 이름 다 따로 써야하기 때문에 불편
  public void sumInt(int x, int y) {
    int result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }

  public void sumIntDouble(int x, double y) {
    double result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }

  public void sumDoubleInt(double x, int y) {
    double result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }

  public void sumDouble(double x, double y) {
    double result = x + y;
    System.out.println("두 수의 덧셈은 : " + result);
  }


}
