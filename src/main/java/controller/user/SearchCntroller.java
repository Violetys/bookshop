package controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import beans.Book;
import service.UserService;

@Controller
@RequestMapping("/user")
public class SearchCntroller {

	@Autowired
	private HttpSession session;
	@Autowired
	private UserService userService;
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping("/search")
	public String index(String search) {
		System.out.println("search"+search);
		List<Book> booklistsearch = userService.getBookSearch(search);
		session.setAttribute("booklistsearch", booklistsearch);
		return "user/bookSearch";
	}
	
}
