public class ComputerFactory {

  public static Computer getComputer(String type, String ram, String cpu) {
    if("PC".equalsIgnoreCase(type)) return new PC(ram, cpu);
    else if("Server".equalsIgnoreCase(type)) return new Server(ram, cpu);

    return null;
  }

}
