
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.*;


public class FileInput {
	

	public FileInput() {
		
	}

	public String ReadFile(String filename) throws IOException
	{
		String content = null;
	    File file = new File(filename); 
	    FileReader reader = null;
	    try {
	        reader = new FileReader(file);
	        char[] chars = new char[(int) file.length()];
	        reader.read(chars);
	        content = new String(chars);
	        reader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if(reader !=null){reader.close();}
	    }
	    return content;
	}


}
