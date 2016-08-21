package rs.tijanap.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import rs.tijanap.model.User;

@Controller
@RequestMapping("/admin")
public class AdminController {

	private ApplicationContext context;

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security");
		model.addObject("msg", "This is protected page!");
		model.setViewName("admin");

		return model;

	}

	@RequestMapping(value = "/submission", method = RequestMethod.POST)

	protected ModelAndView handleRequestSubmission(@Valid @ModelAttribute("user") User user, BindingResult result)
			throws Exception {
		ModelAndView modelandview;
		if (result.hasErrors()) {
			modelandview = new ModelAndView("admin");
		} else {
			modelandview = new ModelAndView("displayFI");
			modelandview.addObject("msg", "Submitted data");
		}
		return modelandview;

	}

}