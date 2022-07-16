public class Circle implements IShape {
  
  double radius;
  String color;
  final double PI = 3.142;

  public Circle(String color, double radius){
    this.color = color;
    this.radius = radius;
  }

  @Override
  public double calArea(){
    return (PI*this.radius*this.radius);
  }

  @Override
  public double calPerimeter(){
    return 2*PI*this.radius;
  }


}
