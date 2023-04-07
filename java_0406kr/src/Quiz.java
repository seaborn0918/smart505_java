import java.util.Scanner;

public class Quiz {
  public static void quiz01() {
    Scanner sc = new Scanner(System.in);
    System.out.println("정수 10개 입력>>");

    //정수를 입력 받을 배열 10개짜리 생성
    int[] inputArray = new int[10];

    // 3의 배수 확인
    for (int i = 0; i < inputArray.length; i++) {
      inputArray[i] = sc.nextInt();
      if (inputArray[i] % 3 == 0) {
        System.out.println(inputArray[i] + " ");
      }
    }
  }

  public static void quiz02() {
    Scanner sc = new Scanner(System.in);
    System.out.println("정수 10개 입력>>");
    int[] inputArray = new int[10];

    // 버블 정렬
    for (int i = 0; i < inputArray.length; i++) {
      inputArray[i] = sc.nextInt();
      for (int j = i + 1; j < inputArray.length; j++) {
        if (inputArray[i] > inputArray[j]) {
          int temp = inputArray[i];
          inputArray[i] = inputArray[j];
          inputArray[j] = temp;
        }
      }
    }
    for (int i = 0; i < inputArray.length; i++) {
      System.out.println(inputArray[i]);
    }
  }

  public static void quiz03() {
    String eng[] = {"student", "love", "java", "happy", "future"};
    String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

    // 사용자 입력을 'exit'가 입력될 때가지 무한으로 받아야 함
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("영어 단어를 입력하세요>>");
      String inputEng = sc.next();
      if (inputEng.equals("exit")) {
        break;
      }

      int i = 0;
      for (i = 0; i < eng.length; i++) {
        if (inputEng.equals(eng[i])) {
          System.out.println(kor[i]);
          break;
        }
      }

      // i의 값과 영어단어 배열의 크기가 같으면 영어 단어 배열 안에 사용자가 입력한 단어가 없다는 의미
      if (i == eng.length) {
        System.out.println("그런 단어 없습니다...");
      }
    }

  }


  public static void quiz04() {

    for (int i = 1; i < 100; i++) {
      int first = i / 10;
      int second = i % 10;
      int count = 0;

      // 10의 자리에 숫자가 있는지 확인, 10의 자리의 숫자가 3의 배수인지 확인
      // 30, 60, 90번대 일때만 count++
      if((first != 0) && (first % 3 == 0)){
        count++;
      }
      // 3, 6, 9일때만 count++
      if((second != 0) && (second % 3 == 0)){
        count++;
      }
      switch (count) {
        case 1:
        case 2:
      }
    }


  }

  public static void quiz05() {
    Scanner sc = new Scanner(System.in);
    System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
    System.out.println("가위 바위 보!>>");
    String input = sc.next();
    String[] str = {"가위", "바위", "보"};
    int n = (int) (Math.random() * 3);

    if (str[n].equals("가위")) {
      if (input.equals("가위")) {
        System.out.println("사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.");
      }
    }

  }


  public static void main(String[] args) {
//    quiz01();
    quiz02();
//    quiz03();
//    quiz04();
//    quiz05();
  }
}
