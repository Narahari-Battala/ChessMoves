import java.util.ArrayList;
import java.util.Scanner;

public class Instructions {
	
	public static void gameInstructions() {
		
		System.out.println("The chess board in the program is assumed to be named as follows");
		
		System.out.println(" ");
		System.out.println("All the 8 rows are named using numbers [1-8] ");
		System.out.println(" ");
		System.out.println("All the 8 columns are named using albhabets [a-h]");
		System.out.println(" ");
		
		System.out.println("The positions are named as 1a, 1b , 1c , 1d, 1e, 1f, 1g, 1h ");
		System.out.println(" ");
		System.out.println("The positions are named as 2a, 2b , 2c , 2d, 2e, 2f, 2g, 2h ");
		System.out.println(" ");
		System.out.println(" ------------------------------------------------------------- ");
		System.out.println(" ");
		System.out.println("The positions are named as 8a, 8b , 8c , 8d, 8e, 8f, 8g, 8h ");
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ******** Let's start the game now ********");
		System.out.println(" ");
		System.out.println("You can Select one chess piece from the following : 1. Rook. 2. Knight. 3. Bishop. 4.Queen. 5.King. 6.Pawn ");
		
	}
	
	public static ArrayList<String> game() { 

		ArrayList<String> typeAndPosition = new ArrayList<>();
		System.out.println(" ");
		boolean check = true;
		
		while (check) {
		
		System.out.println("Enter the piece name");
		Scanner sc = new Scanner(System.in);
		String piece = sc.next();
		if (!(piece.equalsIgnoreCase("Pawn")|| piece.equalsIgnoreCase("Knight") || piece.equalsIgnoreCase("Queen")
				||piece.equalsIgnoreCase("King") || piece.equalsIgnoreCase("Rook") || piece.equalsIgnoreCase("Bishop"))) {
			
			System.out.println("  ");
			System.out.println(" ******* Please enter a valid Chess Piece ******* ");
			System.out.println("");
			check = true;
			continue;
		}
		
		else {
			
			System.out.println("  ");
			System.out.println("Enter the position of the " + piece);
			String position = sc.next();
			int row=1;
			if (!(position.length() == 2)) {
				
				System.out.println("  ");
				System.out.println(" ******* Please enter a valid Position. Check the instructions ******* ");
				System.out.println("");
				check = true;
				continue;
			}
			try {
			row = Integer.parseInt(position.substring(0, 1));
			}
			catch(NumberFormatException e) {
				
				System.out.println("  ");
				System.out.println(" ******* Please enter a valid Position. Check the instructions ******* ");
				System.out.println("");
				check = true;
				continue;
			}
			char column = position.charAt(1);
			
			if (!((row >=1 && row <=8) && (column == 'a' || column == 'b' || column == 'c' || column == 'd' || column == 'e' || column == 'f' || column == 'g' ||column == 'h' ))) {
				
				System.out.println("  ");
				System.out.println(" ******* Please enter a valid Position. Check the instructions ******* ");
				System.out.println("");
				check = true;
				continue;
			}
			
			else {
				
				typeAndPosition.add(piece);
				typeAndPosition.add(position);
				//sc.close();
				check = false;
			}
		
	}
		}
		return typeAndPosition;
	}
	
	public static boolean checkValid(int row, int column) {
		
		if ((row >=0 && row <=7) && (column >=0 && column <=7)) {
			return true;
		}
		
		return false;
	}

}
