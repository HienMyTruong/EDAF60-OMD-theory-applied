public class Person {

  private String firstName, lastName;

  private Person (PersonBuilder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
  }

  public String toString() {
    return String.format("firstname: %s, lastname: %s", firstName, lastName);
  }

  public static PersonBuilder builder() {
    return new PersonBuilder();
  }

  public static class PersonBuilder {

    private String firstName, lastName;
    private PersonBuilder() {}

    public PersonBuilder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public PersonBuilder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }
}
