package battleships;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class Main {
	

	
	int twoBoat = 2;	//Tre stycken
	int threeBoat = 3;	//Två stycken
	int fourBoat = 4;	//Två stycken
	int fiveBoat = 5;	//En stycken
	
	public static void main(String[] args) {
		Main demo = new Main();
		demo.menu();
	}
	
	public void menu() {
		System.out.println("     Battleships     ");
		System.out.println("=====================");
		
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		
		while (a != 4) {
			a = showMenu();
			switch(a) {
				case 1:	
					runGame();
				
				break;
				
				case 2:
				
				break;
			
				case 3:
				
				break;
			
				case 4:
				
				break;
			}
			
		}
	}
	
	public void runGame() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nickname For Player 1");
		String playerOne = scan.nextLine();
		
		System.out.println("Nickname For Player 2");
		String playerTwo = scan.nextLine();
		
		int playerOneHealth = 25;
		int playerTwoHealth = 25;
		
		Board playerOneBoard = new Board();
		
		
		
		System.out.println("Now it is time to for Player 1 to place his boats");
		System.out.println("Type it like this ");
		
		System.out.println("Where would you like to set long boat?");
		String five = scan.nextLine();
		
		while(playerOneHealth != 0 || playerTwoHealth != 0) {
			
		}
		
	}
	
	private static int showMenu() {
		System.out.println("1. Play Versus Friend");
		System.out.println("2. Play Versus Bot");
		System.out.println("3. Show Highscores");
		System.out.println("4. Quit");
		
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		return choice;

	}
	
//	public void printBoard(char[][] a) {
//		
//		for (int i = 0; i < 10; i++) {
//			
//			for (int j = 0; j < 10; j++) {
//				
//			}
//			
//		}
//		
//	}	
}