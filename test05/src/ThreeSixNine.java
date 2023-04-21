import java.util.Scanner;

public class ThreeSixNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String eng[] = {"student", "love", "java", "happy", "future"};
        String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

        while (true) {
            System.out.print("영어 단어를 입력하세요 >> ");
            String user = sc.next();
            if (user.equals("exit")) break;

            int i;
            for (i = 0; i < eng.length; i++) {
                if (user.equals(eng[i])) {
                    System.out.println(kor[i]);
                    break;
                }
            }
            if (i == eng.length) {
                System.out.println("그런 영어 단어가 없습니다.");
            }
        }
        System.out.println("종료합니다.");

    }
}
