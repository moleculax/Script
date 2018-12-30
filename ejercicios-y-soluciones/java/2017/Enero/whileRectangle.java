import java.util.*;

public class whileRectangle {

	public int height = 3;
	public int width = 10;

		public void displayRectangle() {
		
		int colCount = 0;
		int rowCount = 0;
		
		while (rowCount < height) {
			
			colCount = 0;
			
			while(colCount < width) {
				System.out.println("@");
				colCount++;			
			
			}		
		System.out.println();
		rowCount++;
		}		
		
		}
		
	public static void main(String[] args) {

		new whileRectangle().displayRectangle();	
	
	}

}