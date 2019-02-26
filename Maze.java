import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maze {
	public static void main(String args[]) {
		try {
			File text = new File("Maze1.txt");
			Scanner inf = new Scanner(text);

			char[][] maze = new char[][]
			while (inf.hasNextLine()) {
				String line = inf.nextLine();
				System.out.println(line);
        	}

        	int lines =0;
    int characters =0;
    int maxCharacters =0;
    String longestLine= "";
     
    while(input.hasNextLine()){
        String line = input.nextLine();
        lines++;
        characters+=line.length();
        if(maxCharacters<line.length()){
            maxCharacters = line.length();
        longestLine = line;
        }
         
    }
        }
		catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}