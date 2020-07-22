import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class A7 {

	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<>();
		try {
			BufferedReader inFile = new BufferedReader(new FileReader("words.txt"));
			while (inFile.readLine() != null) {
				data.add(inFile.readLine());
			}
			inFile.close();
			Collections.sort(data);
			BufferedWriter outFile = new BufferedWriter(new FileWriter("wordsOut.txt"));
			for (String s : data) {
				System.out.println(s);
				outFile.write(s);
				outFile.newLine();
			}
			outFile.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}