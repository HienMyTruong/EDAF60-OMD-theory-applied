public abstract class HouseTemplate implements Building { //Template class (abstract superclass)

  public final void buildHouse(){ //Template method is final so subclasses can't override
    buildFoundation();
    buildWalls();
    System.out.println("House is built!");
  }

  public void buildFoundation() {
    System.out.println("Building house foundation: cement, iron and sand.");
  }

  protected abstract void buildWalls(); //Implemented in subclasses

}
