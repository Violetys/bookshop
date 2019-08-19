package controller.user;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.Purchase;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UOrderCenterController {

	@Autowired
	private UserService userService;
	@Autowired
	private HttpSession session;
	
	@RequestMapping("/order")
	public String index() {
		String uphone = (String) session.getAttribute("uphone");
		List<Purchase> purchaselist = userService.getAllPurchase(uphone);
		session.setAttribute("purchaselist", purchaselist);
		return "user/orderCenter";
	}
	
	@RequestMapping("/order/{id}")
	public String id(@PathVariable String id) {
		int id1 = Integer.parseInt(id);
		Purchase purchase = userService.getPurchaseById(id1);
		session.setAttribute("purchaseinfo", purchase);
		return "user/orderInfo";
	}
}
