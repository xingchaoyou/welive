package action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	
	private String username;
	private String password;
	
	public String login(){
		System.out.println("name"+username+",password"+password);
		if(username.equals(password)){
			return SUCCESS;
		}
		else{
			return "fail";
		}
	}
	
	@Override
	public void validate() {
		super.validate();
		if (username == null || username.length() == 0) {
			addFieldError("username", "用户名不能为空");
		}
		if (password == null || password.length() == 0) {
			addFieldError("password", "密码不能为空");
		}
		if (password != null && password.length() > 6) {
			addFieldError("password", "密码长度不能超过6位数");
		}
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
