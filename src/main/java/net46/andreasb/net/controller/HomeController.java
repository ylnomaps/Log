package net46.andreasb.net.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net46.andreasb.net.model.User;
import net46.andreasb.net.service.UserService;

@Controller
public class HomeController {
	
//	/* core services */
 private UserService userService;
//	
	
	
	/* request mappings */
	@RequestMapping("/")
	public String showIndexPage(Map<String, Object> model) throws Exception {
		System.out.println("here requested");
		return "index";
	}
	  @RequestMapping(value = "hi", method = RequestMethod.POST)
	  public String CRUDWebAppMavenized(@ModelAttribute String message, @RequestParam("name") String name, Model model) {
	    String message2 = "Hi " + name + "!";
	    model.addAttribute("message", message2);
	    return "hi";
	  }
	  @RequestMapping(value = "back") 
	  public String CRUD(@ModelAttribute String message, @RequestParam("name") String name) {
			
		
				return "login";
	
	  }
	  @RequestMapping(value ="login.do", method = RequestMethod.POST)
	  public String logins(@ModelAttribute User user, @RequestParam("id") String id,@RequestParam("password") String password, Model model) {
	    
	    model.addAttribute(id, password);
	    return "login.do";
	  }
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam String identifier, @RequestParam String password) {
		if(identifier != null && password != null) {
			
			boolean valid = userService.login(identifier, password);
			
			if( valid ) {
				return "home";
			}
			else {
				return "error";
			}
		}
		else {
			return "error";	
		}
	}
}

/*
 */
// * package net46.andreasb.net.controller;
//
//import java.text.DateFormat;
//import java.util.Date;
//import java.util.Locale;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
//@Controller
//public class HomeController_deprecated {
//	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController_deprecated.class);
//	
//	/**
//	 * Simply selects the home view to render by returning its name.
//	 */
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "home";
//	}
//	
//}

 
