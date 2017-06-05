import java.io.*;
import java.util.ArrayList;

public class Student extends People{

	
	/*private String[] name=new String[100];
	private String[] PW=new String[100];*/
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
				//s[i]=line;
				s.add(line);
				String[] result= s.get(i).split(",");
				//name[i]=result[0];
				name.add(i, result[0]);
				//PW[i]=result[1];
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

	/*public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public String[] getPW() {
		return PW;
	}

	public void setPW(String[] pW) {
		PW = pW;
	}*/
	@Override
	public String give(String fileName) {
		
		return null;
	}
	
	
	
}
