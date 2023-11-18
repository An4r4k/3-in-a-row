public class Grid{
	int rows = 5, columns = 5;
	public Grid(int inputRows, int inputColumns){
		rows = inputRows;
		columns = inputColumns;
	}
	int[][] arr = new int[rows][columns]; 
	for (int i = 0; i < rows; i++) { 
		for (int j = 0; j < columns; j++) { 
			arr[i][j] = j; 
		} 
	}
	Square[][] squares = new Square[rows][columns];
	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < columns; j++) {
			squares[i][j] = new Square("grey");
		}
	}
	
}
