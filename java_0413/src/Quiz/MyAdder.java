package Quiz;

public class MyAdder extends AdderInterface {
  @Override
  int add(int x, int y) {
    return x + y;
  }

  @Override
  int add(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

}
