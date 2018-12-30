public class Editor extends Employee {

  String [] skills = new String[10]; 
  boolean paperEditing;
  int index=0;
  
  public void setSkill(String skill) {
    boolean flag = false;
    int length = skill.length();

    if (length == 0) {
      System.out.println("Invalid skill");
    }
    else {
      for (int x = 0; x < length; ++x) {
	char c = skill.charAt(x);
	if (! Character.isDigit(c)) {
	  flag = true;
	}
	else {
	  flag = false;
	}
    
      }
    }
    if (flag) {
      skills[index] = skill; // name now points to value for skill
      ++index;
    }
    
    else {
      System.out.println("Invalid skill name, must contain characters");
    }
  }

  public String[] getSkills() {
    return skills;
  }
    

  public void setEditType(boolean editType) {
    paperEditing = editType;
  }

  public boolean getEditType() {
    return paperEditing;
  }
    
  // This method displays the values for an item
  public void displayEditorInformation() {
  
    System.out.println("Name: " + getName());
    System.out.println("Job Title:" + getJobTitle());
    System.out.println("Employee ID: " + getEmployeeID());
    System.out.println("Level: " + getLevel());
    for (int a = 0; a <= index; ++a) {
      if (skills[a] != null){
      System.out.println("Skill:" + skills[a]);
      }
    }
    System.out.println("Paper or Electronic: " + getEditType());
  }

} // end of class



