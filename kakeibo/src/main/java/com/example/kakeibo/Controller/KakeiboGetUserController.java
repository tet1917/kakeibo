package com.example.kakeibo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.kakeibo.Service.KakeiboGetUserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Controller
public class KakeiboGetUserController {
	private final KakeiboGetUserService kakeiboGetUserService;

	public KakeiboGetUserController(KakeiboGetUserService kakeiboGetUserService) {
		this.kakeiboGetUserService = kakeiboGetUserService;
	}

	@PostMapping("/KakeiboGetUser")
	public String kakeibopostuser(@RequestParam("selecteduser") int p1, Model model)
			throws JsonMappingException, JsonProcessingException {
		model.addAttribute("selected", kakeiboGetUserService.getUsers(p1).getuserList().get(0).getUserNm());
		model.addAttribute("data" , kakeiboGetUserService.getDataUsers(p1).getkakeiboList());
		return "KakeiboGetUser.html";
	}

	//	@PostMapping("/KakeiboGetUser")
	//	public String kakeibouse(Model model) {
	//		model.addAttribute("");
	//		return "";
	//	}

	//	@PostMapping("/KakeiboGetUser")
	//	public String kakeiboUsers(@RequestParam("userId") int userId, Model model) throws JsonMappingException, JsonProcessingException {
	//		model.addAttribute("name", kakeiboGetUserService.getUsers(userId).getuserList());
	//		return "KakeiboGetUser.html";
	//	}													
	//	@GetMapping("/KakeiboGetUser")
	//	public String kakeiboUsers(@RequestParam(value = "selecteduser") String[] selecteduser, Model model) throws JsonMappingException, JsonProcessingException {
	//		model.addAttribute("name",kakeiboGetUserService.getUsers().getuserList());
	//		return "KakeiboGetUser.html";
	//	}

}