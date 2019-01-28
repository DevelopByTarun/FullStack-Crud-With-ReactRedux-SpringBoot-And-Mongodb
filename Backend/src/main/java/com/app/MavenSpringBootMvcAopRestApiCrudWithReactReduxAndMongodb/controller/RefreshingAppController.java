package com.app.MavenSpringBootMvcAopRestApiCrudWithReactReduxAndMongodb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RefreshingAppController {
				
	@RequestMapping({
		"/",
		"/addbk",
		"/fetchbk",
		"/editbk",
		"/updatebk"
	})
	public String showHomePageAfterRefreshingAppThroughBrowser() {
		return "forward:/index.html";
	}
}
