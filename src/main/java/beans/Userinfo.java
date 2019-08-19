package beans;

import org.springframework.stereotype.Component;

@Component
public class Userinfo {

	private String uphone; // 用户电话
	private String unickname; // 用户昵称
	private String utruename; // 用户真实姓名
	private String uphoto; // 用户头像
	private String usex; // 用户性别

	public Userinfo() {
		super();
	}

	public Userinfo(String uphone, String unickname, String utruename, String uphoto, String usex) {
		super();
		this.uphone = uphone;
		this.unickname = unickname;
		this.utruename = utruename;
		this.uphoto = uphoto;
		this.usex = usex;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUnickname() {
		return unickname;
	}

	public void setUnickname(String unickname) {
		this.unickname = unickname;
	}

	public String getUtruename() {
		return utruename;
	}

	public void setUtruename(String utruename) {
		this.utruename = utruename;
	}

	public String getUphoto() {
		return uphoto;
	}

	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}

	public String getUsex() {
		return usex;
	}

	public void setUsex(String usex) {
		this.usex = usex;
	}

}
