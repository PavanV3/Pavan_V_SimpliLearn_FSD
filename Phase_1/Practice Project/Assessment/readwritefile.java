package Assessment;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class readwritefile 
{
	
	public static void main (String[] args) throws IOException
	{
		
		FileWriter file = new FileWriter("C:\\Users\\Pavan Jr\\OneDrive\\Documents\\Writer.txt",true );
		BufferedWriter Bw= new BufferedWriter(file);
		Bw.write("Messi Neymar forever");
		@SuppressWarnings("resource")
		BufferedReader Br = new BufferedReader(new FileReader ("C:\\Users\\Pavan Jr\\OneDrive\\Documents\\Writer.txt"));
		Bw.newLine();
		Bw.close();
		Br.read();
		file.close();
		
		
	}

}