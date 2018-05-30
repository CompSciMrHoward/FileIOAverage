import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class AverageDoubleStream {
//@SuppressWarnings("unchecked")
public static void main(String[] args) {
	File avg = new File("C:\\Users\\dhoward1\\Desktop\\average.dat");
	try(BufferedReader reader = Files.newBufferedReader(Paths.get(avg.toURI()))){
		BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\dhoward1\\Desktop\\averageOutput.txt"));
		reader.skip(3);
		while(reader.ready()) {
		Collection<String> list = (List<String>) new ArrayList(
				Arrays.asList(reader.readLine().split(" ")));
		DoubleSummaryStatistics stats = new DoubleSummaryStatistics();
		for(String d : list) {
		stats.accept(Double.parseDouble(d));
		}
		write.write(list.toString() + ":  Average = " 
		+ String.format("%.2f",(stats.getSum()-stats.getMin())/(stats.getCount()-1)));	
		write.newLine();
		
		}
		write.close();
		/*while(reader.ready()){
			Collection<String> thisList = (List<String>) new ArrayList(Arrays.asList(reader.readLine().split(" ")));
		  double average = thisList.stream().mapToDouble(e -> e).average();
							
					write.write(s + "  Average = " + average );
					}
					*/
		
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}

}


