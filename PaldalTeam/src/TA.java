

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TA extends People{
	
	private String name;
	
	
	@Override
	public String give(String fileName){
		String s="";
			try{
			FileInputStream f=new FileInputStream(fileName);
			int i=f.read();
			while(i!=-1){
				 i=f.read();
			
				s=s+(char)i+"";
				 
				}System.out.println(s);
				return s;
				
			}
			catch(FileNotFoundException er){
				System.out.println("file ERROR");return "";
				}
			catch(IOException e){
				System.out.println("ERROR");return "";
				}
			
	}

	
	
	
	
}
