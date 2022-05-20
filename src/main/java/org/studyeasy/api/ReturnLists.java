package org.studyeasy.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnLists {

	@RequestMapping("lists")
	public String list() {
		// TODO Auto-generated method stub
		return("all lists");
	}

}
