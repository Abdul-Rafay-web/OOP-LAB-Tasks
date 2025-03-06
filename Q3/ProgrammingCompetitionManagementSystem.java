package Q3;

import java.util.Scanner;

public class ProgrammingCompetitionManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the Participant : ");
        String name = scan.nextLine();
        System.out.println("Enter the ID of the Participant : ");
        int id = scan.nextInt();
        scan.nextLine();
        Participant p=new Participant(name,id);
        System.out.println("Enter the Problem Statement");
        String question=scan.nextLine();
        System.out.println("Enter the Difficulty Level");
        String difficulty=scan.nextLine();
        System.out.println("Enter the Competition name: ");
        String competition=scan.nextLine();
        Competition comp=new Competition(competition);
        Problem problem=new Problem(question,difficulty,comp);
        Competition comp2=new Competition("Programming Trivia ");
        Problem p2=new Problem("Full Form of OOP ?","Medium",comp2);
        comp.addParticipant(p);
        Participant p3=new Participant("Asad Ali",4567);
        comp2.addParticipant(p3);
        p.addCompetition(comp);
        System.out.println("Question: "+problem.getProblem()+" Submit your answer Below: ");
        String solution=scan.nextLine();
        Solution s1=new Solution("C",problem);
        p.submitSolution(s1);
        p.displayParticipant();
        Solution s2=new Solution("Object-Oriented Programming",p2);
        p3.submitSolution(s2);
        p3.addCompetition(comp2);
        p3.displayParticipant();
    }
}
