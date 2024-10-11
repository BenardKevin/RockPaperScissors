import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountrySelection {
	Map<String, String[]> winConditions;

	public CountrySelection(Map<String, String[]> winConditions) {
		this.winConditions = winConditions;
	}

	public void countryselection() {
		System.out.println("Welcome in the Rock Paper Scissors game !");
		System.out.println("Where are you from ? Write down your country --> ");
		Scanner in = new Scanner(System.in);
		String country = in.next();
		System.out.println("You selected " + country);

		switch (country) {
		case "Germany", "germany", "Deutschland", "deutschland", "Allemagne", "allemagne":
			System.out.println(
					"Choose the variation (write de-1 to play without the well and de-2 to play with it) --> ");
			String userentry = in.next();
			if (userentry.equals("de-1")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Rock" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
			} else if (userentry.equals("de-2")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Rock" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
				winConditions.put("Well", new String[] { "Scissors", "Rock" });
			}
			break;

		case "Austria", "austria", "Österreich", "österreich", "Autriche", "autriche":
			winConditions.put("Paper", new String[] { "Well", "Well" });
			winConditions.put("Scissors", new String[] { "Paper", "Paper" });
			winConditions.put("Well", new String[] { "Scissors", "Scissors" });
			break;

		case "Belgium", "belgium", "Belgique", "belgique", "België", "belgië", "Beldjike", "beldjike":
			System.out.println("Choose the variation (write be-1, be-2, be-3 or be-4) --> ");
			userentry = in.next();
			if (userentry.equals("be-1")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Rock" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
			} else if (userentry.equals("be-2")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Well" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
				winConditions.put("Well", new String[] { "Scissors", "Rock" });
			} else if (userentry.equals("be-3")) {
				winConditions.put("Rock", new String[] { "Scissors", "Lizard" });
				winConditions.put("Paper", new String[] { "Rock", "Magic Wand" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
				winConditions.put("Magic Wand", new String[] { "Scissors", "Rock" });
			} else if (userentry.equals("be-4")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Spock" });
				winConditions.put("Scissors", new String[] { "Paper", "Lizard" });
				winConditions.put("Lizard", new String[] { "Paper", "Spock" });
				winConditions.put("Spock", new String[] { "Scissors", "Rock" });
			}
			break;

		case "Canada", "canada":
			System.out.println("Choose the variation (write ca-1, ca-2,) --> ");
			userentry = in.next();
			if (userentry.equals("ca-1")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Rock" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
			} else if (userentry.equals("ca-2")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Well" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
				winConditions.put("Fuse", new String[] { "Scissors", "Rock" });
			}
			break;

		case "China", "china", "Chine", "chine", "中国":
			System.out.println("Choose the variation (write ch-1, ch-2) --> ");
			userentry = in.next();
			if (userentry.equals("ch-1")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Rock" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
			} else if (userentry.equals("ch-2")) {
				winConditions.put("Hammer", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Hammer", "Hammer" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
				break;
			}

		case "Us", "USA", "us", "usa", "US", "United States of America", "etats-unis", "Etats-unis", "états-unis":
			System.out.println("Choose the variation (write us-1, us-2, us-3) --> ");
			userentry = in.next();
			if (userentry.equals("us-1")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Rock" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
			} else if (userentry.equals("us-2")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Snake" });
				winConditions.put("Scissors", new String[] { "Paper", "Lizard" });
				winConditions.put("Lizard", new String[] { "Paper", "Snake" });
				winConditions.put("Snake", new String[] { "Scissors", "Rock" });
			} else if (userentry.equals("us-3")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Spock" });
				winConditions.put("Scissors", new String[] { "Paper", "Lizard" });
				winConditions.put("Lizard", new String[] { "Paper", "Spock" });
				winConditions.put("Spock", new String[] { "Scissors", "Rock" });
			}
			break;

		case "France", "france":
			System.out.println("Choose the variation (write fr-1, fr-2)--> ");
			userentry = in.next();
			if (userentry.equals("fr-1")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Rock" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
			} else if (userentry.equals("fr-2")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Well" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
				winConditions.put("Well", new String[] { "Scissors", "Rock" });
			}
			break;

		case "Indonesia", "indonesia", "Indonésie", "indonésie":
			userentry = "in-1";
			if (userentry.equals("in-1")) {
				winConditions.put("Elephant", new String[] { "Ant" });
				winConditions.put("Human", new String[] { "Elephant", "Elephant" });
				winConditions.put("Ant", new String[] { "Human" });
			}
			break;

		case "Japan", "japan", "Japon", "japon", "日本":
			System.out.println("Choose the variation (write jp-1 or jp-2) --> ");
			userentry = in.next();
			if (userentry.equals("jp-1")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Rock" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
			} else if (userentry.equals("jp-2")) {
				winConditions.put("Snake", new String[] { "Slug" });
				winConditions.put("Frog", new String[] { "Snake" });
				winConditions.put("Slug", new String[] { "Frog" });
			}
			break;

		case "Malaisie", "malaisie", "Malaysia", "malaysia":
			userentry = "ml-1";
			if (userentry.equals("ml-1")) {
				winConditions.put("Gun", new String[] { "Water" });
				winConditions.put("Brid", new String[] { "Gun" });
				winConditions.put("Water", new String[] { "Bird" });
			}
			break;

		case "Maroc", "maroc", "Morocco", "morocco", "المغرب":
			System.out.println("Choose the variation (write mr-1 or mr2)--> ");
			userentry = in.next();
			if (userentry.equals("mr-1")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Rock" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
			} else if (userentry.equals("mr-2")) {
				winConditions.put("Well", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Well" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
			}
			break;

		case "Birmanie", "birmanie", "Myanmar", "myanmar", "မြန်မာ":
			userentry = "ml-1";
			if (userentry.equals("ml-1")) {
				winConditions.put("Gun", new String[] { "Ciseaux", "Ciseaux" });
				winConditions.put("Bird", new String[] { "Ciseaux", "Ciseaux" });
				winConditions.put("Water", new String[] { "Ciseaux", "Ciseaux" });
			}
			break;

		case "Switzerland", "Swiss", "switzerland", "swiss", "suisse", "Suisse":
			System.out.println("Choose the variation (write sw-1 or sw2)--> ");
			userentry = in.next();
			if (userentry.equals("mr-1")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Rock" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
			} else if (userentry.equals("mr-2")) {
				winConditions.put("Rock", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Rock", "Well" });
				winConditions.put("Scissors", new String[] { "Paper", "Paper" });
				winConditions.put("Well", new String[] { "Scissors", "Rock" });
			}
			break;

		case "Vietnam", "vietnam", "Việt Nam":
			System.out.println("Choose the variation (write vi-1 or vi-2)--> ");
			userentry = in.next();
			if (userentry.equals("vi-1")) {
				winConditions.put("Hammer", new String[] { "Scissors" });
				winConditions.put("Paper", new String[] { "Hammer" });
				winConditions.put("Scissors", new String[] { "Paper" });
			} else if (userentry.equals("vi-2")) {
				winConditions.put("Hammer", new String[] { "Scissors", "Scissors" });
				winConditions.put("Paper", new String[] { "Hammer" });
				winConditions.put("Nail", new String[] { "Paper" });
			}
			break;
		}
	}
}
