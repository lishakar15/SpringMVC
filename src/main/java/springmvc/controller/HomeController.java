package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.Student;

@Controller
//@RequestMapping("home")
public class HomeController {
	
	@RequestMapping("/index")
	public String indexPage(Model m)
	{
		System.out.println("Inside homePage");
		return "index";
	}
	
	@RequestMapping("/login")
	public String doLogin()
	{
		System.out.println("Login page loaded");
		return "Login";
	}
	//Using Model for data transfer
	@GetMapping("submit")
	public String homePage(HttpServletRequest req, Model m)
	{
		String userName = (String) req.getParameter("userName");
		String password = (String) req.getParameter("password");
		System.out.println("User Name = "+userName+ " Password = "+password);
		m.addAttribute("username", userName);
		m.addAttribute("password", password);
		return "Home";
				
	}
	//Using ModelAndView for data transfer
	@RequestMapping("/userDetails")
	public ModelAndView showUserDetails()
	{
		System.out.println("Inside userDetails");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("username","Zetsu");
		modelAndView.addObject("rank",56);
		modelAndView.addObject("country","Nepal");
		modelAndView.setViewName("UserInfo");
		
		return modelAndView;
	}
	
	@RequestMapping("/studentForm")
	public String showStudentForm()
	{
		return "StudentForm";
	}
	//Getting Student object using modelAttribute
	@PostMapping("/saveStudent")
	public String saveStudentDetails(@ModelAttribute("student") Student student)
	{
		System.out.println(student.toString());
		return "Home";
	}
	

}
