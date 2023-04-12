public class Quiz01NamedCircle extends Quiz01Circle{
  String name;

  public Quiz01NamedCircle(int radius, String name) {
    super(radius);
    this.name = name;
  }

  public void show() {
    System.out.println(name + ", 반지름 : " + getRadius());
  }
}
