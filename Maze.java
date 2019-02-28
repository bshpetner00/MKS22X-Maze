import java.util.*;
import java.io.*;

public class Maze {
	private char[][]maze;
	private boolean animate;
	public Maze(String filename) throws FileNotFoundException{
		animate = false;
		File text = new File(filename);
		Scanner inf = new Scanner(text);
		int lines = 0;
		int maxChars = 0;
		while (inf.hasNextLine()) {
			String line = inf.nextLine();
			lines++;
			if(maxChars < line.length()) {
				maxChars = line.length();
			}
		}
		Scanner inf2 = new Scanner(text);
		maze = new char[lines][maxChars];
		for (int r = 0; r < lines; r++) {
			String s = inf2.nextLine();
			for (int c = 0; c < maxChars; c++) {
				maze[r][c] = s.charAt(c);
			}
		}
	}

	private void wait(int millis){
        try {
        	Thread.sleep(millis);
        }
        catch (InterruptedException e) {}
    }

    public void setAnimate(boolean b){
        animate = b;
    }

    public void clearTerminal() {
    	System.out.println("\033[2J\033[1;1H");
    }
    public String toString() {
    	String x = "";
    	for (int i = 0; i < maze.length; i++) {
    		for (int j = 0; j < maze[i].length; j++) {
    			if (j + 1 == maze[i].length) {
    				x = x + maze[i][j] + "\n";
    			}
    			else {
    				x = x + maze[i][j];
    			}
    		}
    	}
    	return x;
    }
    public int solve() {
    	int r = 0
    	int c = 0
    	for (int i = 0; i < maze.length; i++) {
    		for (int j = 0; j < maze[i].length; j++) {
    			if (maze[i][j].equals('S')) {
    				r = i;
    				c = j;
    				maze[i][j] = ' ';
    			}
    		}
    	}
    	return solve(r,c);
    }

}