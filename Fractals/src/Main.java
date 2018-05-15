import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

//		if (solveMaze(maze, 0,0)) {
//			System.out.println("Cheese found");
//		}
//		else {
//			System.out.println("I starved");
//		}
//		
		JFrame mainFrame = new JFrame("Fractals");
		mainFrame.setSize(600,600);
		FractalComponent fComponent = new FractalComponent();
		mainFrame.add(fComponent);
		mainFrame.setVisible(true);
	}


}
