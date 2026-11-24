
class Student{
  private String name ="Swetha";
  private int rollNumber=234;
  public void getName(){
    System.out.println(name);
  }
  public void setName(String s){
    name=s;
  }
  public void getRollNumber(){
    System.out.println(rollNumber);
  }
  public void setRollNumber(int r){
    rollNumber=r;
  }

}

public class Main2 {
  public static void main(String[] args) {
    Student st = new Student();
    st.getName();
    st.setName("keerthana");
    st.getRollNumber();
    st.setRollNumber(456);
    st.getName();
    st.getRollNumber();
  }
}

