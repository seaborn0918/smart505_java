package Quiz;

public class NamedCircle extends Circle {
  String name;

  public NamedCircle(int radius, String name) {
    super(radius);
    this.name = name;
  }

  public void show() {
    System.out.println(name + ", 반지름 : " + getRadius());
  }
}
