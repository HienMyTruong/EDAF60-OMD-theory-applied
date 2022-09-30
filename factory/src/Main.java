public class Main {

  public static void main(String[] args) {
    Computer pc = ComputerFactory.getComputer("PC", "2 GB", "2.4 Ghz");
    Computer server = ComputerFactory.getComputer("Server", "16 GB", "3.0 Ghz");

    System.out.println("Factory PC Config: " + pc);
    System.out.println("Factory Server Config: " + server);
  }

}

