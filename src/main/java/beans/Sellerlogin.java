package beans;

import org.springframework.stereotype.Component;

@Component
public class Sellerlogin {

	private String sphone; // 商家电话
	private String spassword; // 商家登陆密码

	public Sellerlogin() {
		super();
	}

	public Sellerlogin(String sphone, String spassword) {
		super();
		this.sphone = sphone;
		this.spassword = spassword;
	}

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	public String getSpassword() {
		return spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

}
