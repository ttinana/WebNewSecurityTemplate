package rs.tijanap.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import rs.tijanap.model.FinInstrument;
import rs.tijanap.model.WhiskyDTO;
import rs.tijanap.services.FinInstrumentService;

@Controller
public class MainController {

	private ApplicationContext context;
	private FinInstrumentService finInstrumentService;
	

	@RequestMapping(value="/*",  method=RequestMethod.GET)
	protected ModelAndView handleRequestWelcome(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		// context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		ModelAndView modelandview = new ModelAndView("index");
		modelandview.addObject("msg", "Dobrodošli");

		return modelandview;
	}
	@RequestMapping("/hello")
	public String helloWorld(Model model) {
		model.addAttribute("msg", "Hello World!");
		return "hello";
	}
	
	@RequestMapping("/fi/{fiID}")
	public String findFI(@PathVariable ("fiID") String fiID, Model model) {
	    
		FinInstrument fi = finInstrumentService.findFi(fiID);
	    model.addAttribute("fi", fi);
	    return "displayFI";
	}

	@RequestMapping(value = "/admin/**", method = RequestMethod.GET)
	public ModelAndView adminPage() {

		ModelAndView model = new ModelAndView("admin");
		model.addObject("title", "Spring Security Hello World");
		model.addObject("msg", "This is protected page!");
		model.setViewName("admin");

		return model;

	}
	@RequestMapping("/admin**submittet")
	protected ModelAndView handleRequestSubmited(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		// context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		ModelAndView modelandview = new ModelAndView("index");
		modelandview.addObject("msg", "submitted!!");

		return modelandview;
	}

	@RequestMapping(value = "buySuccessfulWhisky", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView view(@RequestBody List<String> newArray) {

		System.out.println(newArray);
		System.out.println();
		for (String properties : newArray) {
			String[] split = properties.split("_");
			String name = split[0];
			Integer quantity = Integer.valueOf(split[1]);
			System.out.println("name:= " + name);
			System.out.println("quantity:= " + quantity);

			// whiskyService.changeInfoInDB(name, quantity);
		}
		WhiskyService whiskyService = new WhiskyService();
		List<WhiskyDTO> whiskyDTOs = whiskyService.seeAllWhisky();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("viewAvailableWhisky", whiskyDTOs);
		modelAndView.setViewName("whisky");
		return modelAndView;
	}

}
