package beans;

import org.springframework.stereotype.Component;

@Component
public class Bookinfo {

	private String bisbn; // 图书ISBN编号
	private String bname; // 图书名称
	private String bpublisher; // 图书出版社
	private Double bprice; // 图书价格
	private String bintro; // 图书简介
	private String bauthor; // 图书作者

	public Bookinfo() {
		super();
	}

	public Bookinfo(String bisbn, String bname, String bpublisher, Double bprice, String bintro, String bauthor) {
		super();
		this.bisbn = bisbn;
		this.bname = bname;
		this.bpublisher = bpublisher;
		this.bprice = bprice;
		this.bintro = bintro;
		this.bauthor = bauthor;
	}

	public String getBisbn() {
		return bisbn;
	}

	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBpublisher() {
		return bpublisher;
	}

	public void setBpublisher(String bpublisher) {
		this.bpublisher = bpublisher;
	}

	public Double getBprice() {
		return bprice;
	}

	public void setBprice(Double bprice) {
		this.bprice = bprice;
	}

	public String getBintro() {
		return bintro;
	}

	public void setBintro(String bintro) {
		this.bintro = bintro;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

}
