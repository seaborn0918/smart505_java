public class StaticTest {
  public static void main(String[] args) {
    Circle pizza = new Circle(5);
    Circle waffle = new Circle(1);

    boolean res = CircleManager.equals(pizza, waffle);
    if (res == true) {
      System.out.println("pizza와 waffles 크기 같음");
    } else {
      System.out.println("pizza와 waffles 크기 다름");
    }

    CircleManager.copy(pizza, waffle);
    res = CircleManager.equals(pizza, waffle);;
    if (res == true) {
      System.out.println("pizza와 waffles 크기 같음");
    } else {
      System.out.println("pizza와 waffles 크기 다름");
    }
  }
}
