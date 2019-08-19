package controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.Book;
import beans.Useraddr;
import beans.Userinfo;
import beans.Userlogin;
import mapper.UserloginMapper;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UloginController {

	@Autowired
	private UserService userService;
	@Autowired
	private HttpSession session;

	@RequestMapping("/")
	public String index() {
		return "user/userLogin";
	}  

	@RequestMapping("/login")
	public String login(Userlogin userlogin) {
		if(userService.loginCheck(userlogin.getUphone(), userlogin.getUpassword())) {
			List<Book> booklist = userService.getAllbook();
			List<Useraddr> addrlist = userService.getAllUserAddr(userlogin.getUphone());
			Userinfo userinfo = userService.getUserinfo(userlogin.getUphone());
			session.setAttribute("addrlist", addrlist);
			session.setAttribute("uphone", userlogin.getUphone());
			session.setAttribute("booklist", booklist);
			return "redirect:/user/main";
		}
		else {
			return "redirect:/user/";
		}
	}

	@RequestMapping("/main")
	public String qw() {
		return "user/main";
	}

}
