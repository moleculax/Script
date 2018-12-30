public class Employee {

  private String name = "-name required-"; // default
  private String jobTitle = "-title required-"; // default
  private int employeeID = 0; // Default ID for all employees
  private int level = 0; // Default level for all employees
  

  public void setName(String n) {
    boolean flag = false;
    int length = n.length();

    if (length == 0) {
      System.out.println("Invalid employee name");
    }
    else {
      for (int x = 0; x < length; ++x) {
	char c = n.charAt(x);

	if (! Character.isDigit(c)) {
	  flag = true;
	}
	else {
	  flag = false;
	}
    
      }
    }
    if (flag) {
      name = n; // name now points to value for n
    }
    else {
      System.out.println("Invalid employee name, must contain characters");
    }
  }


  public String getName() {
    return name;
  }

  public void setJobTitle(String job) {
     boolean flag = false;
     int length = job.length();


    if (length == 0) {
      System.out.println("Invalid job title");
    }
    else {
      for (int x = 0; x < length; ++x) {
	char c = job.charAt(x);
	if (! Character.isDigit(c)) {
	  flag = true;
	}
	else {
	  flag = false;
	}
    
      }
    }

    if (flag) {
      jobTitle = job; // name now points to value for n
    }     
    else {
	System.out.println("Invalid job title, must contain characters");
      }
    }
 

  public String getJobTitle() {
    return jobTitle;
  }

  public void calculateEmployeeID() {
    int randomNum =((int)( Math.random()*10000)+1);
    employeeID = randomNum;
  } 

  public int getEmployeeID() {
    return employeeID;
  }
  public void setLevel(int l) {
    
    switch (l) {
    case 1:
      level = 1;
      break;
    case 2:
      level = 2;
      break;
    case 3:
      level = 3;
      break;
    default:
      System.out.println("Invalid Employee Level. Must be 1 through 3");
      break;
    }
  }
  public double getLevel() {
    return level;
  }

} // end of class



