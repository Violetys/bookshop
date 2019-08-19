package beans;

import org.springframework.stereotype.Component;

@Component
public class Saddb {

	private String sphone; // 商家电话
	private String bisbn; // 图书isbn信息
	private int num; // 数量
	private int sellnum; // 销量

	public Saddb() {
		super();
	}

	public Saddb(String sphone, String bisbn, int num, int sellnum) {
		super();
		this.sphone = sphone;
		this.bisbn = bisbn;
		this.num = num;
		this.sellnum = sellnum;
	}

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	public String getBisbn() {
		return bisbn;
	}

	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getSellnum() {
		return sellnum;
	}

	public void setSellnum(int sellnum) {
		this.sellnum = sellnum;
	}

}
