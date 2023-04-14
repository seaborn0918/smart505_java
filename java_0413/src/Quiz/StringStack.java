package Quiz;

public class StringStack extends StackClass {
  // 스택 구조로 사용할 배열 선언
  private String[] stack;
  // 스택에 쌓여있는 데이터의 크기(높이)
  private int count;

  // 생성자, 객체 생성시 매개변수로 스택의 크기를 결정
  public StringStack(int index) {
    stack = new String[index]; // 스택 크기 지정
    count = 0; // 스택 높이 0으로 초기화
  }

  // 스택에 저장된 데이터의 마지막 위치 출력
  @Override
  public int length() {
    return count;
  }

  // 스택에 저장된 가장 마지막 데이터 출력
  @Override
  public String pop() {
    // 스택의 높이가 0일 경우 저장된 데이터 없음
    if (count == 0) {
      return null;
    }
    count--; // 스택 높이를 1낮춤
    return stack[count];
  }


  // 스택의 마지막 위치에 데이터 저장
  // 스택의 최대 크기에 도달시 더이상 데이터를 쌓을 수 없음(false)
  @Override
  public boolean push(String ob) {
    // 스택의 높이와 스택 구조로 사용하는 배열의 크기가 같으면 더이상 데이터를 추가할 수 없으므로 false를 출력
    if (count == stack.length) {
      return false;
    }

    // 스택 구조로 사용하는 배열에 데이터를 추가
    stack[count++] = ob;

    // 정상적으로 데이터를 저장했다는 의미로 true 출력
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
