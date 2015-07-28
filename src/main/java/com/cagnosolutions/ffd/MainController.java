package com.cagnosolutions.ffd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Scott Cagno.
 * Copyright Cagno Solutions. All rights reserved.
 */

@Controller
public class MainController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
		return "about";
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public String contact() {
		return "contact";
	}
}
