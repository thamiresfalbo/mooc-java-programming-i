
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        ArrayList<Team> teams = readTeamsFromFile(file);
        System.out.println("Team: ");
        String searchedTeam = scan.nextLine();
        if (checkIfTeamExists(searchedTeam, teams)) {
            for (Team team : teams) {
                if (team.getName().equals(searchedTeam)) {
                    System.out.println("Games: " + team.getGames());
                    System.out.println("Wins: " + team.getWins());
                    System.out.println("Losses: " + team.getLosses());
                }
            }
        } else {
            System.out.println("Games: 0");
            System.out.println("Wins : 0");
            System.out.println("Losses: 0");
        }
    }

    public static ArrayList<Team> readTeamsFromFile(String file) {
        ArrayList<Team> teams = new ArrayList<>();

        try (Scanner scn = new Scanner(Paths.get(file))) {
            while (scn.hasNextLine()) {
                String row = scn.nextLine();

                if (row.isEmpty()) {
                    continue;
                }

                String[] parts = row.split(",");
                String homeTeam = parts[0];
                int homeScore = Integer.parseInt(parts[2]);

                String guestTeam = parts[1];
                int guestScore = Integer.parseInt(parts[3]);

                ///
                if (!checkIfTeamExists(homeTeam, teams)) {
                    teams.add(new Team(homeTeam));
                }
                if (!checkIfTeamExists(guestTeam, teams)) {
                    teams.add(new Team(guestTeam));
                }

                ///
                if (homeScore > guestScore) {
                    addScores(homeTeam, guestTeam, teams);
                } else {
                    addScores(guestTeam, homeTeam, teams);
                }

            }

        } catch (Exception e) {
            System.out.println("Error: File not found.");
        }
        return teams;
    }

    public static boolean checkIfTeamExists(String checkTeam, ArrayList<Team> teams) {
        for (Team team : teams) {
            if (team.getName().equals(checkTeam)) {
                return true;
            }
        }
        return false;
    }

    public static void addScores(String winningTeam, String losingTeam, ArrayList<Team> teams) {
        for (Team team : teams) {
            if (team.getName().equals(winningTeam)) {
                team.addWin();
            } else if (team.getName().equals(losingTeam)) {
                team.addLoss();
            }
        }
    }

}
