
/*
 * Abduljabbar Shaamala
 * Lab Number 6
 */
import java.util.Scanner;

public class LabNum6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the Pig Latin translator");
		System.out.println("");
		String cont = "y"; // true loop condition
		// loop to check if the user want to continue
		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Please enter word you want translate: ");
			System.out.println("");
			String englisSentence = scan.nextLine();
			// change the word to lower case
			// englisSentence.toLowerCase();

			// split the sentence to single words
			String[] wordEnglish = englisSentence.split(" ");

			for (int i = 0; i < wordEnglish.length; i++) {
				// check the first letter
				char word = wordEnglish[i].charAt(0);

				if (word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u' ||word == 'A' || word == 'E' || word == 'I' || word == 'O' || word == 'U') {

					System.out.print(FirstletterVowel(wordEnglish[i]) + " ");
				} else {

					System.out.print(FirstletterConsonant(wordEnglish[i]) + " ");
				}
			}
			System.out.println("");
			System.out.println("Do yo want to continue? y/n");
			cont = scan.nextLine();

		}

		//
		System.out.println("Goodbye!");
		scan.close();

	}

	// this mothed to translate the word start with vowals
	public static String FirstletterVowel(String word) {

		return word.concat("way");
	}

	// this mothed to translate the word start with consonant
	public static String FirstletterConsonant(String word) {
		// sign the word length to j
		int j = word.length();
		// loop to determine the first vowal
		for (int i = 1; i < j; i++) {

			char vowel = word.charAt(i);
			if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'|| vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U') {
				// the part from first letter till first vowel
				String replceLetters = word.substring(0, i);
				// the part from first vowal
				String startLetters = word.substring(i);
				j = 0;
				word = startLetters.concat(replceLetters);
			}
		}

		return word.concat("ay");

	}

}
