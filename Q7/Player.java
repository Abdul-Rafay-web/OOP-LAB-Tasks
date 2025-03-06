package Q7;

public class Player {
    private String name;
    private String Role;
    private int runs;
    private int wickets;
    public Player(String name, String Role, int runs, int wickets) {
        this.name = name;
        this.Role = Role;
        this.runs = runs;
        this.wickets = wickets;
    }
    public String getName() {
        return name;
    }
    public void displayPlayerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + Role);
        System.out.println("Runs: " + runs);
        System.out.println("Wickets: " + wickets);
    }
}
