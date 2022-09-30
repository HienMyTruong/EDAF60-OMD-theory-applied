public class Main {

  public static void main(String[] args) {
    Shape triangle = new Triangle();
    Shape circle = new Circle();
    Shape secondTriangle = new Triangle();

    Drawing drawing = new Drawing();
    drawing.add(triangle);
    drawing.add(circle);

    drawing.draw("Red");
    System.out.println("-----");
    drawing.add(secondTriangle);
    drawing.draw("Green");
  }
}
