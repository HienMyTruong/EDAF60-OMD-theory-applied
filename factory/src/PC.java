public class PC extends Computer { //Subclass

  private String ram;
  private String cpu;

  public PC(String ram, String cpu) {
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
