package t1;
import java.util.Scanner;
import java.io.*;

public class example {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		String name = s.next();
		int num1 = s.nextInt();
		double num2 = s.nextDouble();
		
		PrintStream outputFile = new PrintStream(("save.txt"));
		outputFile.println(name);
		outputFile.println(num1);
		outputFile.println(num2);
		
		Scanner ts = new Scanner(new File("save.txt"));
		String name1 = ts.next();
		int num11 = ts.nextInt();
		double num22 = ts.nextDouble();
		
		System.out.println(name1);
		System.out.println(num11);
		System.out.println(num22);
		
		
		
		

	}

}
