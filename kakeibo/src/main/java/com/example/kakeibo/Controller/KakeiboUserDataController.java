package com.example.kakeibo.Controller;

import org.springframework.stereotype.Controller;

import com.example.kakeibo.Service.KakeiboUserDataService;

@Controller
public class KakeiboUserDataController {
	private final KakeiboUserDataService kakeiboUserDataService;

	public KakeiboUserDataController(KakeiboUserDataService kakeiboUserDataService) {
		this.kakeiboUserDataService = kakeiboUserDataService;
	}

//	@PostMapping("/kakeibo_user_data")
//	public String kakeibopostuser(@RequestParam("selecteduser") int p1, Model model)
//			throws JsonMappingException, JsonProcessingException {
////		model.addAttribute("selecteduser", kakeiboUserDataService.getUsers(p1).getuserList().get(0).getUserNm());
//		model.addAttribute("data", kakeiboUserDataService.getDataUsers(p1).getkakeiboList());
//		return "kakeibo_user_data.html";
//	}

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
