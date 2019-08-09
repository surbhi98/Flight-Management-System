package com.controller;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Flight;
import com.model.User;



import com.service.UserService;



@Controller

public class UserController {

	

	@Autowired

	UserService userService;

	

	public UserController() {

		// TODO Auto-generated constructor stub

	}

	

	@RequestMapping("/home")

	public String home()

	{	return "Home";

		

	}

	@RequestMapping("/register")

	public String register(Model model)

	{	model.addAttribute("user", new User());

		return "RegisterUser";

		

	}

	@RequestMapping("/back")

	public String back()

	{	

		return "userOptions";

		

	}
	@RequestMapping("/login")

	public String login(Model model)

	{	model.addAttribute("user", new User());
		model.addAttribute("msg", "");
		
		return "LoginUser";

		

	}

	

	

	

	

	

	@RequestMapping(value= "/addUser", method = RequestMethod.POST)

	public String addUser(@ModelAttribute("user") User u){

		System.out.println("#####user :"+u);

			this.userService.addUser(u);

		return "Home";

	}
	@RequestMapping(value= "/Admin")

	public String addUser(Model model){
		model.addAttribute("flight", new Flight());

		return "Admin";

	}
	

	@RequestMapping(value= "/loginUser", method = RequestMethod.POST)

	public String loginUser(@ModelAttribute("user") User u, Model model, HttpSession session){

		

		User userf = userService.getUserByName(u.getUserName());
		
		if(userf==null)  

		{	System.out.println("#####");
		model.addAttribute("msg", "Invalid username or password!!");
		
			return "redirect:/login";

		}
		
		else if(u.getUserName().contentEquals("Shamanth") && u.getPassword().equals(userf.getPassword()))
		{
			
			return "redirect:/adminflights";
		}
		else if(u.getPassword().equals(userf.getPassword())) 

		{

			System.out.println("#####user :"+userf.getUserName());

			model.addAttribute("uname", u.getUserName());
			int id=userf.getUserId();
			
			session.setAttribute("user", id);

			return "userOptions";

			

		}
		
		model.addAttribute("msg", "Invalid username or password!!");

		return "redirect:/login";

		

		//return "userOptions";

	}

	

	

	

	

	@RequestMapping("/remove/{id}")

    public String removeUser(@PathVariable("id")Integer userId){

		

        this.userService.deleteUser(userId);

        return "redirect:/userOptions";

    }

	

	@RequestMapping(value= "/updateUser", method = RequestMethod.POST)

	public String updateProduct(@ModelAttribute("user") User user)

	{	System.out.println("#####product :"+user);

		this.userService.updateUser(user);

		

		return "redirect:/userOptions";

	}

	

	



}