package com.example.kakeibo.Service;

import org.springframework.stereotype.Service;

import com.example.kakeibo.Repository.GetUserRepository;
import com.example.kakeibo.Repository.KakeiboGetUserRepository;
import com.example.kakeibo.data.KakeiboUserDataEntity;
import com.example.kakeibo.data.KakeiboUserEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
public class KakeiboGetUserService {
	private final KakeiboGetUserRepository kakeiboGetUserRepository;
	private final GetUserRepository getUserRepository;

	public KakeiboGetUserService(KakeiboGetUserRepository kakeiboGetUserRepository,
			GetUserRepository getUserRepository) {
		this.kakeiboGetUserRepository = kakeiboGetUserRepository;
		this.getUserRepository = getUserRepository;
	}

	public KakeiboUserDataEntity getDataUsers(int userId) throws JsonMappingException, JsonProcessingException {
		KakeiboUserDataEntity kakeiboUserDataEntity = new KakeiboUserDataEntity();
		kakeiboUserDataEntity = kakeiboGetUserRepository.getUsersData(userId);
		return kakeiboUserDataEntity;
	}

	public KakeiboUserEntity getUsers(int userId) throws JsonMappingException, JsonProcessingException {
		KakeiboUserEntity kakeiboUserEntity = new KakeiboUserEntity();
		kakeiboUserEntity = getUserRepository.getUsers(userId);
		return kakeiboUserEntity;
	}
}