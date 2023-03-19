package com.example.kakeibo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.kakeibo.Service.KakeiboGetUserService;

@Controller
public class KakeiboGetUserController {
	private final KakeiboGetUserService kakeiboGetUserService;
	public KakeiboGetUserController(KakeiboGetUserService kakeiboGetUserService) {
		this.kakeiboGetUserService = kakeiboGetUserService;
	}
	
	@RequestMapping("KakeiboGetUser")
		@GetMapping("selecteduser={userId}")
		public String kakeiboGetUser() {
		return "KakeiboGetUser.html";
		
	}

	
}
