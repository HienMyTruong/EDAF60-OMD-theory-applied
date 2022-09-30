public class DeviceCommand implements Command {

  Device device;

  public DeviceCommand(Device device) {
    this.device = device;
  }

  @Override
  public void execute() {
    device.on();
  }

  @Override
  public void undo() {
    device.off();
  }
}
