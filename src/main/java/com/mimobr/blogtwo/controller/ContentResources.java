package com.mimobr.blogtwo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mimobr.blogtwo.model.Content;
import com.mimobr.blogtwo.model.User;
import com.mimobr.blogtwo.repository.ContentRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")//this is for CROS local problem solved
public class ContentResources {

	@Autowired
	private ContentRepository cr;
	
	@GetMapping("/getList")//(produces="appication/json")
	public @ResponseBody Iterable<Content> listContent(){
		Iterable<Content> listContent = cr.findAll();
		return listContent;
	}
	
	@PostMapping("/postContent")
	public Content saveBackOffice(@RequestBody @Validated Content content){
		cr.save(content);
		return content;
	}
	
	@DeleteMapping("/deleteByIdContent/{Id}")
	public void deleteContent(@PathVariable("Id") Long Id){
		cr.deleteById(Id);
	}
	
	@PostMapping("/updateAPost")
	public Content updateAContent(@RequestBody @Validated Content content) {
		cr.save(content);
		return content;
	}
	
	@PostMapping("/validateLogin")
	public User validateLogin(@RequestBody @Validated User user ) {
		
		return new User();
	}

}