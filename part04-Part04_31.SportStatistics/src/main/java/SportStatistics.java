
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        ArrayList<Game> games = readFromFile(file);  //what does readFromFile do??
        System.out.println("Team:");
        String team = scan.nextLine();

        //count only the matches of a specified team
        ArrayList<Game> gamesOfATeam = new ArrayList<>();
        for (Game game : games) {
            if (team.equals(game.getHomeTeam()) || team.equals(game.getAwayTeam())) {
                gamesOfATeam.add(game);
            }
        }
        //print the number of games
        System.out.println("Games: " + gamesOfATeam.size());

        //count the number of wins
        int wins = 0;
        for (Game game : gamesOfATeam) {
            if (game.isWinner(team)) {
                wins++;
            }
        }
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (gamesOfATeam.size() - wins));

    }

    public static ArrayList<Game> readFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();

        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                games.add(new Game(homeTeam, awayTeam, homeScore, awayScore));

            }

        } catch (Exception e) {
            System.out.println("Error");
        }
        return games;
    }

}

//        ArrayList<Game> games = new ArrayList<>();
//        
//        try(Scanner reader = new Scanner(Paths.get(file))){
//            while(reader.hasNextLine()){
//                String row = reader.nextLine();
//                String[] parts = row.split(",");
//                String homeTeam = parts[0];
//                String awayTeam = parts[1];
//                int homeScore = Integer.valueOf(parts[2]);
//                int awayScore = Integer.valueOf(parts[3]);
//                
//                games.add(new Game(homeTeam, awayTeam, homeScore, awayScore));
//                
//            }
//        }catch(Exception e){
//            System.out.println("Reading the file " + file + " failed.");
//        }
//
//        
//        int count = 0;
//        int wins = 0;
//        int losses = 0;
//        
//        for(Game game:games){
//            String test = game.toString();
//            if (test.contains(team)){
//                count++;
//            }if (game.winner().equals(team)){
//                wins++;
//            }else{
//                losses++;
//            }
//            
//        }
//        System.out.println("Games: " + count);
//        System.out.println("Wins: " + wins);
//        System.out.println("Losses: " + losses);
//    }
//
//}
