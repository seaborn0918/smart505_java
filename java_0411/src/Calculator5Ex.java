public class Calculator5Ex {
  public static void main(String[] args) {
    Calculator5 c1 = new Calculator5();
    Calculator5 c2 = new Calculator5();

    c1.sum();
    c2.sum();

    c1.setNumber(100, 200);
    c2.setNumber(1000, 2000);

    c1.sum();
    c2.sum();

    System.out.println("----------");

    c1.staticSum();
    c2.staticSum();

    c1.setStaticNumber(100, 200);
    c2.setStaticNumber(1000, 2000); // 클래스로 접근하기 때문에 다른 객체라고 해도 클래스내 필드 재할당됨

    c1.staticSum(); // 3000
    c2.staticSum(); // 3000

    System.out.println("--- 인스턴스 멤버 ---");

    System.out.println("c1의 num1 : " + c1.num1);
    System.out.println("c1의 num2 : " + c1.num2);
    System.out.println("c2의 num1 : " + c2.num1);
    System.out.println("c2의 num2 : " + c2.num2);

    c1.num1 = 10;
    c1.num2 = 20;
    c2.num1 = 10000;
    c2.num2 = 20000;

    System.out.println("--- 정적 멤버 ---");

    System.out.println("c1의 staticnum1 : " + c1.staticNum1);
    System.out.println("c1의 staticnum2 : " + c1.staticNum2);
    System.out.println("c2의 staticnum1 : " + c2.staticNum1);
    System.out.println("c2의 staticnum2 : " + c2.staticNum2);

    c1.staticNum1 = 10;
    c1.staticNum2 = 20;
    c2.staticNum1 = 10000;
    c2.staticNum2 = 20000;

    Calculator5.staticNum1 = 100;
    Calculator5.staticNum2 = 200;

    System.out.println("c1의 staticnum1 : " + c1.staticNum1);
    System.out.println("c1의 staticnum2 : " + c1.staticNum2);
    System.out.println("c2의 staticnum1 : " + c2.staticNum1);
    System.out.println("c2의 staticnum2 : " + c2.staticNum2);
  }
}
