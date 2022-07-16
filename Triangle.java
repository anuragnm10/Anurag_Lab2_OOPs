public class Triangle implements IShape{

  double height;
  double base;
  String color;

  public Triangle(double height, double base, String color){
    this.base = base;
    this.height = height;
    this.color = color;
  }
  @Override
  public double calArea(){
    return (this.height*this.base)/2;
  }

  @Override
  public double calPerimeter(){
    return ((this.height+this.base)+Math.sqrt((this.height*this.height)+(this.base*this.base)));
  }

  
}
