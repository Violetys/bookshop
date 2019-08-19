package beans;

import org.springframework.stereotype.Component;

@Component
public class Bookphoto {

	private int id; // 图片编号
	private String bisbn; // 图书ISBN编号
	private String bphoto; // 图书图片

	public Bookphoto() {
		super();
	}

	public Bookphoto(int id, String bisbn, String bphoto) {
		super();
		this.id = id;
		this.bisbn = bisbn;
		this.bphoto = bphoto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBisbn() {
		return bisbn;
	}

	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}

	public String getBphoto() {
		return bphoto;
	}

	public void setBphoto(String bphoto) {
		this.bphoto = bphoto;
	}

}
