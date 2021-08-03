public class ProjectTest {
  public static void main(String[] args){
    Project project1 = new Project();
    Project project2 = new Project("Project 2");
    Project project3 = new Project("Project 3", "This project has a name and description.");
    Project project4 = new Project("Project 4", "This project has a name, description and initial cost.", 50.00);

    System.out.println("---------- Constructor without arguments ----------");
    System.out.println(project1.elevatorPitch());

    System.out.println("---------- Set name/description ----------");
    project1.setName("Project 1");
    project1.setDescription("This project starts out with no name/description in constructor.");
    System.out.println(project1.elevatorPitch());

    System.out.println("---------- Constructor with name only ----------");
    System.out.println(project2.elevatorPitch());

    System.out.println("---------- Set description ----------");
    project2.setDescription("This project starts out with no description in constructor.");
    System.out.println(project2.elevatorPitch());

    System.out.println("---------- Constructor with name/description ----------");
    System.out.println(project3.elevatorPitch());

    System.out.println("---------- Constructor with name/description/initial cost ----------");
    System.out.println(project4.elevatorPitch());

    System.out.println("---------- Get name and description of all projects ----------");
    System.out.println(project1.getName() + " - " + project1.getDescription());
    System.out.println(project2.getName() + " - " + project2.getDescription());
    System.out.println(project3.getName() + " - " + project3.getDescription());
    System.out.println(project4.getName() + " ($" + project4.getInitialCost() + ") - " + project4.getDescription());


  }
}