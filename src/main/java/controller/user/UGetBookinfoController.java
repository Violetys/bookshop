package controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.Book;
import beans.Bookinfo;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UGetBookinfoController {

	@Autowired
	private UserService userService;
	@Autowired
	private HttpSession session;
	
	@RequestMapping("/getinfo/{id}")
	public String index1(@PathVariable String id) {
		String isbn = id;
		System.out.println(id);
		Book book = userService.getBookByISBN(isbn);
		session.setAttribute("bookinfo", book);
		return "user/bookinfo";
	}
	
}
