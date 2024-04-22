package springmvc.controller;

import java.text.NumberFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import springmvc.model.Contact;
import springmvc.model.Student;

@Controller
//@RequestMapping("home")
public class HomeController {
	
	@RequestMapping("/index")
	public String indexPage(Model m)
	{
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
	//Using RequestParam annotation
	@GetMapping("submitPage")
	public String homePage2(@RequestParam("userName")String userName, @RequestParam("password") String password, Model m)
	{
		System.out.println("User Name = "+userName+ " Password = "+password);
		m.addAttribute("username", userName);
		m.addAttribute("password", password);
		return "Home";
				
	}
	//Using ModelAndView for data transfer
	@RequestMapping("/userDetails")
	public ModelAndView showUserDetails()
	{
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
	public String saveStudentDetails(@ModelAttribute("student") Student student,BindingResult bindingResult)
	{
		if(bindingResult.hasErrors())
		{
			return "Error"; //Common Error page
		}
		System.out.println(student.toString());
		return "Home";
	}
	
	@RequestMapping("/contactInfo")
	public String openContactPage()
	{
		return "ContactForm";
	}
	
	@RequestMapping("/submitContact")
	public String handleContactSubmit(@ModelAttribute("contact") Contact contact)
	{
		System.out.println(contact.toString());
		return null;
	}
	
	@RequestMapping("/getStudentDetails/{userId}/{password}")
	public String getStudentDetails(@PathVariable Integer userId, @PathVariable String password)
	{
		System.out.println("id = "+userId+" password = "+password);
		return "UserInfo";
	}
	//Method to throw Null Pointer Exception
	@RequestMapping("/getStudentById/{id}")
	public String getStudentById(@PathVariable Integer id)
	{
		System.out.println("id = "+id);
		Student s = null;
		System.out.println(s.toString());//Throws null pointer exception
		return "Home";
	}
	//Handle NullPointerException
	@ExceptionHandler(value = NullPointerException.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)//returning 500 Http Status
	public String handleNullException()
	{
		return "Error";
	}
	//Handle NumberFormatException
	@ExceptionHandler(value = NumberFormatException.class)
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)//returning 404 Http Status
	public String handleNumberFormatException()
	{
		return "Error";
	}
	//To handle all the sub class exception of Exception.class
	@ExceptionHandler(Exception.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)//returning 500 Http Status
	public String handleAllException()
	{
		return "Error";
	}

}
