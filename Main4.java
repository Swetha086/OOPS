class Rectangle{
  private double length;
  private double width;

  public void setLength(double l){
    if(l<0){
      System.out.println("Invalid");
    }
    else{
      length=l;
    }
  }
  public void setWidth(double w){
    if(w<0){
      System.out.println("Invalid");
    }
    else{
      width=w;
    }
  }
  public void getLength(){
    System.out.println("Length: "+ length);
  }
  public void getWidth(){
    System.out.println("Width: "+ width);
  }

  public double calculateArea() {
    return length * width;
  }

  public double calculatePerimeter() {
    return 2 * (length + width);
  }
}

public class Main4 {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle();
    rect.setLength(5);
    rect.setWidth(3);
    rect.getLength();
    rect.getWidth();
    System.out.println("Area:"+ rect.calculateArea());
    System.out.println("Perimeter:"+ rect.calculatePerimeter());
  }
}
