import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLiseEx2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> name = new ArrayList<String>();

    for (int i = 0; i < 4; i++) {
      System.out.print("이름을 입력하세요>> ");
      name.add(sc.next());
    }

    for (int i = 0; i < name.size(); i++) {
      System.out.print(name.get(i) + " ");
    }
    System.out.println();

    int longest = 0;
    for (int i = 0; i < name.size(); i++) {
      if (name.get(longest).length() < name.get(i).length()) {
        longest = i;
      }
    }
    System.out.println(name.get(longest));



  }
}
