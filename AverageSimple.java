import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class AverageSimple {

	public static void main(String[] args) {
		File avg = new File("C:\\Users\\dhoward1\\Desktop\\average.dat");
		Object[] currLine;
		try(Stream<String> stream = Files.lines(Paths.get(avg.toURI()))){
			int len = stream.toArray().length;
			DoubleStream dStream = stream.mapToInt(num -> Integer.parseInt(num)).asDoubleStream().sum());
			System.out.println(dStream.average());
								
								/*.sum()
								.reduce(e -> e / );*/
							
					//new Scanner(stream.toString());
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
