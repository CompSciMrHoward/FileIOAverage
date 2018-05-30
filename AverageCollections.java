import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AverageCollections {

	public static void main(String[] args) {
		File avg = new File("C:\\Users\\dhoward1\\Desktop\\average.dat");
		List<String> list = new ArrayList<>();
		try(BufferedReader stream = Files.newBufferedReader(Paths.get(avg.toURI()))){
			BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\dhoward1\\Desktop\\averageOutput.txt"));

			list = stream.lines().collect(Collectors.toList());
			list.remove(0);
			System.out.println(list);
			for (int i = 0; i < list.size(); i++) {
				String[] nums =list.get(i).split(" ");
				
			}
			 
			 
			 //forEach(new Scanner(stream.readLine()));
				
				
				
			
			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
