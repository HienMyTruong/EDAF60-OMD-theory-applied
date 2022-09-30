public class Main {

  public static void main(String[] args) {

    var person = Person
            .builder()
            .lastName("Einstein")
            .firstName("Albert")
            .build();

    System.out.println(person);
  }
}
