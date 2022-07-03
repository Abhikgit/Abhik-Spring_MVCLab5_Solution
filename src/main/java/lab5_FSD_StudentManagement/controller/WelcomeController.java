package lab5_FSD_StudentManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class WelcomeController {
	 @RequestMapping ("/")
	public String handelWelcome() {
		return "Welcome";
	}

}
