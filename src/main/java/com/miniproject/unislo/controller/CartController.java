package com.miniproject.unislo.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class CartController {

    @GetMapping(value = "/")
	public String getDpList() {
		return "/";
	}

}
