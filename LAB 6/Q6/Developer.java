package Q6;

public class Developer extends Employee {
    private String programmingLanguage;
    public Developer(String name,int id,double Salary,String programmingLanguage) {
        super(name,id,Salary);
        this.programmingLanguage = programmingLanguage;
    }
    public boolean checkEligibility() {
        if ("Java".equals(programmingLanguage)) {
            return true;
        }else{
            return false;
        }
    }
    public void displayDeveloper() {
        super.displayEmployee();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("Developer Eligibility: " + checkEligibility());
    }
}
