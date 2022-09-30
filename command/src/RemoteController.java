public class RemoteController {  //Invoker-class

  Command command;
  int i = 0;

  public void setButton(Command command) {
    this.command = command;
  }

  public void pressButton() {
    if (i == 0) {
      command.execute();
      i = 1;
    } else {
      command.undo();
      i = 0;
    }
  }

}
