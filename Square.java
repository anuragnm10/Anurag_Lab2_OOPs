public class Square extends Rectangle{
  
  public Square(String color, int lenght, int width){
    super(color, lenght, width);
  }

  @Override
  public double calArea(){
    return this.lenght*this.width;
  }

  @Override
  public double calPerimeter(){
    return 2*(this.lenght+this.width);
  }


}
