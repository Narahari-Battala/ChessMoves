import java.util.ArrayList;
import java.util.Scanner;

public class Queen implements ChessPiece{

	@Override
	public String getAvailablePositions(int row, int column) {
		
		int positions[][] = Chess.allPositions;
		ArrayList<String> al = new ArrayList<String>();
		int count = 0;
		int rowwise = row;
		int columnwise = column;
		
		while(Instructions.checkValid(--rowwise, column) && positions[rowwise][column] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(rowwise+1 + " " + (char)((column+1)+96));
			al.add(rowwise+1 + " " + (column));
			
		}
		rowwise = row;
		while(Instructions.checkValid(++rowwise, column) && positions[rowwise][column] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(rowwise+1 + " " + (char)((column+1)+96));
			al.add(rowwise+1 + " " + (column));
			
		}
		
		
		while(Instructions.checkValid(row, --columnwise) && positions[row][columnwise] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(row+1 + " " + (char)((columnwise+1)+96));
			al.add(row+1 + " " + columnwise);
		}
		columnwise = column;
		
		while(Instructions.checkValid(row, ++columnwise) && positions[row][columnwise] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(row+1 + " " + (char)((columnwise+1)+96));
			al.add(row+1 + " " + columnwise);
		}
		 rowwise = row;
		 columnwise = column;
		while(Instructions.checkValid(++rowwise, --columnwise) && positions[rowwise][columnwise] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(rowwise+1 + " " + (char)((columnwise-1)+98));
			al.add(rowwise+1 + " " + (columnwise));
		}
		 rowwise = row;
		 columnwise = column;
		while(Instructions.checkValid(++rowwise, ++columnwise) && positions[rowwise][columnwise] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(rowwise+1 + " " + (char)((columnwise-1)+98));
			al.add(rowwise+1 + " " + (columnwise));
		}
		rowwise = row;
		 columnwise = column;
		while(Instructions.checkValid(--rowwise, --columnwise) && positions[rowwise][columnwise] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(rowwise+1 + " " + (char)((columnwise-1)+98));
			al.add(rowwise+1 + " " + (columnwise));
		}
		rowwise = row;
		 columnwise = column;
		while(Instructions.checkValid(--rowwise, ++columnwise) && positions[rowwise][columnwise] == 0) {
			
			System.out.println("Posible Position: " + count++);
			System.out.println(rowwise+1 + " " + (char)((columnwise-1)+98));
			al.add(rowwise+1 + " " + (columnwise));
		}
		System.out.println(" ");
		if (count > 0) {
		System.out.println("Select the position number ( 0 - " + (count-1) + " ) you want the rook to move to ");
		}
		else {
				System.out.println("Queen is blocked, it cannot be moved");
		}
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		return al.get(x);
	}

	
}
