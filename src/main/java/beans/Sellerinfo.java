package beans;

import org.springframework.stereotype.Component;

@Component
public class Sellerinfo {

	private String sphone; // 商家电话
	private String snickname; // 商家昵称
	private String struename; // 商家真实姓名
	private String ssex; // 商家姓名
	private String saddress; // 商家地址
	private String sphoto; // 商家头像

	public Sellerinfo() {
		super();
	}

	public Sellerinfo(String sphone, String snickname, String struename, String ssex, String saddress, String sphoto) {
		super();
		this.sphone = sphone;
		this.snickname = snickname;
		this.struename = struename;
		this.ssex = ssex;
		this.saddress = saddress;
		this.sphoto = sphoto;
	}

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	public String getSnickname() {
		return snickname;
	}

	public void setSnickname(String snickname) {
		this.snickname = snickname;
	}

	public String getStruename() {
		return struename;
	}

	public void setStruename(String struename) {
		this.struename = struename;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public String getSphoto() {
		return sphoto;
	}

	public void setSphoto(String sphoto) {
		this.sphoto = sphoto;
	}

}
