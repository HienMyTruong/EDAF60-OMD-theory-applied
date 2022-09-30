public class Member {
  private String name;
  private Strategy strategy;

  public Member(String name, Strategy strategy) {
    this.name = name;
    this.strategy = strategy;
  }

  public void setMembership(Strategy strat) {
    strategy = strat;
  }

  public void payment() {
    System.out.println(name + ", you shall pay: " + strategy.amount());
  }

}
