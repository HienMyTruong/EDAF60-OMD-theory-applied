import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

  private List<Shape> shapes = new ArrayList<Shape>();

  public void add(Shape s) {
    shapes.add(s);
  }

  public void remove(Shape s) {
    shapes.remove(s);
  }

  @Override
  public void draw(String fillColor) {
    for (Shape sh : shapes) {
      sh.draw(fillColor); //When we fill the drawing with color - same color gets applied for all objects in the drawing
    }
  }
}
