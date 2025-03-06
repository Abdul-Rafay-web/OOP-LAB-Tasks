package Q7;

import Q5.Car;

import java.util.ArrayList;

public class Team {
    private String teamName;
   private String country;
    private String coach;
   private ArrayList<Player>players;
    public Team(String teamName, String country, String coach) {
        this.teamName = teamName;
        this.country = country;
        this.coach = coach;
        this.players = new ArrayList<>();
    }
    public void addPlayer(Player p) {
        if(this.players.size() ==11) {
            System.out.println("Team is already full");
        }
        players.add(p);
    }
    public void displayTeamInfo() {
        System.out.println("Team Name: " + teamName);
        System.out.println("Country: " + country);
        System.out.println("Coach: " + coach);
        System.out.println("Players: \n");
        for (Player p : players) {
            p.displayPlayerDetails();
        }
    }
}
