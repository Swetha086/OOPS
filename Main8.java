class Device {
  String powerSource;
  public void turnOn(){
    System.out.println("Device powered on");
  }
}
class Mobile extends Device{
  double screenSize;
  public void makeCall(){
    System.out.println("Making a call");

  }
}
class Android extends Mobile{
  public void openPlayStore(){
    System.out.println("Opening Google Play Store");
  }
}
class iPhone extends Mobile{
  public void openAppStore(){
    System.out.println("Opening App Store");
  }
}

public class Main8 {
  public static void main(String[] args) {
    Android android = new Android();
    android.powerSource = "Battery";
    android.screenSize = 6.5;
    android.turnOn();
    android.makeCall();
    android.openPlayStore();

    iPhone iphone = new iPhone();
    iphone.powerSource = "Battery";
    iphone.screenSize = 5.8;
    iphone.turnOn();
    iphone.makeCall();
    iphone.openAppStore();
    
  }
}
