import java.util.Scanner;

public class Phone {
    private String name, tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] phones = new Phone[2];
        for (int i = 0; i < phones.length; i++) {
            System.out.print("이름과 전화번호 입력 >> ");
            String name = sc.next();
            String num = sc.next();
            phones[i] = new Phone(name, num);
        }
        for (int i = 0; i < phones.length; i++) {
            System.out.println(phones[i].getName() + "의 번호 " + phones[i].getTel());
        }
    }
}

