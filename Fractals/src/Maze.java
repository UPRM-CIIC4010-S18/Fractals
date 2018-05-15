
public class Maze {
	
	public static int maze[][] = {
			{ 1, 1, 0, 0, 0, 1 },
			{ 0, 1, 1, 1, 0, 1 },
			{ 2, 0, 0, 1, 0, 1 },
			{ 1, 1, 1, 1, 1, 1 }
	};

	public static boolean solveMaze(int[][] maze, int startRow, int startCol) {
		if (startCol >= 0 && startCol < 6 && startRow >=0 && startRow < 4) {
			switch (maze[startRow][startCol]) {
			case 0: 
			case 3: return false;

			case 2: System.out.println("Cheese found at" + startRow + " " + startCol);
			return true;

			case 1: 
				maze[startRow][startCol] = 3; // Mark cell as visited
				return (solveMaze(maze, startRow - 1, startCol) ||
						solveMaze(maze, startRow, startCol + 1) ||
						solveMaze(maze, startRow + 1, startCol) ||
						solveMaze(maze, startRow, startCol - 1));
			default:
				return false;
			}
		}
		return false; // Mouse outside maze
	}
}
