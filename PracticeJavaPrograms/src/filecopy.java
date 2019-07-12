import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class filecopy {
	public static void main(String[] args) throws IOException {
		
		FileInputStream in = new FileInputStream(new File ("e:/priya.txt") );
		FileOutputStream out = new FileOutputStream(new File ("e:/priya1.txt") );
		
		
		for (int i = 0 ; i< 10 ;i ++)
		{
			out.write(i);
			
		}
		out.close();
		InputStreamReader ir = new InputStreamReader(in);
		System.out.println (ir.read());
		
		
		
	}

}
