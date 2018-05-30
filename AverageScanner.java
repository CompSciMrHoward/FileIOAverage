import java.io.*;

import java.util.*;


public class AverageScanner {
static int holder = 0, count = 0, sum= 0, lowest=Integer.MAX_VALUE;
static double average = 0;
	public static void main(String[] args) {
		//File avg = new File("C:\\Users\\dhoward1\\Desktop\\average.dat");
		
		
		try {
			Scanner file = new Scanner(new File("C:\\Users\\dhoward1\\Desktop\\average.dat"));
			file.nextLine();
			BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\dhoward1\\Desktop\\averageOutput.txt"));
			List<String> currLine = new ArrayList();
			int index = 0;
			while(file.hasNextLine() ) {
				currLine.add(file.nextLine());
				Scanner temp = new Scanner(currLine.get(index++));
				while(temp.hasNextInt()) {
					count++;
					 holder = temp.nextInt();
					 sum += holder;
					lowest = lowest < holder? lowest: holder;
				}
				average = (double)(sum - lowest) / --count;
				
				write.write(currLine.get(index - 1)+ "\nAverage is : " + String.format("%.2f", average) + "");
				write.newLine();
				resetVars();		
			}							
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
private static void resetVars() {
	count = 0;
	sum = 0;
	average = 0;
	lowest = Integer.MAX_VALUE;
}

}
