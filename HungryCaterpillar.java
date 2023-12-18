import java.util.Scanner;
public class HungryCaterpillar {
	static int score = 0; // set the initial score to 0
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) { //write the main method that includes printing the story, stating the number of questions
		// and writing while/if/else if statements for the displayMenuGetOption method
		System.out.print(getStory());
		int numberOfQuestions = 6;
		int choice = displayMenuGetOption();
		while (true) {
			if (choice == 1) {
				multipleChoice();
			} else if (choice == 2) {
				trueFalse();
			} else if (choice == 3) {
				fillInTheBlank();
			} else if (choice == 4)
				displayScore(numberOfQuestions);
			else if (choice == 5) {
				System.out.println();
				System.out.println("Good-bye.");
				break;
			}
			else {
				System.out.println();
				System.out.println("Try again!");
			}
			choice = displayMenuGetOption();
		}
	}



	public static String getStory() { //the method that is called at the beginning of the main method to be printed
		String copyRight = "\nCopyright 1969, 1987 by Eric Carle LLC.\n\n";
		String titleAuthor = "\nTHE VERY HUNGRY CATERPILLAR by Eric Carle\n\n";
		String story = "\"In the light of the moon a little egg lay on a leaf."
				+ "\nOn Sunday morning the warm sun came up and -pop!- out of the egg came a tiny and very hungry caterpillar."
				+ "\nHe stared to look for some food."
				+ "\nOn Monday he ate through one apple. But we was still hungry."
				+ "\nOn Tuesday he ate through two pears, but he was still hungry."
				+ "\nOn Wednesday he ate through three plums, but he was still hungry."
				+ "\nOn Thursday he ate through four strawberries, but he was still hungry."
				+ "\nOn Friday he at through five oranges, but he was still hungry."
				+ "\nOn Saturday he ate through one piece of chocolate cake, one ice-cream cone, one pickle, one slice of watermelon."
				+ "\none slice of salami, \none lollipop, one piece of cherry pie, one sausage, one slice of watermelon."
				+ "\nThat night he had a stomachache!"
				+ "\nThe next day was Sunday again. The caterpillar ate through one nice green after that he felt much better."
				+ "\nNow he wasn't hungry anymore - and he wasn't a little caterpillar anymore."
				+ "\nHe was a big, fat caterpillar."
				+ "\nHe built a small house, called a cocoon, around himself. He stayed inside for more than two weeks."
				+ "Then he nibble a hole in the cocoon, pushed his way out and he was a beautiful butterfly!\"";

		String theEnd = "\n\nThe End.\n";
		return copyRight + titleAuthor + story + theEnd;
	}
	public static int displayMenuGetOption() { // question options that are called to everytime that the user
		// answers all of the questions in each section
		System.out.println();
		System.out.println("Choose the type of questions (5 to exit): \n" +
				"1) Multiple Choice \n" +
				"2) True/False \n" +
				"3) Fill in the blank \n" +
				"4) Display score \n" +
				"5) Exit ");
		int choice = input.nextInt();
		return choice;
	}

	public static void multipleChoice() { // if the user selects 1 from the menu page than it will route them to this choice
			System.out.println();
			System.out.println("Answer the following Multiple Choice Questions. Each correct answer is worth 1 point.");
			System.out.println("-------------------------------------------------------------------------------------");
			System.out.println();
			System.out.println("What did the caterpillar eat first? \n" +
					"1) a green leaf \n" +
					"2) a lollipop \n" +
					"3) an apple \n" +
					"4) a plum ");
			int multipleChoice1 = input.nextInt();
			compareIntAnswers(multipleChoice1,3);

			System.out.println();
			System.out.println("What did the caterpillar become? \n" +
					"1) a beautiful dragonfly \n" +
					"2) a beautiful fly \n" +
					"3) a beautiful ladybug \n" +
					"4) a beautiful butterfly ");
			int multipleChoice2 = input.nextInt();
			compareIntAnswers(multipleChoice2,4);
	}
	public static void trueFalse() { //if the user selects 2 on the menu than it will bring them to this section
			System.out.println();
			System.out.println("Answer the following True/False Questions. Each correct answer is worth 1 point.");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("A tiny and very hungry caterpillar came out of the little egg. \n" +
					"0 = false; 1 = true ");
				int trueFalse1 = input.nextInt();
			compareIntAnswers(trueFalse1,1);
			System.out.println();
			System.out.println("A strawberry made the caterpillar feel much better. \n" +
					"0 = false; 1 = true ");
				int trueFalse2 = input.nextInt();
					compareIntAnswers(trueFalse2,0);
	}
	public static void fillInTheBlank() { //if the user selects 3 on the menu than it will bring them to this section
			System.out.println();
			System.out.println("Answer the following Fill in the Blank Questions. Each correct answer is worth 1 point.");
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("The caterpillar built a _______ around himself.");
				String fillInTheBlank1 = input.next();
				compareStringAnswers(fillInTheBlank1, "caccon");

			System.out.println();
			System.out.println("The caterpillar ate through _______ pears.");
				int fillInTheBlank2 = input.nextInt();
				compareIntAnswers(fillInTheBlank2,3);
	}
	public static void displayScore(int num) { // if the user selects 4 on the menu than it will bring them to this section
		// which will display their score out of totoal questions followed by a phrase that represents how well they did
		System.out.println();
		System.out.println("You scored " + score + " out of 6");
		System.out.println();
				if(score >= 5){
					System.out.println("Excellent!");
				}
				else if((score == 3) || (score == 4)) {
					System.out.println("Very good!");
				}
				else {
					System.out.println("Try taking the test again.");
					}

	}
	public static void compareIntAnswers(int answer, int correctAnswer) { // this will compare the int answers and determine
		//if they are correct and output "That's correct" or "That's incorrect". It will also add a point to the score
		//if the answer is correct
		if (answer == correctAnswer) {
			System.out.println("That's correct!");
			score = score + 1;
		}else {
			System.out.println("That's incorrect!");
		}
	}
	public static void compareStringAnswers(String strAnswer, String correctStrAnswer) { //this will compare the string
		//answers and determine if they are correct and output "That's correct" or "That's incorrect". It will also add
		//a point to the score if the answer is correct.
		if (strAnswer == correctStrAnswer) {
			System.out.println("That's correct!");
			score = score + 1;
		}else {
			System.out.println("That's incorrect!");
		}
	}
}