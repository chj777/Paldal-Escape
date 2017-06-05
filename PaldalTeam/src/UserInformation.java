import java.io.Serializable;

public class UserInformation implements Serializable
{
	private String UserID;
	private String UserPW;
	
	private int stage = 0;
	
	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	public UserInformation(String UserID_input, String UserPW_input)
	{
		this.UserID = UserID_input;
		this.UserPW = UserPW_input;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getUserPW() {
		return UserPW;
	}

	public void setUserPW(String userPW) {
		UserPW = userPW;
	}
}
