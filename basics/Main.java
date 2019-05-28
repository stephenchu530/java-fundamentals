import java.util.Random;
import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		int dogCount = 1;
		System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

		int catCount = 2;
		System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

		int turtleCount = 0;
		System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

		flipNHeads(1);
		clock();
	}

  // This function returns the pluralized version of a word
	public static String pluralize(String word, int n) {
		return (n == 0 || n > 1) ? word + "s" : word;
	}

  // This function flips a coin however many times to get n heads in a row
	public static void flipNHeads(int n) {
		int totalFlips = 0, count = 0, flip = 0;
		Random rand = new Random();

		while (count < n) {
			flip = rand.nextInt(2);
			totalFlips++;
			if (flip == 0) {
				System.out.println("heads");
				count++;
			} else {
				System.out.println("tails");
				count = 0;
			}
		}
		System.out.printf("It took %d flips to flip %d head in a row.\n", totalFlips, count);
	}

  // This function constantly prints the local time
	public static void clock() {
		int hour;
		int minute;
		int second = LocalTime.now().getSecond();
		while (true) {
			if (LocalTime.now().getSecond() != second) {
				hour = LocalTime.now().getHour();
				minute = LocalTime.now().getMinute();
				second = LocalTime.now().getSecond();
				System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
			}
		}
	}
}
