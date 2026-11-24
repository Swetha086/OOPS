class Person{
  String name;
  public void displayPerson(){
    System.out.println(name);

  }

}
class Employee extends Person{
  int employeeId;
  public void displayEmployee(){
    System.out.println(name);
    System.out.println(employeeId);
  }
}
class Manager extends Employee{
  String department;
  public void displayManager(){
    System.out.println(name);
    System.out.println(employeeId);
    System.out.println(department);
  }

}

public class Main7 {
  public static void main(String[] args) {
    Manager man=new Manager();
    man.name="swetha";
    man.employeeId=123;
    man.department="cse";
    man.displayManager();
    man.displayEmployee();
    man.displayPerson();
  }
  
}
