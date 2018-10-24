import java.util.ArrayList;
import java.util.Scanner;


public class Chess {
	
	static int allPositions[][] = new int[8][8];
	
	public static void main(String args[]) {
		
		String next = "yes";
		
		Instructions.gameInstructions();
		
		while (next.equalsIgnoreCase("yes")) {
		
		ArrayList<String> typeAndPosition = Instructions.game();
		
		String position = typeAndPosition.get(1);
		int row = Integer.parseInt(position.substring(0, 1));
		int column = position.charAt(1) - 96;
		String piece = typeAndPosition.get(0);
		String selectedposition= "";
		
		//System.out.println(" row and columns is " + (row-1) + " " + (column-1));
		
		if (allPositions[row-1][column-1] == 1) {
			
			System.out.println(" ");
			System.out.println("This position is filled. Please select a different position");
			continue;
		}
		
		switch (piece.toLowerCase()) {
		
		case "pawn" :
			Pawn p =new Pawn();
			selectedposition = p.getAvailablePositions(row-1, column-1);
		    break;
		case "rook" :
			Rook r =new Rook();
			selectedposition = r.getAvailablePositions(row-1, column-1);
		    break;
		case "knight" :
			Knight kn =new Knight();
			selectedposition = kn.getAvailablePositions(row-1, column-1);
		    break;
		case "bishop" :
			Bishop b =new Bishop();
			selectedposition = b.getAvailablePositions(row-1, column-1);
		    break;
		case "king" :
			King k =new King();
			selectedposition = k.getAvailablePositions(row-1, column-1);
		    break;
		case "queen" :
			Queen q =new Queen();
			selectedposition = q.getAvailablePositions(row-1, column-1);
		    break;
			
		}
		
		int selectedrow = Integer.parseInt(selectedposition.substring(0, 1));
		int selectedcolumn = Integer.parseInt(selectedposition.substring(2));
		
		System.out.println("  ");
		System.out.println("finally selected row details " +  "row: " + (selectedrow) + " " + "column: " + ((char)(selectedcolumn + 97)));
		System.out.println("  ");
		
		allPositions[selectedrow-1][selectedcolumn] = 1;
		
		System.out.println("Do you want to continue [yes/no]");
		Scanner sc = new Scanner(System.in);
		next = sc.next();
		}
		System.out.println("  ");
		System.out.println("Hope you enjoyed playing the game");
		System.out.println("  ");
		System.out.println("Thank you");
	}

}
