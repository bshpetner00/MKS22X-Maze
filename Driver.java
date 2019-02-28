import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args) {
		try {
			Maze m1 = new Maze("data1.dat");
			System.out.println(m1.toString());
			Maze m2 = new Maze("data2.dat");
			System.out.println(m2.toString());
			Maze m3 = new Maze("data3.dat");
			System.out.println(m3.toString());
		}
		catch (FileNotFoundException e){
			System.out.println("somethign really bad hapoepn");
		}
	}
}