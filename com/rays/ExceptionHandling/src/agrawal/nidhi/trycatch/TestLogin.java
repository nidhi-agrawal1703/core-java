package agrawal.nidhi.trycatch;

public class TestLogin {
	public static void main(String[] args) throws LoginException {
		String login="admin";
		String password="admin";
		
		if(login=="admin123" && password=="admin") {
			System.out.println("User login successful");
		}else {
			throw new LoginException("User not found");
		}
	}
}
