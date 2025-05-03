package wwek1.day2;

public class PalindromeExample {
public static void main(String[] args) {
	
	int input = 121;
	int output = 0;
	int origInput = input;
	for (int i = input; i > 0; i = i/10) {
		int rem = i % 10;
		output = (output * 10) + rem;
		if (origInput == input) {
			System.out.println("It is a Palindrome");
			
		} else {
			System.out.println("It is not a Palindrome ");
		}
		
	}
	
}
}
