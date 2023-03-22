package com.example.kakeibo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.kakeibo.Service.KakeiboGetUserService;

@Controller
public class KakeiboGetUserController {
	private final KakeiboGetUserService kakeiboGetUserService;

	public KakeiboGetUserController(KakeiboGetUserService kakeiboGetUserService) {
		this.kakeiboGetUserService = kakeiboGetUserService;
	}

	@GetMapping("/KakeiboGetUser")
	public String kakiboGet() {
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
