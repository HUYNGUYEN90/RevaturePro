import java.util.Scanner;

public class Three_exercise {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub


int min = 0;
int max = 10;
int random_number =  generateNumber (max , min);



while(!Checkguess(getNumber(min , max), random_number));
 input.close();

 


}

	private static int generateNumber(int max , int min) {
		return (int) Math.random()*(max - min +1) + min ;
	}
	
private static boolean Checkguess(int guess_number, int random_number) {
	if(guess_number< random_number)
	{
		System.out.println("Your number is small compare to random number");
		return false;
	}
	else if(guess_number> random_number) {
		System.out.println("Your number is large compare to random number");
		return false;
	}
	else {
		System.out.println("Your  guess number is correctly");
		return true;
	}
}



private static int getNumber(int min , int max) {
	System.out.println("Guess a number between  " + min + " and " +  max);
	while(!input.hasNextInt()) {
		input.nextLine(); 
		System.out.println("That's not a number.");
		System.out.println("Guess again.");
	}
	
	//return the first number
	return input.nextInt();  
}
}
