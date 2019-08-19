package controller.user;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.Book;
import beans.Purchase;
import beans.Sellerinfo;
import beans.Userinfo;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UBuyBook {

	@Autowired
	private UserService userService;
	@Autowired 
	private HttpSession session;
	@Autowired
	private HttpServletRequest request1;
	@Autowired //不添加会报NullPointerException
	private HttpServletRequest request;
	
	@RequestMapping("/buy/{id}")
	public String index(@PathVariable String id) {
		Book book = userService.getBookByISBN(id);
		session.setAttribute("buybook", book);
		return "user/buy";
	}
	
	@RequestMapping("/buybook")
	public String buybook(String num,String addid) {
		Book book = (Book) session.getAttribute("buybook");
		String uphone = (String) session.getAttribute("uphone");
		String bisbn = book.getBisbn();
		Sellerinfo sellerinfo = userService.getBookSellerinfo(bisbn);
		String sphone = sellerinfo.getSphone();
		String status = "已付款";
		String time = "2019年4月";
		int sum = Integer.parseInt(num);
		int id = Integer.parseInt(addid);
		String uaddress = userService.getUserAddById(id);
		System.out.println("addr"+uaddress);
		Purchase purchase = new Purchase();
		purchase.setBisbn(bisbn);
		purchase.setCharge(1.0);
		purchase.setId(0);
		purchase.setNum(sum);
		purchase.setSphone(sphone);
		purchase.setStatus(status);
		purchase.setSum(sum*book.getBprice());
		purchase.setUaddress(uaddress);
		purchase.setUphone(uphone);
		purchase.setTime(time);
		if(userService.addPurchase(purchase))
			return "redirect:/user/main";
		else
			return "redirect:/user/buy/"+bisbn;
	}
	
}
