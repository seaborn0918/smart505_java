import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
  public static void main(String[] args) {
    // 빈 리스트 생성
    List<String> list = new ArrayList<>();

    // 리스트에 데이터 추가
    list.add("자바");
    list.add("JBDC");
    list.add("Servlet/JSP");
    list.add(2, "Database");
    list.add("mybatis");

    int size = list.size();
    System.out.println("리스트의 총 크기 : " + size);

    String skill = list.get(2);
    System.out.println("2 : " + skill);
    System.out.println();

    for (int i = 0; i < size; i++) {
      String str = list.get(i);
      System.out.println(i + " : " + str);
    }

    System.out.println();

    list.remove(2);
    list.remove(2);
    list.remove("mybatis");

    for (int i = 0; i < list.size(); i++) {
      String str = list.get(i);
      System.out.println(i + " : " + str);
    }

    System.out.println();

    // asList(배열) : Arrays 클래스에서 제공하는 배열을 ArrayList로 변환하는 메소드
    // toArray() : Arrays 클래스에서 제공하는 arrayList를 배열로 변환하는 메소드
    List<String> list1 = Arrays.asList("동글이", "지구", "우유");

    for (String name : list1) {
      System.out.println(name);
    }


    // 리스트로 변경 시 기본 데이터 타입을 사용하면 오류가 발생함
    // <> 안에 기본 데이터 타입의 래퍼 클래스 타입을 사용함
    List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
    for (int value : list2) {
      System.out.println(value);
    }

    String[] arrStr = {"JAVA", "JSP", "Spring"};
    List<String> list3 = Arrays.asList(arrStr);
    for (int i = 0; i < list3.size(); i++) {
      System.out.println(list3.get(i));
    }

    System.out.println("---- 리스트를 배열로 변경 ----");
    // 배열은 크기가 고정되어 있기 때문에 리스트의 크기로 배열의 크기를 지정해서 배열을 생성
    // 만들어진 배열에 toArray() 메소드를 사용하여 배열로 변경
    String[] arrStr2 = new String[list3.size()];
    list3.toArray(arrStr2);
    for (String i : arrStr2) {
      System.out.println(i);
    }




  }
}
