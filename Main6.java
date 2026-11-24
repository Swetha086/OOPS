class Shape{
  String color;
  public void displayColor(){
    System.out.println("Color of shape:"+color);

}
}
class Circle extends Shape{
  double radius;
  public void calculateArea(){
    double area=3.14*radius*radius;
    displayColor();
    System.out.println("Area of circle:"+area);
  }
}
class Rectangle extends Shape{
  double length;
  double width;
  public void calculateArea(){
    double area=length*width;
    displayColor();
    System.out.println("Area of rectangle:"+area);
  }
}
public class Main6 {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.color = "Red";
    circle.radius = 5.0;
    circle.calculateArea();
    Rectangle rectangle = new Rectangle();
    rectangle.color = "Blue"; 
    rectangle.length = 10.0;
    rectangle.width = 5.0;
    rectangle.calculateArea();
  }
}

