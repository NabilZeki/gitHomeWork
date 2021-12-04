package OopProject;

/* 	Create Registration Class in which you would have variables as email, userName and password that have
an access scope only within its own class. After creating an object of the class user should be able to
call methods and in each method separately pass values to set users email, username and password.
Requirements:
a)	Valid email consider to be only yahoo
b)	Valid userName and password cannot be empty and should be of length larger than 6 characters.
Also valid password cannot contain userName.
*/

public class Registration {
	private String email;
	private String userName;
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.contains("yahoo")) {
			System.out.println("Email Accepted");
			this.email = email;
		} else {
			System.out.println("Email Not accepted - Please enter a Yahoo Email");
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (userName.isEmpty()) {
			System.out.println("Username field can not be empty");
		} else if (userName.length() > 6) {
			System.out.println("Username Accepted");
			this.userName = userName;
		} else {
			System.out.println("User name must be at least 6 characters");
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.isEmpty()) {
			System.out.println("Password field can not be empty");
		} else if (password.contains(userName)) {
			System.out.println("password can not contain user name");
		} else {
			System.out.println("Password Accepted");
			this.password = password;
		}
	}
}