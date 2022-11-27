package com.zohocrm_2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm_2.util.EmailUtil;

@Controller
public class EmailController {
	
	@Autowired
	private EmailUtil emailUtil;
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("email") String email, ModelMap modelMap) {
		modelMap.addAttribute("email", email);
		return "composeEmail";
	}
	
	@RequestMapping("/send")
	public String sendEmail(@RequestParam("toEmail") String to,@RequestParam("subject") String sub, @RequestParam("emailBody") String emailBody, ModelMap modelMap) {
		emailUtil.sendEmail(to,sub,emailBody);
		modelMap.addAttribute("msg1", "Email Sent!!");
		return "composeEmail";
	}

}
