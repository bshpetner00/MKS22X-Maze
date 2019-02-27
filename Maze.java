import java.util.*;
import java.io.*;

public class Maze {
	private char[][]maze;
	private boolean animate;
	public Maze(String filename) throws FileNotFoundException{
		animate = false;
		File text = new File("filename");
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
		maze = new char[lines][maxChars];
		
	}
}