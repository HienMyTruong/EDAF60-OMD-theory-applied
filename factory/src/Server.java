public class Server extends Computer { //Subclass

  private String ram;
  private String cpu;

  public Server(String ram, String cpu) {
    this.ram = ram;
    this.cpu = cpu;
  }

  @Override
  public String getRAM() {
    return ram;
  }

  @Override
  public String getCPU() {
    return cpu;
  }
}
