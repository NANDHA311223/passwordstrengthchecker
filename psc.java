package cognifyz;
import java.util.Scanner;
public class leveltwotasktwo {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your password: ");
	        String password = scanner.nextLine();

	        int length = password.length();
	        boolean hasUppercase = !password.equals(password.toLowerCase());
	        boolean hasLowercase = !password.equals(password.toUpperCase());
	        boolean hasNumber = password.matches(".*\\d.*");
	        boolean hasSpecialChar = !password.matches("[A-Za-z0-9]*");

	        int score = calculateScore(length, hasUppercase, hasLowercase, hasNumber, hasSpecialChar);

	        String strength = getStrength(score);

	        System.out.println("Your password strength is: " + strength);

	        scanner.close();
	    }

	    private static int calculateScore(int length, boolean hasUppercase, boolean hasLowercase, boolean hasNumber, boolean hasSpecialChar) {
	        int score = 0;

	        // Add points for length
	        score += Math.min(length, 10) * 2;

	        // Add points for presence of uppercase letters
	        score += hasUppercase ? 10 : 0;

	        // Add points for presence of lowercase letters
	        score += hasLowercase ? 10 : 0;

	        // Add points for presence of numbers
	        score += hasNumber ? 10 : 0;

	        // Add points for presence of special characters
	        score += hasSpecialChar ? 10 : 0;

	        return score;
	    }

	    private static String getStrength(int score) {
	        if (score < 50) {
	            return "Weak";
	        } else if (score < 80) {
	            return "Moderate";
	        } else {
	            return "Strong";
	        }
	    }
	}


