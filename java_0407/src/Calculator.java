public class Calculator {
  int num1;
  int num2;
  int result;

  public Calculator() {
    num1 = 10;
    num2 = 3;
    result = 0;
  }

  public Calculator(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
    this.result = 0;
  }

  public void sum() {
    result = num1 + num2;
    System.out.println("두 수의 덧셈은 : " + result);
  }

  public void sub() {
    result = num1 - num2;
    System.out.println("두 수의 뺄셈은 : " + result);
  }

  // 메소드의 원형, 메소드 사용방법을 알 수 있다
  // 접근 제한자 / 반환값 / 메소드 이름 / 매개변수
  // 해당 메소드를 사용하려면 multi라는 이름을 쓰고 매개변수로 정수 두 개를 써야하고 반환값은 없다
  public void multi(int num1, int num2) {
    result = num1 * num2;
    System.out.println("두 수의 곱셈은 : " + result);
  }

  public void div(int num1, int num2) {
    result = num1 / num2;
    System.out.println("두 수의 나눗셈은 : " + result);
  }
}
