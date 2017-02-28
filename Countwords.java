import java.util.HashMap;
import java.util.*;


public class Countwords {

public Countwords() {
		
	}

public void CountingWords(String Content) {

	String content=Content;
	 String[] splitted = content.split(" ");
     HashMap<String,Integer> hashmapper = new HashMap<String,Integer>();
     
     for (int i=0; i<splitted.length ; i++) {
    	 if (!hashmapper.containsKey(splitted[i])) {
             hashmapper.put(splitted[i],1);
         } else {
             hashmapper.put(splitted[i], (Integer) hashmapper.get(splitted[i]) + 1);
         }
	
}
     for (String key : hashmapper.keySet()) {

         System.out.println(key + " " + hashmapper.get(key));
     }

}

	
}

