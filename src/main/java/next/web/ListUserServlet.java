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

@WebServlet("/user/list")
public class ListUserServlet extends HttpServlet {
	private static final Logger log = LoggerFactory.getLogger(ListUserServlet.class);
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	HttpSession session = req.getSession();
    	Object value = session.getAttribute("user");
    	log.debug("USER: {}", value);
    	if (value != null) {
    	    User user = (User)value;
    	    req.setAttribute("users", DataBase.findAll());
    	    RequestDispatcher rd = req.getRequestDispatcher("/user/list.jsp");
    	    rd.forward(req, resp);
    	}
    	RequestDispatcher rd = req.getRequestDispatcher("/user/login.html");
		rd.forward(req, resp);

    }
}
