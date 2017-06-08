import java.io.BufferedWriter;
import java.io.FileWriter;

public class Character {
	
	login lg;
	Floor fl;

	public Character(login lg_input,Floor fl){
		
	this.lg=lg_input;
	this.fl=fl;
	
	try{
	
		BufferedWriter writer=new BufferedWriter(new FileWriter("MyCharacter.txt",true));
		
		//writer.append(this.lg.gett1Text()+",");
		//writer.append(this.fl.point+"\n");
		
		writer.close();
		
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
	
	
}
