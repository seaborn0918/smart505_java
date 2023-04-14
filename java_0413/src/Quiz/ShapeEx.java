package Quiz;

import java.util.Scanner;

public class ShapeEx {
  public static void main(String[] args) {
    int position = 0;
    // 추상 클래스인 Shape 크래스 타입의 배열 선언
    Shape[] shapes = new Shape[10];

    Scanner sc = new Scanner(System.in);
    // 메뉴 선택용 변수
    int choice = 0;

    // 무한반복
    while (choice != 4) {
      System.out.println("1 삽입, 2 삭제, 3 모두보기, 4 종료 >>");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          // 서브 메뉴 출력
          System.out.println("도형 종류 1 Line, 2 Rect, 3 Circles");
          // 서브 메뉴 입력받기
          int type = sc.nextInt();
          if (type < 1 || type > 3) {
            System.out.println("잘못 입력하였습니다.");
            break; // switch문 강제 종료, 반복문 재시작
          }
          // Shape 클래스 타입의 배열에 데이터 추가
          // insert(type); 여기서부터 다시 혹인
        case 2:
        case 3:
        case 4:
          System.out.println("프로그램 종료");
          break;
      }
    }
  }
}
