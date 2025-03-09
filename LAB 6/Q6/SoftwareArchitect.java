package Q6;

public class SoftwareArchitect extends Developer{
    private int projectCount;
    public SoftwareArchitect(String name, int id, double salary,String programmingLanguage, int projectCount) {
        super(name,id,salary,programmingLanguage);
        this.projectCount = projectCount;
    }
    public boolean checkLeadershipEligibility() {
        if(projectCount>=5){
            return true;
        }
        else{
            return false;
        }
    }
    public void displaySoftwareArchitect() {
        super.displayDeveloper();
        System.out.println("Project Count: " + projectCount);
        System.out.println("Eligibility: " + checkLeadershipEligibility());
    }
}
