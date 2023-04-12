import java.util.Scanner;

public class PhoneEx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    System.out.println("이름과 전화번호 입력 >>");
//    String name = sc.next();
//    String phoneNum = sc.next();
//    Phone input1 = new Phone(name, phoneNum);
//
//    System.out.println("이름과 전화번호 입력 >>");
//    name = sc.next();
//    phoneNum = sc.next();
//    Phone input2 = new Phone(name, phoneNum);

//    System.out.println(input1.getName() + "의 번호 " + input1.getTel());
//    System.out.println(input2.getName() + "의 번호 " + input2.getTel());


    // for문
    // 배열 크기 2개로 고정
    Phone[] phones = new Phone[2];
    for (int i = 0; i < phones.length; i++) {
      System.out.println("이름과 전화번호 입력 >>");
      String name = sc.next();
      String phoneNum = sc.next();
      phones[i] = new Phone(name, phoneNum);
    }

    for (int i = 0; i < phones.length; i++) {
      System.out.println(phones[i].getName() + "의 번호 " + phones[i].getTel());
    }




  }
}
