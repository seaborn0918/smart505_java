import java.util.Scanner;

public class PhoneManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수 >> ");
        int cnt = sc.nextInt();

        Phone[] phone = new Phone[cnt];
        for (int i = 0; i < phone.length; i++) {
            System.out.print("이름과 전화번호(번호는 연속적으로 입력) >> ");
            phone[i] = new Phone(sc.next(), sc.next());
        }
        System.out.println("저장되었습니다...");

        while (true) {
            System.out.print("검색할 이름 >> ");
            String search = sc.next();
            if (search.equals("exit")) break;

            int i;
            for (i = 0; i < phone.length; i++) {
                if (search.equals(phone[i].getName())) {
                    System.out.println(search + "의 번호는 " + phone[i].getTel());
                    break;
                }
            }
            if (i == phone.length) {
                System.out.println(search + " 은(는) 없습니다.");
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
