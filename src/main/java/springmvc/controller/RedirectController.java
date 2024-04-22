package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	//Redirecting using Redirect Prefix
	@RequestMapping("/goToHome")
	public String redirectPrefixToHome()
	{
		System.out.println("Go to Home Page");
		return "redirect:/HomePage";	
	}
	//Redirecting using RedirectView class
	@RequestMapping("/redirectToHome")
	public RedirectView redirectViewToHome()
	{
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("HomePage");
		return redirectView;
	}
	//Redirecting using conventional HttpServletResponse
	@RequestMapping("servletRedirectToHome")
	public void redirecttoHomeUsingServletResponse(HttpServletResponse response)
	{
		try {
			response.sendRedirect("HomePage");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@RequestMapping("/HomePage")
	public String openHomePage()
	{
		System.out.println("Redirecting to Home Page");
		return "Home";
	}
	
}
