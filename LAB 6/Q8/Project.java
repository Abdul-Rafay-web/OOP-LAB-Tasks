package Q8;

public class Project {
    private static int projects=0;
    private String projectName;
    private int projectID;
    private final String projectDeadline;
    public Project(String projectName, int projectID, String projectDeadline) {
        this.projectName = projectName;
        this.projectID = projectID;
        this.projectDeadline = projectDeadline;
        projects++;
    }
    public static void displayProjects() {
        System.out.println("Total Projects: " + projects);
    }


}
