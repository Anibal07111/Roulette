package com.roulette.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roulette.dto.BetDTO;
import com.roulette.dto.OutputDTO;
import com.roulette.dto.RouletteDTO;
import com.roulette.service.ServiceBet;
import com.roulette.service.ServiceRoulette;
import com.roulette.util.Constants;


@RestController
public class ControllerRoulette {
	@Autowired
	private ServiceRoulette serviceRoulette;
	@Autowired
	private ServiceBet serviceBet;		
	@GetMapping(Constants.CREATE_ROULETTE)
	public Long createRoulette() {
		
		return serviceRoulette.createRoulette();
	}	
	@PutMapping(Constants.OPEN_ROULETTE)
	public OutputDTO openRoulette(@PathVariable("id") Long id) {
		System.out.println("a");
		return serviceRoulette.openRoulette(id);
	}
	@PostMapping(Constants.PLACE_BET)
	public OutputDTO placeBet(@RequestBody BetDTO betDTO) {
		
		return serviceBet.placeBet(betDTO);
	}
	@PutMapping(Constants.CLOSE_ROULETTE)
	public OutputDTO closeRoulette(@PathVariable("id") Long id) {
		
		return serviceRoulette.closeRoulette(id);
	}
	@GetMapping(Constants.LIST_ROULETTES)
	public List<RouletteDTO> listRoulettes() {
		
		return serviceRoulette.listRoulettes();
	}
}
