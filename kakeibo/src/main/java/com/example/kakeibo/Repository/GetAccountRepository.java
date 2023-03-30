package com.example.kakeibo.Repository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.kakeibo.data.KakeiboAccountEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class GetAccountRepository {
	public KakeiboAccountEntity getUsersData(int userId,int id) throws JsonMappingException, JsonProcessingException {
		RestTemplate temp = new RestTemplate();
		String url = "https://1l9qmgyfm5.execute-api.ap-northeast-1.amazonaws.com/deafult/kakeibo/getacount?p1="
				+ userId +"&p2="+id;

		ResponseEntity<String> res = temp.getForEntity(url, String.class);
		String json = res.getBody();
		ObjectMapper mapper = new ObjectMapper();
		KakeiboAccountEntity get = new KakeiboAccountEntity();
		get = mapper.readValue(json, KakeiboAccountEntity.class);
		return get;
	}
}
