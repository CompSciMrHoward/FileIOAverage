import java.util.Scanner;

public class Average {
private String line;

public Average(String s) {
	this.line = s;
}

public String getLine() {
	return line;
}

public void setLine(String line) {
	this.line = line;
}
private int getLowest()
{
	int lowest=Integer.MAX_VALUE;
	Scanner chopper = new Scanner(line);
	while(chopper.hasNextInt())
	{
		int num = chopper.nextInt();
		if(num<lowest)
		   lowest=num;
	}
	return lowest;
}
}
