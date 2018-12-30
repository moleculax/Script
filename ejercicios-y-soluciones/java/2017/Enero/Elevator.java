import java.util.*;
public class Elevator {

	public boolean doorOpen=false;
	public int currentFloor; //= 1;
	public final int TOP_FLOORS = 10;
	public final int MIN_FLOORS = 1;

	public void floor() {
	System.out.println("ASCENSOR");
	Scanner floor = new Scanner(System.in);
	System.out.println("Cual Piso?");
	currentFloor = floor.nextInt();
	
	}	
	
	public void openDoor() {
		System.out.println("Puerta abierta.");
		doorOpen = true;
		System.out.println("La puerta esta abierta.");
		
			}

	public void closeDoor() {
		System.out.println("Cerrando puerta");
		doorOpen = false;	
		System.out.println("Puerta cerrada");
		
	}
	
	public void goUp() {

		System.out.println("Subiendo un piso");
		currentFloor++;
		System.out.println("Piso: "+currentFloor);
			
	}
	
	public void goDown() {

	System.out.println("Bajando un piso.");
	currentFloor--;
	System.out.println("Piso: "+currentFloor);
	
	}

}