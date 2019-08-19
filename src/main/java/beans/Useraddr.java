package beans;

import org.springframework.stereotype.Component;

@Component
public class Useraddr {

	private int id; // 地址编号
	private String uphone; // 用户电话
	private String uaddress; // 用户地址

	public Useraddr() {
		super();
	}

	public Useraddr(int id, String uphone, String uaddress) {
		super();
		this.id = id;
		this.uphone = uphone;
		this.uaddress = uaddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

}
