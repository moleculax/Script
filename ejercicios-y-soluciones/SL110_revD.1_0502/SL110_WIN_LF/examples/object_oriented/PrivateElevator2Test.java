public class PrivateElevator2Test {

   public static void main(String args[]) {
     
     PrivateElevator2 privElevator = new PrivateElevator2();
     
     privElevator.openDoor();
     privElevator.closeDoor();
     privElevator.goDown();
     privElevator.goUp();
     privElevator.goUp();
     privElevator.openDoor();
     privElevator.closeDoor();
     privElevator.goDown();
     privElevator.openDoor();
     privElevator.goDown();
     privElevator.closeDoor();
     privElevator.goDown();
     privElevator.goDown();

     int curFloor = privElevator.getFloor();
     
     if (curFloor != 5 && ! privElevator.getDoorStatus()) {
         privElevator.setFloor(5);
     }

     privElevator.setFloor(10);
     privElevator.openDoor();
   }
}
