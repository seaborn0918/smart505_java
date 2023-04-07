import java.util.Scanner;

public class Practice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("정수를 입력하세요");
    int time = sc.nextInt();
    System.out.println(time + "초는");
    int second = time % 60 ;
    System.out.println(second + "초");
    int minute = (time / 60) % 60;
    System.out.println(minute + "분");
    int hour = (time / 60) / 60;
    System.out.println(hour + "시");
  }
}
