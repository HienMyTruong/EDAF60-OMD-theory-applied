public class Main {
  public static void main(String[] args) {
    Junior junior = new Junior();
    Senior senior = new Senior();
    Member member = new Member("Alfred", junior);
    member.payment();
    System.out.println("-----------------------");
    member.setMembership(senior);
    member.payment();
  }
}
