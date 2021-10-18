package com.roulette.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.roulette.repository.RepositoryMain;

@Service
public class ServiceBet {
	@Autowired
	private RepositoryMain repositoryMain;
	@Autowired
	ObjectMapper objectMapper;
	@Autowired
	HttpServletRequest servletRequest;
}
