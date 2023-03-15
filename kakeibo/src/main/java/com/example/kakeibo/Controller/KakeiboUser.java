package com.example.kakeibo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.kakeibo.Service.KakeiboUserService;

@Controller
public class KakeiboUser {
	private final KakeiboUserService kakeiboUserService;

	public KakeiboUser(KakeiboUserService kakeiboUserService) {
		this.kakeiboUserService = kakeiboUserService;
	}

	@GetMapping("/kakeibouser")
	public String readKakeiboUser(Model model) {

		//		kakeiboUserService

		return "kakeibo_user.html";
	}
}
