

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Professor{
	
	
	private ArrayList<Character> answer=new ArrayList<Character>();

	public ArrayList<Character> getAnswer() {
		return answer;
	}

	public void setAnswer(ArrayList<Character> answer) {
		this.answer = answer;
	}

	public void store_ans(String fileName){
		
		fileName="a.txt";
		try{
		FileInputStream f=new FileInputStream(fileName);
		int i=f.read();
		int n;
		for(n=0;i!=-1;n++){
			answer.add((char)i);
			i=f.read();		
			
		}
		
		}
		catch(FileNotFoundException er){
			System.out.println("file ERROR");
			}
		catch(IOException e){
			System.out.println("ERROR");
			}
	
		
	}
	
	
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
	
	public static void main(String[] args) {
		new Professor().store_ans("");
	}
	
}
