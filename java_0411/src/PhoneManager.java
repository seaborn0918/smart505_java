import java.util.Scanner;

public class PhoneManager {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("인원수>>");
    int count = sc.nextInt();
    Phone04[] nameTel = new Phone04[count]; // 사용자 수만큼 배열 크기 설정

    for (int i = 0; i < nameTel.length; i++) {
      System.out.println("이름과 전화번호(번호는 연속적으로 입력)>>");
      String name = sc.next();
      String tel = sc.next();
      nameTel[i] = new Phone04(name, tel); // 입력받은 정보를 통해서 nameTel 객체를 생성과 동시에 배열에 저장
    }

    System.out.println("저장되었습니다.");

    // 무한 루프로 입력을 계속 받음
    while (true) {
      System.out.println("검색할 이름>>");
      String searchName = sc.next();

      if (searchName.equals("exit")) {
        break;
      }

      String tel = ""; // 전화번호 입력받을 변수
      for (int i = 0; i < nameTel.length; i++) {
        if (nameTel[i].getName().equals(searchName)) {
          tel = nameTel[i].getTel();
          break;
        }
      }
      if (tel.equals("")) {
        System.out.println(searchName + "없습니다.");
      } else {
        System.out.println(searchName + "의 번호는 " + tel + "입니다.");
      }
    }
    System.out.println("프로그램을 종료합니다.");
  }
}

