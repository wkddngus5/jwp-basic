package next.controller.qna;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import core.mvc.AbstractController;
import core.mvc.ModelAndView;
import next.dao.QuestionDao;
import next.model.Question;
import next.model.User;

public class UpdateQuestionController extends AbstractController{
    private static final Logger log = LoggerFactory.getLogger(UpdateQuestionController.class);
    private QuestionDao questionDao = new QuestionDao();
    
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		log.debug("SESSION: {}, WRITER: {}", request.getSession().getAttribute("user"), request.getParameter("writer"));
		User sessionedUser = (User) request.getSession().getAttribute("user");
		Question question = questionDao.findById(Long.parseLong(request.getParameter("questionId")));

		if (request.getSession().getAttribute("user") == null ||  sessionedUser.getName()!= question.getWriter()) {
			return jspView("redirect:/users/loginForm");
		}
		question.setTitle(request.getParameter("title"));
		question.setContents(request.getParameter("contents"));
		
		questionDao.updateQuestion(question);
		
		return jspView("redirect:/");
	}

}
