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

		flipNHeads(3);
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
		System.out.printf("It took %d flips to flip %d %s in a row.\n", totalFlips, count, pluralize("head", count));
	}

  // This function constantly prints the local time
	public static void clock() {
		int hour = 0;
		int minute = 0;
		int second = LocalTime.now().getSecond();
		int hz = 0;
		int million = 1_000_000;
		
		while (true) {
			hz++;
			if (LocalTime.now().getSecond() != second) {
				hour = LocalTime.now().getHour();
				minute = LocalTime.now().getMinute();
				second = LocalTime.now().getSecond();
				System.out.printf("%02d:%02d:%02d %f MHz\n", hour, minute, second, Float.valueOf(hz) / million);
				hz = 0;
			}
		}
	}
}
