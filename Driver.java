import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args) {
		try {
			Maze m = new Maze("Maze1.txt");
			System.out.println(m.toString());
		}
		catch (FileNotFoundException e){
			System.out.println("somethign really bad hapoepn");
		}
	}
}