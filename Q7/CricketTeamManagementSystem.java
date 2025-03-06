package Q7;

import java.util.Scanner;

public class CricketTeamManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the Player");
        String name = scan.nextLine();
        System.out.println("Enter the role of the Player");
        String role = scan.nextLine();
        System.out.println("Enter the number of Runs");
        int runs = scan.nextInt();
        System.out.println("Enter the number of Wickets");
        int wickets = scan.nextInt();
        scan.nextLine();
        Player p1 = new Player(name, role, runs, wickets);
        System.out.println("Enter the name of the Team");
        String teamName = scan.nextLine();
        System.out.println("Enter the country of the Team");
        String country = scan.nextLine();
        System.out.println("Enter the name of the Coach");
        String coach = scan.nextLine();
        Team team =new Team(teamName,country,coach);
        team.addPlayer(p1);
        Player p2 = new Player("Babar Azam ","Batsman",15000,4);
        Player p3 = new Player("Muhammad Rizwan ","Wicket-Keeper & Captain",8000,0);
        team.addPlayer(p2);
        team.addPlayer(p3);
        team.displayTeamInfo();
    }
}
