import java.io.*;

public class Register {
	
	login lg;

	public Register(login lg_input){
		
	this.lg=lg_input;
		
	
	try{
	
		BufferedWriter writer=new BufferedWriter(new FileWriter("MyRegister.txt",true));
		
		writer.append(this.lg.gett1Text()+",");
		writer.append(this.lg.gett2Text()+"\n");
		
		writer.close();
		
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}

	
}
