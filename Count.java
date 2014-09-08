import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;



public class Count {

		
	void testcountwords() throws IOException
	{
		File file = new File("test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		StringBuilder line= new StringBuilder();
		 HashMap<String, Integer> map = new HashMap<String, Integer>();
	
		 //this part of function can be used to count the number of characters
		 /*	int c=  br.read();
		while(c!=-1)
		{System.out.println(c);
		 c= br.read();
		}*/
		
		 
		String lin=br.readLine();
		while(lin!=null)
		{
			line.append(lin);
			lin=br.readLine();
	
		}
		
		ArrayList words=new ArrayList();
		//System.out.println(words.length);
		
		//String[] words=line.toString().split(" ");
		//tokenize the string 
		StringTokenizer st= new StringTokenizer(line.toString()," ,.");
	
		while(st.hasMoreTokens())
		{
			//System.out.println(st.nextToken());
			words.add(st.nextToken());
			
		}
		
		//Now count the word by putting them into the hash map.
	   for (int i=0;i<words.size();i++) 
           {  	
			   String word=(String) words.get(i);
               if (map.containsKey(word)) 
               {
                   //Hashmaps already contains a certain key, and if so, 
                   //increment the corresponding key's value by 1
                    map.put(word, map.get(word) + 1);
               } 
               else 
               {
                   map.put(word, 1);
               }
           }
		   		   
		   //Printing all the words with the frequencies
		   Iterator<String> keySetIterator = map.keySet().iterator();
		   while(keySetIterator.hasNext()){
		     String key = keySetIterator.next();
		     System.out.println( key + "=" + map.get(key));
		   }
		   
       
	}
}
	
	
	
	
