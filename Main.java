public class Main {
  public static void main(String[] args){

    Circle circle = new Circle("Red", 3);
    circle.renderer.drawShape();
    circle.renderer.drawShape("color :"+ circle.color);
    System.out.println("Area of circle : "+ circle.calArea());
    System.out.println("Perimeter of circle : "+circle.calPerimeter());
    
    System.out.println();

    Triangle triangle = new Triangle(3, 5, "blue");
    triangle.renderer.drawShape();
    triangle.renderer.drawShape("color : "+triangle.color);
    System.out.println("Area of triangle : "+triangle.calArea());
    System.out.println("Perimeter of triangle : "+triangle.calPerimeter());

    System.out.println();

    Rectangle rectangle = new Rectangle("White", 4, 5);
    rectangle.renderer.drawShape();
    rectangle.renderer.drawShape("color : "+rectangle.color);
    System.out.println("Area of rectangle : "+rectangle.calArea());
    System.out.println("Perimeter of rectangle :"+rectangle.calPerimeter());

    System.out.println();

    Square square = new Square("purple", 4, 3);
    square.renderer.drawShape();
    square.renderer.drawShape("color : "+square.color);
    System.out.println("Area of square : "+square.calArea());
    System.err.println("Perimeter of square : "+square.calPerimeter());

  }
}
