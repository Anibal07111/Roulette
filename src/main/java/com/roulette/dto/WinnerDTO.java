package com.roulette.dto;

public class WinnerDTO {
	private double acquiredMoney;
	private String idUser;
	public WinnerDTO() {
		super();
	}
	public WinnerDTO(String idUser, double acquiredMoney) {
		this.idUser = idUser;
		this.acquiredMoney = acquiredMoney;
	}
	public double getAcquiredMoney() {

		return acquiredMoney;
	}
	public void setAcquiredMoney(double acquiredMoney) {
		this.acquiredMoney = acquiredMoney;
	}
	public String getIdUser() {

		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	
}
