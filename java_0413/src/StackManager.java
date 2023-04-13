import Quiz.StringStack;

import java.util.Scanner;

public class StackManager {
  public static void main(String[] args) {
    StringStack stack = new StringStack(5);
    Scanner sc = new Scanner(System.in);

    System.out.print(" >> ");

    for (int i = 0; i < 5; i++) {

      String text = sc.next();
      stack.push(text);
    }

    int count = stack.length();

    for (int i = 0; i < count; i++) {
      System.out.print(stack.pop() + " ");
    }
  }


}

