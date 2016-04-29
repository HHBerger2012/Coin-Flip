import java.util.Scanner;
public class CoinFlip {
	static int heads = 0;
	static int tails = 0;
	static int coinTotal;
	static int printTotal = 0;
	static int choice;
	public static void main(String[] args) {
		{
			greetUser();
			takeGuess();
			flipCoin();
			printTotal();
		}
		}
		public static void greetUser()
		{
			System.out.println("Let's flip some coins, eh? How many times should I flip it?");
		}
		public static void takeGuess()
		{
			Scanner userInput = new Scanner(System.in);
			choice = userInput.nextInt();
		}
		public static void flipCoin()
		{
			
			for (int i=1; i<=choice;i++)
			{
				if (Math.random() < 0.5)
				{
				heads++;
				}
				
					else
					{
						tails++;
					}
			}
		}
			public static void printTotal()
			{
				System.out.println("Heads" + " " + heads);
				System.out.println("Tails" + " " + tails);
			}
		
		}
		
		
		
		
		
		
		
