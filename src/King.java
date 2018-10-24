import java.util.ArrayList;
import java.util.Scanner;

public class King implements ChessPiece{

	int positions[][] = Chess.allPositions;
	ArrayList<String> al = new ArrayList<String>();
	int count = 0;
	@Override
	public String getAvailablePositions(int row, int column) {
		
		if (Instructions.checkValid(row-1, column-1)&&positions[row-1][column-1] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(row + " " + (char)((column)+96));
			al.add(row + " " + (column-1));
		}
		if (Instructions.checkValid(row-1, column)&&positions[row-1][column] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(row + " " + (char)((column+1)+96));
			al.add(row + " " + (column));
		}
		if (Instructions.checkValid(row-1, column+1)&&positions[row-1][column+1] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(row + " " + (char)((column+2)+96));
			al.add(row + " " + (column+1));
		}
		
		if (Instructions.checkValid(row, column-1) && positions[row][column-1] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(row+1 + " " + (char)((column)+96));
			al.add(row+1 + " " + (column-1));
		}
		if (Instructions.checkValid(row, column+1) && positions[row][column+1] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(row+1 + " " + (char)((column+2)+96));
			al.add(row+1 + " " + (column+1));
		}
		if (Instructions.checkValid(row+1, column-1)&&positions[row+1][column-1] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(row+2 + " " + (char)((column)+96));
			al.add(row+2 + " " + (column-1));
		}
		
		if (Instructions.checkValid(row+1, column) && positions[row+1][column] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(row+2 + " " + (char)((column+1)+96));
			al.add(row+2 + " " + column);
		}
		if (Instructions.checkValid(row+1, column+1) && positions[row+1][column+1] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(row+2 + " " + (char)((column+2)+96));
			al.add(row+2 + " " + (column+1));
		}
		
		
		
		
		System.out.println(" ");
		if (count > 0) {
		System.out.println("Select the position number ( 0 - " + (count-1) + " ) you want the rook to move to ");
		}
		else {
			System.out.println("King is blocked, it cannot be moved");
		}
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		return al.get(x);
	}

	
}
