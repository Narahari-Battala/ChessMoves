import java.util.ArrayList;
import java.util.Scanner;

public class Knight implements ChessPiece{

	@Override
	public String getAvailablePositions(int row, int column) {
		int positions[][] = Chess.allPositions;
		ArrayList<String> al = new ArrayList<String>();
		int tcount = 2;
		int count = 0;
		int rowwise = row;
		int columnwise = column;
		
		while(tcount>0 && Instructions.checkValid(rowwise, --columnwise)) {
			
			tcount--;
		}
		if(tcount == 0) {
//			rowwise = row;
			if (Instructions.checkValid(rowwise - 1, columnwise) && positions[rowwise-1][columnwise] == 0) {
				System.out.println("Posible Position: " + count++);
				System.out.println(rowwise + " " + (char)((columnwise-1)+98));
				al.add(rowwise + " " + (columnwise));
			}
			if (Instructions.checkValid(rowwise + 1, columnwise) && positions[rowwise+1][columnwise] == 0) {
				System.out.println("Posible Position: " + count++);
				System.out.println(rowwise+2 + " " + (char)((columnwise-1)+98));
				al.add(rowwise+2 + " " + (columnwise));
			}	
		}
		 tcount=2;
		 rowwise = row;
		 columnwise = column;
		while(tcount>0 && Instructions.checkValid(rowwise, ++columnwise) ) {
			
			tcount--;
		}
		
		if(tcount == 0) {
//			columnwise = column;
			if (Instructions.checkValid(rowwise - 1, columnwise) && positions[rowwise-1][columnwise] == 0) {
				System.out.println("Posible Position: " + count++);
				System.out.println(rowwise + " " + (char)((columnwise-1)+98));
				al.add(rowwise + " " + (columnwise));
			}
			if (Instructions.checkValid(rowwise + 1, columnwise) && positions[rowwise+1][columnwise] == 0) {
				System.out.println("Posible Position: " + count++);
				System.out.println(rowwise+2 + " " + (char)((columnwise-1)+98));
				al.add(rowwise+2 + " " + (columnwise));
			}	
		}
		 tcount=2;
		 rowwise = row;
		 columnwise = column;
		 while(tcount>0 && Instructions.checkValid(--rowwise, columnwise)) {
				
				tcount--;
			}
			
			if(tcount == 0) {
//				columnwise = column;
				if (Instructions.checkValid(rowwise, columnwise-1) && positions[rowwise][columnwise-1] == 0) {
					System.out.println("Posible Position: " + count++);
					System.out.println(rowwise+1 + " " + (char)((columnwise-2)+98));
					al.add(rowwise+1 + " " + (columnwise-1));
				}
				if (Instructions.checkValid(rowwise, columnwise+1) && positions[rowwise][columnwise+1] == 0) {
					System.out.println("Posible Position: " + count++);
					System.out.println(rowwise+1 + " " + (char)((columnwise)+98));
					al.add(rowwise+1 + " " + (columnwise+1));
				}	
			}
			 tcount=2;
			 rowwise = row;
			 columnwise = column;
			 while(tcount>0 && Instructions.checkValid(++rowwise, columnwise)) {
					
					tcount--;
				}
				
				if(tcount == 0) {
//					columnwise = column;
					if (Instructions.checkValid(rowwise, columnwise-1) && positions[rowwise][columnwise-1] == 0) {
						System.out.println("Posible Position: " + count++);
						System.out.println(rowwise+1 + " " + (char)((columnwise-2)+98));
						al.add(rowwise+1 + " " + (columnwise-1));
					}
					if (Instructions.checkValid(rowwise, columnwise+1) && positions[rowwise][columnwise+1] == 0) {
						System.out.println("Posible Position: " + count++);
						System.out.println(rowwise+1 + " " + (char)((columnwise)+98));
						al.add(rowwise+1 + " " + (columnwise+1));
					}	
				}
		System.out.println(" ");
		if (count > 0) {
		System.out.println("Select the position number ( 0 - " + (count-1) + " ) you want the knight to move to ");
		}
		else {
			System.out.println("Knight is blocked, it cannot be moved");
		}
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		return al.get(x);
	}

}
