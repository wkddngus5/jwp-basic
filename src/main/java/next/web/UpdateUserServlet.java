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

@WebServlet("/user/update")
public class UpdateUserServlet extends HttpServlet {
	private static final Logger log = LoggerFactory.getLogger(UpdateUserServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Object value = session.getAttribute("user");
		if (value != null) {
		    User user = (User)value;
		    req.setAttribute("user", user);
		    RequestDispatcher rd = req.getRequestDispatcher("/user/update.jsp");
		    rd.forward(req, resp);
		}
		RequestDispatcher rd = req.getRequestDispatcher("/user/login.html");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("userId");
		String newPassword = req.getParameter("password");
		String newName = req.getParameter("name");
		String newEmail = req.getParameter("email");
		log.debug("ID: {} NAME: {} EMAIL: {} PASS: {}", id, newName, newEmail, newPassword);
		User user = DataBase.findUserById(id);

		User updatedUser = new User(id, newPassword, newName, newEmail);
		DataBase.updateUser(user, updatedUser);
	    req.setAttribute("users", DataBase.findAll());
	    RequestDispatcher rd = req.getRequestDispatcher("/user/list.jsp");
	    rd.forward(req, resp);
	}
}
