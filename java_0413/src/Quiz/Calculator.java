package Quiz;

import java.util.Scanner;

public abstract class Calculator {
  protected int a, b;

  abstract public int calc();

  protected void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("정수 2개를 입력하세요>>");
    a = sc.nextInt();
    b = sc.nextInt();
  }

  public void run() {
    input();
    int res = calc();
    System.out.println("계산된 값은 " + res);
  }
}
