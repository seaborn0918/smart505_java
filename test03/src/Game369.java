import java.util.Scanner;

public class Game369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("1 ~ 99 사이의 정수를 입력하세요 >> ");
            int n = sc.nextInt();
            int first = n / 10;
            int second = n % 10;
            if (n == 0) {
                break;
            }

            if (first == 0 && second % 3 == 0) {
                System.out.println("박수 짝");
            } else if (first % 3 != 0 && second % 3 == 0) {
                if (first % 3 != 0 && second != 0) {
                    System.out.println("박수 짝");
                }
            } else if (first % 3 == 0 && second == 0) {
                System.out.println("박수 짝");
            } else if (second % 3 == 0 && second % 3 == 0) {
                System.out.println("박수 짝짝");
            } else {
                System.out.println("박수 없음");
                break;
            }

        }
        System.out.println("종료합니다.");

    }
}

