public class StudentEx {
  public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println("Student 클래스 타입의 변수 s1이 Student 클래스 타입의 객체를 참조합니다.");

    Student s2; // Stueden  타입의 변수  null
    s2 = new Student(); // 메모리에 객체 생성 // s2 = 주소
    System.out.println("Student 클래스 타입의 변수 s2가 Student 클래스 타입의 객체를 참조합니다.");

  }
}

