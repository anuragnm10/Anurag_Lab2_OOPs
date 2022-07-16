import java.util.function.DoubleFunction;

public interface IShape{

  Renderer renderer = new Renderer();

  double calArea();
  double calPerimeter();
 

}