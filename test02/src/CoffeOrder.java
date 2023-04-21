import java.util.Scanner;

public class CoffeOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("커피 주문하세요 >> ");
        String menu = sc.next();
        int cnt = sc.nextInt();
        int total = 0;

        switch (menu) {
            case "에스프레소":
                total = 2000 * cnt;
                break;
            case "아메리카노":
                total = 2500 * cnt;
                break;
            case "카푸치노":
                total = 3000 * cnt;
                break;
            case "카페라떼":
                total = 3500 * cnt;
                break;
            default:
                System.out.println("메뉴가 없습니다.");
        }
        System.out.println(total + "원입니다.");
    }
}
