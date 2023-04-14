package Quiz;

import Quiz.StringStack;

import java.util.Scanner;

public class StackManager {
  public static void main(String[] args) {

    // StringStack 클래스 타입의 변수 선언 및 객체 생성
    // 매개변수로 정수 10을 사용하여 스택 구조로 사용하는 배열의 크기를 10으로 설정
    StringStack stack = new StringStack(10);
    Scanner sc = new Scanner(System.in);

    System.out.print(" >> ");

    // 3번의 사용자 키보드 입력
    for (int i = 0; i < 5; i++) {
      String text = sc.next();
      // StringStack 클래스 타입의 객체 stack의 메소드 push()를 사용하여 데이터를 입력받은 데이터를 저장
      stack.push(text);
    }

    // StringStack 클래스 타입의 객체 stack의 메소드 length()를 사용하여 스택 구조의 배열 저장된 데이터의 크기를 가져옴
    int count = stack.length();

    // 입력된 내용을 출력
    for (int i = 0; i < count; i++) {
      // StringStack 클래스 타입의 객체 stack의 메소드 pop()를 사용하여 스택 구조의 배열 저장된 데이터를 하나씩 가져옴
      System.out.print(stack.pop() + " ");
    }
  }


}

