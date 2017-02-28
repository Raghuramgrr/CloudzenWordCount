import java.io.IOException;


public class MainCaller {

	
	
	
	public static void main(String[] args) throws IOException {
		
		FileInput fobj=new FileInput();
		Countwords countObj=new Countwords();
		
		countObj.CountingWords(fobj.ReadFile(args[0]));
		
		
		

	}

	

}
