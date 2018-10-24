import java.util.ArrayList;
import java.util.Scanner;

public class Pawn implements ChessPiece{
	
	int positions[][] = Chess.allPositions;
	ArrayList<String> al = new ArrayList<String>();
	int count = 0;
	public String getAvailablePositions(int row, int column) {
		
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
		System.out.println("Select the position number ( 0 - " + (count-1) + " ) you want the pawn to move to ");
		}
		else {
			System.out.println("Pawn is blocked, it cannot be moved");
		}
		int x;
		while (true) {
		Scanner s = new Scanner(System.in);
		try {
		x = s.nextInt();
		}
		catch(Exception e) {
			System.out.println("Enter a valid position number ( 0 - " + (count-1) + " )");
			continue;
		}
		if (x > count-1) {
			System.out.println("Enter a valid position number ( 0 - " + (count-1) + " )");
			continue;
		}
		else {
		break;
			
		}
		}
		return al.get(x);
	}

}
