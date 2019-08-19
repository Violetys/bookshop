package controller.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.Userinfo;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UserinfoController {

	@Autowired
	private HttpSession session;
	@Autowired
	private UserService userService;
	
	@RequestMapping("/info")
	public String index() {
		String uphone = (String) session.getAttribute("uphone");
		Userinfo userinfo = userService.getUserinfo(uphone);
		session.setAttribute("userinfo", userinfo);
		return "user/Userinfo";
	}
}
