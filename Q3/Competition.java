package Q3;

import java.util.ArrayList;

public class Competition {
    private String title;
    private ArrayList<Problem>problems;
    private ArrayList<Participant>participants;
    public Competition(String title) {
        this.title = title;
        this.problems = new ArrayList<>();
        this.participants = new ArrayList<>();
    }
    public void addProblem(Problem problem) {
        problems.add(problem);
    }
    public void addParticipant(Participant participant) {
        participants.add(participant);
    }
    public void displayCompetition() {
        System.out.println("Title: " + title);
    }
}
