package com.roulette.model;

import java.util.HashMap;


import org.springframework.data.annotation.Id;


public class Roulette {
	@Id
	private Long idRoulette;
	private HashMap<Integer, Bet> betList;
	private String status;	
	public Roulette(String status) {
		this.status = status;
	}
	public Roulette() {
		betList = new HashMap<>();
	}
	public Long getIdRoulette() {
		return idRoulette;
	}
	public void setIdRoulette(Long idRoulette) {
		this.idRoulette = idRoulette;
	}
	public HashMap<Integer, Bet> getBetList() {
		return betList;
	}
	public void setBetList(HashMap<Integer, Bet> betList) {
		this.betList = betList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void addBetToList(Bet bet) {
		int key = betList.size();
		betList.put(key, bet);
	}
	
}
