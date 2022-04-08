package com.example.CleanArchitecturePoc.application.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RestController;

import com.example.CleanArchitecturePoc.application.request.DemoRequest;
import com.example.CleanArchitecturePoc.application.response.DemoResponse;


@RestController
public class DemoController {
	
	@GetMapping("/")
	public String Index() {
		return "Hello Demo";
	}
	
	@PostMapping("/")
	public ResponseEntity<DemoResponse> tryPost (@RequestBody DemoRequest req){
		var res = new DemoResponse();
		res.setCode("AAA");
		res.setMsg("Hello " + res.getCode());
		return ResponseEntity.ok(res);
	}
}
