package rs.tijanap.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

	private ApplicationContext context;

	
	@RequestMapping(value = "/form**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("msg", "This is protected page!");
		model.setViewName("admin");

		return model;

	}	
	
	@RequestMapping("/submission")

	protected ModelAndView handleRequestSubmission(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		//context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		ModelAndView modelandview = new ModelAndView("index");
		modelandview.addObject("msg", "Submitted data");

		return modelandview;
	}

}