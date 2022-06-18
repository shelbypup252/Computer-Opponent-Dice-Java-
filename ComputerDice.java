import java.util.Scanner;

public class ComputerDice {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		String yesNo;
		int score = 0;
		int games = 0;
		int loses = 0; //to keep track amount of wins (score), games (games), and losses (loses)
		
		int d1;
		int d2;
		int d3;
		int d4; //declared dice roll ints
		
		System.out.println("          Welcome to Computer Dice!       ");
		System.out.println("-----------------------------------------------");
		System.out.println("You will first roll your dice.");
		System.out.println();
		System.out.println("Then the output of your dice roll will be determined:");
		System.out.println();
		System.out.println("any Quad and you Win");
		System.out.println("any Triple and you Win");
		System.out.println("any TwoPair and you Win");
		System.out.println("any HighPair (two 4's) and you Win");
		System.out.println("anything else and you Lose");
		System.out.println("------------------------------------------"); //blah blah
		
		
		do { //to do the loop to prompt if player wants to play again
		System.out.println();
		System.out.println("     Player     ");
		System.out.println("-------------------------"); //hyphens, blah blah
		
		
		games = games + 1;
		d1 = (int)(Math.random() * 4) + 1;
		d2 = (int)(Math.random() * 4) + 1;
		d3 = (int)(Math.random() * 4) + 1;
		d4 = (int)(Math.random() * 4) + 1;
		System.out.println(d1 + " " + d2 + " " + d3 + " " + d4); //to set it up per the instructions
		System.out.println();
		boolean won = false; //to check if player has won; if not, then they lose
		
			if (d1 == d2 && d1 == d3 && d1 == d4) {
				System.out.println("Quad! You win!");
				score = score + 1;
				won = true; //to indicate that player has won
			}
			
			if (!won && (((d1 == d2) && (d2 == d3)) || ((d2 == d3) && (d3 == d4)) || ((d1 == d3) && (d3 == d4)))) {
				System.out.println("Triple! You win!");
				score = score + 1;
				won = true;
			}
			
			if (!won && (( (d1 == 4) && ((d2 == 4) || (d3 == 4) || (d4 == 4)) ) || ( (d2 == 4) && ((d1 == 4) || (d3 == 4) || (d4 == 4)) ) || ( (d3 == 4) && ((d2 == 4) || (d1 == 4) || (d4 == 4)) ) || ( (d4 == 4) && ((d2 == 4) || (d3 == 4) || (d1 == 4)) ))) {
				System.out.println("HighPair! You win!");
				score = score + 1;
				won = true;
			}
			
			if (!won && (( ( (d1 == d2) && (d3 == d4) ) || ( (d2 == d3) && (d1 == d4) ) || ( (d1 == d3) && (d2 == d4) ) ) && !(( (d1 == 4) && ((d2 == 4) || (d3 == 4) || (d4 == 4)) ) || ( (d2 == 4) && ((d1 == 4) || (d3 == 4) || (d4 == 4)) ) || ( (d3 == 4) && ((d2 == 4) || (d1 == 4) || (d4 == 4)) ) || ( (d4 == 4) && ((d2 == 4) || (d3 == 4) || (d1 == 4)) )))) {
				System.out.println("TwoPair! You win!");
				score = score + 1;
				won = true;
			}
			
			
			
			if (!won) {
				System.out.println("You lose!");
				loses = loses + 1; //to indicate that player has lost
			}
			
		
		
		System.out.print("Do you wish to play again? (y/n): ");
		yesNo = stdIn.nextLine();
		
			while (!(yesNo.contains("y") || yesNo.contains("n"))) {
				System.out.print("Do you wish to play again? (y/n): ");
				yesNo = stdIn.nextLine(); //to make sure player gives valid y/n input
			}
		
		
		
		
		} while (!(yesNo.contains("n"))); //for some reason, string.contains works way better, but only checks if something is in something, not if it's not, so I just did !string.contains
		
		System.out.println();
		System.out.println();
		System.out.println("Computer Dice Results:");
		System.out.println("--------------------------");
		System.out.println("You played " + games + " games total.");
		System.out.println();
		System.out.println("Games won: " + score);
		System.out.println("Games lost: " + loses);
		System.out.println("---------------------------"); //to display the summary
		
		stdIn.close();

	}

}
