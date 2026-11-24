class Vehicle{
  String brand;
  public void honk(){
    System.out.println("Beep! Beep!");
  }
  
}
class Car extends Vehicle{
  String modelName;
  public void displayDetails(){
    System.out.println("Brand: "+ brand);
    System.out.println("Model: "+ modelName);
  }
}

public class Main5 {
  public static void main(String[] args) {
    Car car = new Car();
    car.brand="BMW";
    car.modelName="X5";
    car.honk();
    car.displayDetails();

  }
}
