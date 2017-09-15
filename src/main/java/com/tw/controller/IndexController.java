package com.tw.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("indexController")
public class IndexController {
	@Value("${tw.static}")
	private String staticUrl;
	
	@RequestMapping("index.do")
	public String toIndexPage(Model model) {
		model.addAttribute("staticUrl", staticUrl);
		return "index";
	}

}
