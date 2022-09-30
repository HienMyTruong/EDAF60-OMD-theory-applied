public class Receptionist {  //Facade-class
  private Room room;
  private RoomService roomService;

  public Receptionist() {
    room = new Room();
    roomService = new RoomService();
  }

  public void checkIn() {
    room.checkIn();
  }

  public void checkOut() {
    room.checkOut();
  }

  public void orderRoomService() {
    roomService.orderService();
  }

}
