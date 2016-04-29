import java.util.Scanner;
public class Gambling {
	static int balance = 100; 
	static int Dicetotal = 0;
	static int dieRoll = 0;
	static int bet = 0;
	static int guess = 0;
	static int sum = 0;
	public static void main(String[] args) {
		{
			greetUser();
			takeBet();
			takeGuess();
			rollDice();
			printOutcome();			
		}
		}
		public static void greetUser()
		{
			System.out.println("Hello there. My name is Gerald. You have $100 eh? Let's place a bet"); 
		}
		public static void takeBet()
		{
			System.out.println("How much of your money do you want to bet?");
			Scanner userInput = new Scanner(System.in);
			bet = userInput.nextInt();
			if (bet>balance)
			{
				takeBet();
			}
			if (bet<=0)
			{
				takeBet();
			}
			System.out.println("Sounds good to me!");
		}
		public static void takeGuess()
		{
			System.out.println("I'm going to roll two dice... If you guess the sum of the two dice correctly, you will make some money. What do you think the sum will be?");
			Scanner userInput = new Scanner(System.in);
			guess = userInput.nextInt();
		}
		public static void rollDice()
		{
			int die1 = (int)(Math.random()*6+1);
			int die2 = (int)(Math.random()*6+1);
			Dicetotal = die1+die2;
		}
		public static void printOutcome()
		{
			System.out.println("The total was " + Dicetotal);
			if(guess == Dicetotal)
			{
				sum = balance + bet*2;
				System.out.println("You Won! Your new balance is  " + sum);
			}
			else
			{
				sum = balance - bet;
				System.out.println("Not Quite Pal I'm Sorry, your new balance is  " +sum);
			}
		}
}
		
		
		
		
		



