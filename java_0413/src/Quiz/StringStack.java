package Quiz;

public class StringStack extends StackClass {
  String[] stack;
  int count;

  public StringStack(int index) {
    stack = new String[index];
    count = 0;
  }

  @Override
  public int length() {
    return count;
  }

  @Override
  public String pop() {
    if (count == 0) {
      return null;
    }
    count--;
    return stack[count];
  }


  @Override
  public boolean push(String ob) {
    if (count == stack.length) {
      return false;
    }

    stack[count++] = ob;

    return true;
  }

//
//  StringStack[] stack = new StringStack[5];
//  int count = 0;
//
//  @Override
//  public int length() {
//    count = stack.length;
//    return count;
//  }
//
//  @Override
//  public StringStack pop() {
//    return stack[--count];
//  }
//
//  @Override
//  public boolean push(String ob) {
//    if (count == 5) {
//      return false;
//    } else {
//      stack[count] = ob;
//      count++;
//      return true;
//    }

//  }
}
