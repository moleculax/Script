public class EmployeeTest {
   
  public static void main (String args[]) {
 
  Editor myEditor = new Editor();
  GraphicIllustrator myGI = new GraphicIllustrator();
  TechnicalWriter myTW = new TechnicalWriter();
  Manager myManager = new Manager();

  myEditor.setName("Fred Hanson");
  myEditor.setJobTitle("Editor");
  myEditor.calculateEmployeeID();
  myEditor.setLevel(1);
  myEditor.setSkill("technical editing");
  myEditor.setSkill("typing");
  myEditor.setEditType(false);
  myEditor.displayEditorInformation();

  myGI.setName("Sara Smith");
  myGI.setJobTitle("Graphic Illustrator");
  myGI.calculateEmployeeID();
  myGI.setLevel(3);
  myGI.setSkill("technical illustration");
  myGI.setSkill("video production");
  myGI.setSkill("media authoring");
  myGI.displayGraphicsIllustratorInformation();

  myTW.setName("James Ralph");
  myTW.setJobTitle("Technical Writer");
  myTW.calculateEmployeeID();
  myTW.setLevel(1);
  myTW.setSkill("technical writing");
  myTW.displayTechnicalWriterInformation();

  myManager.setName("Susan Smith");
  myManager.setJobTitle("Manager");
  myManager.calculateEmployeeID();
  myManager.setLevel(2);
  myManager.setEmployee(myEditor);
  myManager.setEmployee(myGI);
  myManager.setEmployee(myTW);
  myManager.displayManagerInformation();

  } 
}
