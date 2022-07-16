public class Rectangle implements IShape {

  protected int lenght, width;
  protected String color;

  public Rectangle(String color, int lenght, int width){
    this.color = color;
    this.lenght = lenght;
    this.width = width;
  }
  
  @Override
  public double calArea(){
    return this.lenght*this.width;
  }

  @Override
  public double calPerimeter(){
    return 2*(this.width + this.lenght);
  }

  

}
