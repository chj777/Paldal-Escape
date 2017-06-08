import java.io.*;
import java.util.ArrayList;

public class Student extends People{

	

	private ArrayList<String> name=new ArrayList<String>();
	private ArrayList<String> PW=new ArrayList<String>();
	public Student(){
		ArrayList<String> s=new ArrayList<String>();
		
		try{int i=0;
			File file=new File("MyRegister.txt");
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String line;
			
			while((line=br.readLine())!=null){
			
				s.add(line);
				String[] result= s.get(i).split(",");
				
				name.add(i, result[0]);
				
				PW.add(i, result[1]);
				i++;
				
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}
	
	public ArrayList<String> getName() {
		return name;
	}

	
	public void setName(ArrayList<String> name) {
		this.name = name;
	}

	public ArrayList<String> getPW() {
		return PW;
	}

	public void setPW(ArrayList<String> pW) {
		PW = pW;
	}

	@Override
	public String give(String fileName) {
		
		return null;
	}
	
	
	
}
