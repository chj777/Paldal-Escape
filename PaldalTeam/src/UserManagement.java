import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UserManagement {
	private UserInformation currentLoginUser = null;
	
	
	private ArrayList<UserInformation> userlist = new ArrayList<UserInformation>();

	public UserInformation getCurrentLoginUser() {
		return currentLoginUser;
	}

	public void setCurrentLoginUser(UserInformation currentLoginUser) {
		this.currentLoginUser = currentLoginUser;
	}

	public void newuser_adding(UserInformation input_user) {
		calling_userlist();
		this.userlist.add(input_user);
		try {
			new File("UserDB.team5").delete();
			FileOutputStream FOS = new FileOutputStream(new File("UserDB.team5"));
			ObjectOutputStream OOS = new ObjectOutputStream(FOS);

			OOS.writeObject(userlist);

			OOS.flush();
			OOS.close();
			FOS.close();
			JOptionPane.showMessageDialog(null, "User Adding COMPELTE");
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
		
		}
	}

	public void calling_userlist() 
	{
		try 
		{
			FileInputStream FOS = new FileInputStream(new File("UserDB.team5"));
			ObjectInputStream OOS = new ObjectInputStream(FOS);

			Object userlist_object = OOS.readObject();
			this.userlist = (ArrayList<UserInformation>) userlist_object;
			
			OOS.close();
			FOS.close();
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
		
		} catch (ClassNotFoundException e) {
			
		}

	}
	
	public boolean login_user(UserInformation input_user)
	{
		boolean answer = false;
		
		calling_userlist();
		
		for(UserInformation temp : this.userlist)
		{
			if(temp.getUserID().equals(input_user.getUserID())&&temp.getUserPW().equals(input_user.getUserPW())){
				answer = true;
				this.currentLoginUser = temp;
			}
		}
		
		
		
		return answer;
	}
	
	public void update_user(UserInformation input_user, int index)
	{
		calling_userlist();
		this.userlist.set(index, input_user);
		
		try 
		{
			new File("UserDB.team5").delete();
			FileOutputStream FOS = new FileOutputStream(new File("UserDB.team5"));
			ObjectOutputStream OOS = new ObjectOutputStream(FOS);

			OOS.writeObject(userlist);

			OOS.flush();
			OOS.close();
			FOS.close();
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
		
			
		}	
	}
	
	public int get_user_index(UserInformation input_user)
	{
		int answer = 0;
		calling_userlist();
		
		for(int count = 0 ; count < this.userlist.size();count++)
		{
			if(this.userlist.get(count).getUserID().equals(input_user.getUserID())&&this.userlist.get(count).getUserPW().equals(input_user.getUserPW()))
			{
				answer = count;
			}
		}
		
		return answer;
	}

}
