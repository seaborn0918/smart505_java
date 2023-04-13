package Quiz;

public class MyAdder extends AdderInterface {
  int sum = 0;

  @Override
  int add(int x, int y) {
    return x + y;
  }

  @Override
  int add(int n) {
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

}
