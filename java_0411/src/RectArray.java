import java.util.Scanner;

public class RectArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Rect[] rects = new Rect[4];
    for (int i = 0; i < rects.length; i++) {
      System.out.println((i + 1) + " 너비와 높이 >>");
      int width = sc.nextInt();
      int height = sc.nextInt();
      rects[i] = new Rect(width, height); // 실제 데이터를 저장
    }

    System.out.println("저장하였습니다.");

    int sum = 0;
    for (int i = 0; i < rects.length; i++) {
      sum += rects[i].getArea();
    }
    System.out.println("사각형의 전체 합은 " + sum);


  }
}
