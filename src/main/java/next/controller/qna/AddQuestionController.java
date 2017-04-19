package next.controller.qna;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import core.mvc.AbstractController;
import core.mvc.ModelAndView;
import next.dao.QuestionDao;
import next.model.Question;

public class AddQuestionController extends AbstractController{
    private static final Logger log = LoggerFactory.getLogger(AddQuestionController.class);

	private QuestionDao questionDao = new QuestionDao();
	
	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		log.debug(request.getParameterMap().toString());
		Question newQuestion = new Question(request.getParameter("writer"), request.getParameter("title"), request.getParameter("contents"));
		questionDao.insert(newQuestion);
		log.debug("SAVED QUESTION: {}", newQuestion);
		return jspView("/home.jsp").addObject("questions", questionDao.findAll());
	}

}
