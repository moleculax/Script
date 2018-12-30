public class PrivateElevator1Test {

  public static void main(String args[]) {
    
    PrivateElevator1 privElevator = new PrivateElevator1();
    
    /**************************************************
    * The following lines of code will not compile    *
    * because they attempt to access private          *
    * variables.                                      *
    **************************************************/

    privElevator.doorOpen = true;  //passengers get on
    privElevator.doorOpen = false; //doors close
    //go down to currentFloor 0 (below bottom of building)
    privElevator.currentFloor--;         
    privElevator.currentFloor++;

    //jump to currentFloor 7 (only 5 floors in building)
    privElevator.currentFloor = 7;        
    privElevator.doorOpen = true;  //passengers get on/off
    privElevator.doorOpen = false;
    privElevator.currentFloor = 1; //go to the first floor
    privElevator.doorOpen = true;  //passengers get on/off
    privElevator.currentFloor++;   //elevator moves with door open
    privElevator.doorOpen = false;
    privElevator.currentFloor--;
    privElevator.currentFloor--;
  }
}
