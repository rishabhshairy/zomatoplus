package com.thinkxfactor.zomatoplus.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkxfactor.zomatoplus.models.Users;
import com.thinkxfactor.zomatoplus.repo.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepo;
	

	@GetMapping("/loginEx")
	public String userLoginEx(@RequestParam("name") String name,@RequestParam("pwd") String pwd) {
	Users us=new Users();
	us.setName("Rishabh");
	us.setPwd("1234");
		return "Hello from thinkxfactor you are now logged in";
	}
	
	 @GetMapping("/all")
	  public List<Users> userList() {
		return userRepo.findAll();
		
		 
	 }
	 
	 @PostMapping("/create")
	 public Users userCreate(@RequestBody Users user) {
	
		
		//Users u1=new Users( "Rishabh", "1234","abc@gmail.com", "987654123",5);
		 
		 userRepo.saveAndFlush(user);
		// System.out.println(user.toString());
		 
		 return user;
		 
	 }
	 
	 @PostMapping("/login")
	 public Users userLogin(@RequestBody Users user) {
		       
		return userRepo.findByNameAndPwd("abc","abc");
		 
	 }
	

}
