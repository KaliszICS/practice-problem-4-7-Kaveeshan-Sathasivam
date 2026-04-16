/**
	* Lesson: Random Module
	* Author: Kaveeshan
	* Date Created: April 16, 2026
	* Date Last Modified: April 16, 2026
	*/
import java.util.Random;
public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int randomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
    public static char randomChar(String str) {
        if (str == null || str.length() == 0) {
            return '\0'; // invalid input
        }

        Random rand = new Random();
        int index = rand.nextInt(str.length());
        return str.charAt(index);
    }

 public static int randomEvenNumber(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        int rangeSize = ((max - min) / 2) + 1;
        int randomIndex = (int)(Math.random() * rangeSize);

        int result = min + randomIndex;

        if (result % 2 != 0) {
            result++;
        }

        if (result > max) {
            result -= 2;
        }

        return result;
    }

	

}
