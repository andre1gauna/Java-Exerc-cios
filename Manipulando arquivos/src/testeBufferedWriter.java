import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class testeBufferedWriter {
	public static void main(String[] args) throws IOException {
	
		String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night"};
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			
		 	for (String line : lines)
			{
				bw.write(line);
				bw.newLine();
			}
		}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


