import java.util.Scanner;

public class Quiz {
    private static Scanner sc = new Scanner(System.in);

    // 84p의 open challenge 문제
    public static void quiz01() {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위, 바위, 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.println("철수 >> ");
        String cheol = sc.next();
        System.out.println("영희 >> ");
        String young = sc.next();

        if (cheol.equals("가위")) {
            if (young.equals("가위")) {
                System.out.println("비겼습니다.");
            } else if (young.equals("바위")) {
                System.out.println("철수가 졌습니다.");
            } else {
                System.out.println("철수가 이겼습니다.");
            }
        } else if (cheol.equals("바위")) {
            if (young.equals("가위")) {
                System.out.println("철수가 졌습니다..");
            } else if (young.equals("바위")) {
                System.out.println("비겼습니다.");
            } else {
                System.out.println("철수가 이겼습니다.");
            }
        } else if (cheol.equals("보")) {
            if (young.equals("가위")) {
                System.out.println("철수가 졌습니다.");
            } else if (young.equals("바위")) {
                System.out.println("철수가 이겼습니다.");
            } else if (young.equals("보")){
                System.out.println("비겼습니다.");
            }
        }
    }

    // 실습문제 2번
    public static void quiz02() {
        System.out.println("몇 층인지 입력하세요>> ");
        int floor = sc.nextInt();
        int height = floor * 5;

        if (floor <= 0) {
            System.out.println("잘못된 데이터 입니다.");
        } else {
            System.out.println(height + "m 입니다.");
        }
    }

    // 실습문제 3번
    public static void quiz03() {
        System.out.println("x 값을 입력하세요>>");
        int x = sc.nextInt();

        int y = x * x - 3 * x + 7;
        System.out.println("x = " + x + ", y = " + y);
    }

    // 실습문제 4번
    public static void quiz04() {
        System.out.println("점 (x, y) 값을 입력하세요>>");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if ((x >= 50 && y >= 50) && (x <= 100 && y <= 100)) {
            System.out.println("점(" + x + "," + y + ")은 (50, 50)과 (100, 100)의 사각형 내에 있습니다.");
        }
    }

    // 실습문제 5번
    public static void quiz05() {
        System.out.println("논리 연산자를 입력하세요>>");
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        String op = sc.next();
        boolean b = sc.nextBoolean();

        boolean res = false;

        switch (op) {
            case "AND":
                res = a && b;
                break;
            case "OR":
                res = a || b;
                break;
            default:
                System.out.println("잘못된 논리 연산자입니다.");
        }
    }

    // 실습문제 6번
    public static void quiz06() {
        System.out.println("돈의 액수를 입력하세요>>");
        int money = sc.nextInt();

        int n50000 = money / 50000; // 오만원권 개수
        money = money % 50000; // 나머지
        int n10000 = money / 10000;
        money = money % 10000;
        int n1000 = money / 1000;
        money = money % 1000;
        int n500 = money / 500;
        money = money % 500;
        int n100 = money / 100;
        money = money % 100;
        int n10 = money / 10;
        money = money % 10;

        System.out.println("오만원" + n50000 + "개");
        System.out.println("만원" + n10000 + "개");
        System.out.println("천원" + n1000 + "개");
        System.out.println("오백원" + n500 + "개");
        System.out.println("100원" + n100 + "개");
        System.out.println("10원" + money + "개");

    }

    // 실습문제 7번
    public static void quiz07() {
        System.out.println("학점을 입력하세요>>");
        String grade = sc.next();

        switch (grade) {
            case "A":
            case "B":
                System.out.println("Excellent");
                break;
            case "C":
            case "D":
                System.out.println("Good");
                break;
            case "F":
                System.out.println("Bye");
                break;
            default:
                System.out.println("잘못된 입력");
        }
    }

    public static void quiz08() {
        System.out.println("커피 주문하세요>>");
        Scanner sc = new Scanner(System.in);
        String menu = sc.next();
        int count = sc.nextInt();

        int priceEs = 2000 * count;
        int priceAme = 2500 * count;
        int priceCappu = 3000 * count;
        int priceCafe = 3500 * count;


        if (menu.equals("에스프레소")) {
            System.out.println(priceEs + "원입니다.");
        } else if (menu.equals("아메리카노")) {
            System.out.println(priceAme + "원입니다.");
        } else if (menu.equals("카푸치노")) {
            System.out.println(priceCappu + "원입니다.");
        } else if (menu.equals("카페라떼")) {
            System.out.println(priceCafe + "원입니다.");
        } else {
            System.out.println(menu + "없는 메뉴입니다.");
        }
    }

    public static void quiz09() {
        System.out.println("1 ~ 99 사이의 정수를 입력하세요>>");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int first = number / 10;
        int second = number % 10;

        if (first == 3 || first == 6 || first == 9) {
            if (second == 3 || second == 6 || second == 9) {
                System.out.println("박수 짝짝");
            } else {
                System.out.println("박수 짝");
            }
        } else if (second == 3 || second == 6 || second == 9) {
            System.out.println("박수 짝");
        } else {
            System.out.println("박수 없음");
        }

        // 정답
        if (first % 3 == 0 && second % 3 == 0) {
            System.out.println("박수짝짝");
        } else if ((first % 3 == 0 && second % 3 != 0) || (first % 3 != 0 && second % 3 == 0)) {
            System.out.println("박수짝");
        } else {
            System.out.println("박수 없음");
        }
    }

    public static void quiz10() {
        System.out.println("커피 주문하세요>>");
        String menu = sc.next();
        int count = sc.nextInt();

        int priceEs = 2000 * count;
        int priceAme = 2500 * count;
        int priceCappu = 3000 * count;
        int priceCafe = 3500 * count;
        int dcPriceEs = (int) (priceEs * 0.95);

        if (menu.equals("에스프레소")) {
            if (count < 10) {
                System.out.println(priceEs + "원입니다.");
            } else {
                System.out.println(dcPriceEs + "원입니다.");
            }
        } else if (menu.equals("아메리카노")) {
            System.out.println(priceAme + "원입니다.");
        } else if (menu.equals("카푸치노")) {
            System.out.println(priceCappu + "원입니다.");
        } else if (menu.equals("카페라떼")) {
            System.out.println(priceCafe + "원입니다.");
        }

    }


    public static void main(String[] args) {
//        quiz01(); //
//        quiz02(); //
//        quiz03(); //
//        quiz04(); //
//        quiz05(); //
//        quiz06();
//        quiz07(); //
//        quiz08(); //
        quiz09(); //
//        quiz10(); //
    }
}
