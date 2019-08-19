package beans;

import org.springframework.stereotype.Component;

@Component
public class Purchase {

	private int id; // 订单编号
	private String bisbn; // 图书ISBN编号
	private String uphone; // 用户电话
	private String sphone; // 商家电话
	private String uaddress; // 用户邮寄地址
	private int num; // 购买数量
	private Double charge; // 折扣
	private String status; // 订单状态
	private Double sum; // 总金额
	private String time; // 购买时间

	public Purchase() {
		super();
	}

	public Purchase(int id, String bisbn, String uphone, String sphone, String uaddress, int num, Double charge,
			String status, Double sum, String time) {
		super();
		this.id = id;
		this.bisbn = bisbn;
		this.uphone = uphone;
		this.sphone = sphone;
		this.uaddress = uaddress;
		this.num = num;
		this.charge = charge;
		this.status = status;
		this.sum = sum;
		this.time = time;
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

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	public String getUaddress() {
		return uaddress;
	}

	public void setUaddress(String uaddress) {
		this.uaddress = uaddress;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Double getCharge() {
		return charge;
	}

	public void setCharge(Double charge) {
		this.charge = charge;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
