package Q3;
import java.util.ArrayList;
public class Participant {
    private String name;
    private int id;
    private boolean solved;
    private int correctAnswers=0;
    private int solvedProblems=0;
    ArrayList<Competition>competitions;
    ArrayList<Solution>solutions;
    public Participant (String name,int id) {
        this.name = name;
        competitions = new ArrayList<>();
        solutions = new ArrayList<>();
        this.id = id;
    }
    public void submitSolution (Solution solution) {
        solutions.add(solution);
        for (Solution s : solutions) {
            if (solution.equals(s)) {
                this.solvedProblems++;
               this.correctAnswers++;
                this.solved = true;
                break;
            }
        }
    }
    public void addCompetition(Competition competition) {
        competitions.add(competition);
    }
    public void displayParticipant () {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Solved Problems: " + solvedProblems);
        System.out.println("CorrectAnswers: " + correctAnswers);
        for (Solution solution : solutions) {
            solution.displaySolutionDetails();
        }
        System.out.println("Competitions: ");
        for (Competition competition : competitions) {
            competition.displayCompetition();
        }
    }
}

