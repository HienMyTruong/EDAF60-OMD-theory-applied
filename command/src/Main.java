public class Main {

  public static void main(String[] args) {
    DeviceCommand toggleLight = new DeviceCommand(new Light());
    toggleLight.execute();
    toggleLight.undo();

    //RemoteController remote = new RemoteController();
    //remote.setButton(turnOn);
    //remote.pressButton();
    //remote.pressButton();
    //remote.pressButton();
  }

}
