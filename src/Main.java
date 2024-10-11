import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String[]> winConditions = new HashMap<>();
        winConditions.put("Pierre", new String[]{"Ciseaux"});
        winConditions.put("Papier", new String[]{"Pierre"});
        winConditions.put("Ciseaux", new String[]{"Papier"});
        CountrySelection countryselection = new CountrySelection();
        RockPaperScissors game = new RockPaperScissors(winConditions);

        CountrySelection.countryselection();
        int nbPlay = 10;
        game.play(nbPlay);
    }
}