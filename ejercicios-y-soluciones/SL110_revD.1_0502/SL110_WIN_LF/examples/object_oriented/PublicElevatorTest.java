public class PublicElevatorTest {

  public static void main(String args[]) {
    
    PublicElevator pubElevator = new PublicElevator();
    
    pubElevator.doorOpen = true;  //passengers get on
    pubElevator.doorOpen = false; //doors close
    //go down to floor 0 (below bottom of building)
    pubElevator.currentFloor--;         
    pubElevator.currentFloor++;

    //jump to floor 7 (only 5 floors in building)
    pubElevator.currentFloor = 7;        
    pubElevator.doorOpen = true;  //passengers get on/off
    pubElevator.doorOpen = false;
    pubElevator.currentFloor = 1; //go to the first floor
    pubElevator.doorOpen = true;  //passengers get on/off
    pubElevator.currentFloor++;   //elevator moves with door open
    pubElevator.doorOpen = false;
    pubElevator.currentFloor--;
    pubElevator.currentFloor--;
  }
}
