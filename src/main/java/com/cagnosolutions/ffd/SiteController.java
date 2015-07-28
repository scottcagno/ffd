package com.cagnosolutions.ffd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Scott Cagno.
 * Copyright Cagno Solutions. All rights reserved.
 */

@Controller
@RequestMapping(value = "/site")
public class SiteController {

	// TODO: Not really used unless you need to see a page from the original template

	@RequestMapping(value = "/about-us", method = RequestMethod.GET)
	public String aboutUs() {
		return "site/about-us";
	}

	@RequestMapping(value = "/basic-contact", method = RequestMethod.GET)
	public String basicContact() {
		return "site/basic-contact";
	}

	@RequestMapping(value = "/big-map-contact", method = RequestMethod.GET)
	public String bigMapContact() {
		return "site/big-map-contact";
	}

	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public String blog() {
		return "site/blog";
	}

	@RequestMapping(value = "/blogsingle", method = RequestMethod.GET)
	public String blogsingle() {
		return "site/blogsingle";
	}

	@RequestMapping(value = "/boxes", method = RequestMethod.GET)
	public String boxes() {
		return "site/boxes";
	}

	@RequestMapping(value = "/buttons", method = RequestMethod.GET)
	public String buttons() {
		return "site/buttons";
	}

	@RequestMapping(value = "/columns", method = RequestMethod.GET)
	public String columns() {
		return "site/columns";
	}

	@RequestMapping(value = "/icons", method = RequestMethod.GET)
	public String icons() {
		return "site/icons";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "site/index";
	}

	@RequestMapping(value = "/interface", method = RequestMethod.GET)
	public String iface() {
		return "site/interface";
	}

	@RequestMapping(value = "/knowledge-base", method = RequestMethod.GET)
	public String knowledgeBase() {
		return "site/knowledge-base";
	}

	@RequestMapping(value = "/lists", method = RequestMethod.GET)
	public String lists() {
		return "site/lists";
	}

	@RequestMapping(value = "/no-map-contact", method = RequestMethod.GET)
	public String noMapContact() {
		return "site/no-map-contact";
	}

	@RequestMapping(value = "/portfolio", method = RequestMethod.GET)
	public String portfolio() {
		return "site/portfolio";
	}

	@RequestMapping(value = "/portfoliosingle", method = RequestMethod.GET)
	public String portfoliosingle() {
		return "site/portfoliosingle";
	}

	@RequestMapping(value = "/pricing", method = RequestMethod.GET)
	public String pricing() {
		return "site/pricing";
	}

	@RequestMapping(value = "/services", method = RequestMethod.GET)
	public String services() {
		return "site/services";
	}

	@RequestMapping(value = "/sliders", method = RequestMethod.GET)
	public String sliders() {
		return "site/sliders";
	}

	@RequestMapping(value = "/testimonials", method = RequestMethod.GET)
	public String testimonials() {
		return "site/testimonials";
	}
}
