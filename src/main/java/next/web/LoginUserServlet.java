package next.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import core.db.DataBase;
import next.model.User;

@WebServlet("/user/login")
public class LoginUserServlet extends HttpServlet{
	private static final Logger log = LoggerFactory.getLogger(LoginUserServlet.class);
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/user/login.html");
		rd.forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String inputId = req.getParameter("userId");
		String inputPassword = req.getParameter("password");
		HttpSession session = req.getSession();
		
		User user = DataBase.findUserById(inputId);
		if(user==null) {
			session.setAttribute("user", null);
			RequestDispatcher rd = req.getRequestDispatcher("/user/login_failed.jsp");
			rd.forward(req, resp);
		}
		if(!user.isSamePassword(inputPassword)) {
			session.setAttribute("user", null);
			RequestDispatcher rd = req.getRequestDispatcher("/user/login_failed.jsp");
			rd.forward(req, resp);
		}
		session.setAttribute("user", user);
		resp.sendRedirect("/");
	}
}
