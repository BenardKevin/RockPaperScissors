import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String[]> winConditions = new HashMap<>();

        CountrySelection countrySelection = new CountrySelection(winConditions);
        RockPaperScissors game = new RockPaperScissors(winConditions);

        countrySelection.countryselection();

        Scanner round = new Scanner(System.in);
        System.out.println("How many round to play ?: ");
        int nbPlay = round.nextInt();

        game.play(nbPlay);

        round.close();
    }
}