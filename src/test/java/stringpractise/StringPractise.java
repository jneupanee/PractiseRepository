package stringpractise;

public class StringPractise {

	public static void main(String[] args) {

		StringPractise sp = new StringPractise();
		sp.findVowelandConsonant("Banana");
		sp.findVowelandConsonant("There is a quiet mouse");
		sp.findVowelandConsonant("Hello");
		sp.findVowelandConsonant("I am happy");

	}

	public void findVowelandConsonant(String test) {
		System.out.println();
		int vowel = 0;
		int consonant = 0;

		System.out.println(test);

		test = test.toLowerCase().replaceAll("\\s", "");
		
		char[] stringArray = test.toCharArray();

		for (char c : stringArray) {

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				vowel++;
			else 
				consonant++;

		}

		System.out.println("The string has: " + vowel + " vowels");
		System.out.println("The string has: " + consonant + " consonant");

	}

}
