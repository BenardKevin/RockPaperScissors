import java.util.*;

public class RockPaperScissors {

    String[] gameActions;
    Map<String, String[]> winConditions;

    public RockPaperScissors(Map<String, String[]> winConditions) {
        this.winConditions = winConditions;
    }

    public void play(Integer nbPlay) {
        gameActions = getGameActions(winConditions);

        Scanner action = new Scanner(System.in);

        for (int i = 0; i < nbPlay; i++) {
            System.out.println("Enter your choice: ");
            System.out.println(Arrays.toString(gameActions));
            String userAction = action.nextLine();

            while (!checkAction(userAction)) {
                System.out.println("Please enter a correct entry: ");
                System.out.println(Arrays.toString(gameActions));
                userAction = action.nextLine();
            }

            String computerAction = getComputerAction();
            String result = getResult(computerAction, userAction);

            System.out.println(result);
            System.out.println("--- End ---");
        }
        action.close();
    }

    public static String[] getGameActions(Map<String, String[]> map) {
        String[] gameActions = new String[map.size()];
        int index = 0;
        for (Map.Entry<String, String[]> entry : map.entrySet()) {
            gameActions[index++] = entry.getValue()[0];
        }
        return gameActions;
    }

    private boolean checkAction(String userAction) {
        return Arrays.asList(gameActions).contains(userAction);
    }

    private String getComputerAction() {
        int random = (int)(gameActions.length * Math.random());
        return gameActions[random];
    }

    private String getResult(String computerAction, String userAction) {
        if (Objects.equals(computerAction, userAction)) {
            return "It's a tie!";
        } else if (Arrays.asList(winConditions.get(userAction)).contains(computerAction)) {
            return "I choose " + computerAction + ". You win!";
        } else {
            return "I choose " + computerAction + ". You lose!";
        }
    }
}
