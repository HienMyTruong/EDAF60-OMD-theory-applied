public abstract class Computer { //Superclass

  public abstract String getRAM();
  public abstract String getCPU();

  @Override
  public String toString() {
    return "RAM = " + getRAM() + ", CPU = " + getCPU();
  }
}
