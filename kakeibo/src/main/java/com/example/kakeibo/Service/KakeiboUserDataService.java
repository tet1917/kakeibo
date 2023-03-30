package com.example.kakeibo.Service;

import org.springframework.stereotype.Service;

import com.example.kakeibo.Repository.GetAccountRepository;
import com.example.kakeibo.data.KakeiboAccountEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
public class KakeiboUserDataService {
	private final GetAccountRepository getAccountRepository;

	public KakeiboUserDataService(GetAccountRepository getAccountRepository) {
		this.getAccountRepository = getAccountRepository;
	}

	public KakeiboAccountEntity getUsers(int userId, int id) throws JsonMappingException, JsonProcessingException {
		KakeiboAccountEntity kakeiboAccountEntity = new KakeiboAccountEntity();
		kakeiboAccountEntity = getAccountRepository.getUsersData(userId, id);
		return kakeiboAccountEntity;
	}
}
