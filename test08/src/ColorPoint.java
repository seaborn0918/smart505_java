public class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show() {
        System.out.println(getColor() + "색으로 " + "(" + getX() + ", " + getY() + ")");
    }

    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.move(10, 20);
        cp.setColor("GREEN");
        cp.show();
    }

}
