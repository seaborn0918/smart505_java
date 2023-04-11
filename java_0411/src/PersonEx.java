public class PersonEx {
  public static void main(String[] args) {
    Person p1 = new Person("123456-123456", "홍길동");
    System.out.println(p1.nation);
    System.out.println(p1.ssn);
    System.out.println(p1.name);

    // final 키워드를 사용한 읽기 전용 필드이기 때문에 수정 불가
    // p1.nation = "USA";
    // p1.ssn = "45648-665656";
    p1.name = "임꺽정";

  }
}
