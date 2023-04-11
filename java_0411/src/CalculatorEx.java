public class CalculatorEx {
  public static void main(String[] args) {
    Calculator myCal = new Calculator();

    double result = myCal.areaRectangle(10);
    double result2 = myCal.areaRectangle(10, 20);

    System.out.println("정사각형의 넓이 : " + result);
    System.out.println("직사각형의 넓이 : " + result2);

    System.out.println("-------------오버로딩 미사용---------------");

    Calculator2 cal2 = new Calculator2();

    cal2.sumInt(10, 3);
    cal2.sumIntDouble(10, 3.14);
    cal2.sumDoubleInt(10.5, 3);
    cal2.sumDouble(10.5, 3.14);

    System.out.println("-------------오버로딩 사용---------------");

    Calculator3 cal3 = new Calculator3();

    cal3.sum(10, 3);
    cal3.sum(10, 3.14);
    cal3.sum(10.5, 3);
    cal3.sum(10.5, 3.14);

    //결과값은 같음. 메소드 이름을 하나로 통일하여 사용하기 용이함.
  }
}
