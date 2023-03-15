package com.example.kakeibo.Repository;

import org.springframework.web.client.RestTemplate;

public class KakeiboUserRepository {
	public String getUserData() {
		String url = "https://1l9qmgyfm5.execute-api.ap-northeast-1.amazonaws.com/deafult/kakeibo/getusers";
		RestTemplate restTemplate = new RestTemplate;
		
		
	}
}
