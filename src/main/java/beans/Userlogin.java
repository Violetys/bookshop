package beans;

import org.springframework.stereotype.Component;

@Component
public class Userlogin {

	private String uphone; // 用户电话
	private String upassword; // 用户登录密码

	public Userlogin() {
		super();
	}

	public Userlogin(String uphone, String upassword) {
		super();
		this.uphone = uphone;
		this.upassword = upassword;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

}
