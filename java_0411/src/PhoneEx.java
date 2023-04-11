import java.util.Scanner;

public class PhoneEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("이름과 전화번호 입력 >>");
    String name1 = sc.next();
    String phoneNum1 = sc.next();
    Phone input1 = new Phone(name1, phoneNum1);

    System.out.println("이름과 전화번호 입력 >>");
    String name2 = sc.next();
    String phoneNum2 = sc.next();
    Phone input2 = new Phone(name2, phoneNum2);


    System.out.println(input1.getName() + "의 번호 " + input1.getTel());
    System.out.println(input2.getName() + "의 번호 " + input2.getTel());


  }
}
