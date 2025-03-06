package Q3;

import java.util.ArrayList;

public class Problem {
    private String question;
    private String difficulty;
    ArrayList<Participant>participants;
    Competition competition;
    ArrayList<Participant>participants1;
    public Problem(String question, String difficulty,Competition competition) {
        this.question = question;
        this.difficulty = difficulty;
        this.participants = new ArrayList<>();
        this.competition =competition;
    }
    public void attemptProblem(Participant participant) {
        this.participants.add(participant);
    }
    public String getProblem() {
        return this.question;
    }
    public void problemDetails() {
        System.out.println("Question: " + question);
        System.out.println("Difficulty: " + difficulty);
    }
}
