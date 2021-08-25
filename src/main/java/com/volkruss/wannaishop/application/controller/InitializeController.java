package com.volkruss.wannaishop.application.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/getItem")
public class InitializeController {
	
	@GetMapping("/")
	public String getIndex() {
		return "御坂美琴より、湾内さんのほうが100倍可愛い件について";
	}
}
