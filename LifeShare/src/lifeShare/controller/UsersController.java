package lifeShare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lifeShare.service.UsersService;

@Controller 
@RequestMapping(path = "/users" )
public class UsersController {
	@Autowired
	private UsersService usersService;

	@GetMapping("/list")
	public String getToDos(ModelMap model) {
		model.addAttribute("list",usersService.getUsers());
		return "test";
	}
}
