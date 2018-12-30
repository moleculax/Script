public class Manager extends Employee {

  Employee [] employees = new Employee[10]; 
  int index=0;
  
  public void setEmployee(Employee employee) {
    if (employee == null) {
        System.out.println("Invalid employee");
    }
    else {
      employees[index] = employee; // name now points to value for employee
      ++index;
    }
  }

  public Employee[] getEmployees() {
    return employees;
  }
    
  // This method displays the values for an item
  public void displayManagerInformation() {
  
    System.out.println("Name: " + getName());
    System.out.println("Job Title:" + getJobTitle());
    System.out.println("Employee ID: " + getEmployeeID());
    System.out.println("Level: " + getLevel());
    for (int a = 0; a <= index; ++a) {
      if (employees[a] != null){
      System.out.println("Employee " + a + ": " + employees[a].getName());
      }
    }
    System.out.println();
  }

} // end of class



