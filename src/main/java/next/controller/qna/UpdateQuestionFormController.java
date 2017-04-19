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

public class UpdateQuestionFormController extends AbstractController {
	private static final Logger log = LoggerFactory.getLogger(UpdateQuestionFormController.class);
	private QuestionDao questionDao = new QuestionDao();

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Long questionId = Long.parseLong(request.getParameter("questionId"));
		Question question = questionDao.findById(questionId);
		
		User sessionedUser = (User) request.getSession().getAttribute("user");
		if (request.getSession().getAttribute("user") == null ||  sessionedUser.getName()!= question.getWriter()) {
			return jspView("redirect:/users/loginForm");
		}

		ModelAndView mav = jspView("/qna/updateForm.jsp");
		mav.addObject("question", question);
		return mav;
	}
}
