public class VacationScaleTwo { 

  public int [] vacationDays;  
 
  public void setVacationScale() {
  
    vacationDays = new int[7];
  
    for (int count = 0; count < vacationDays.length; count++) {

      switch (count) {
      case 0:
	vacationDays[0] = 10;
	break;
      case 1:
	vacationDays[1] = 15;
	break;
      case 2:
	vacationDays[2] = 15;
	break;
      case 3:
	vacationDays[3] = 15;
	break;
      case 4:
      	vacationDays[4] = 20;
	break;
      case 5:
	vacationDays[5] = 20;
	break;
      default:
	vacationDays[6] = 25;
      }

    }
  }
  
  public void displayVacationDays(int yearsOfService) {
    if (yearsOfService >= 0 && yearsOfService < 6) {
    
    System.out.println("Your vacation is:" + vacationDays[yearsOfService]);
    }

    else {
      if (yearsOfService >= 6) {
      System.out.println("Your vacation is:" + vacationDays[6]);
    
      }

      else {
	System.out.println("Invalid years of service.");
      }
    }
  }
}// end class

    
    
        
    
