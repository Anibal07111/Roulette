package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.roulette.model.Roulette;
import com.roulette.repository.RepositoryMain;
import com.roulette.service.ServiceBet;
import com.roulette.service.ServiceRoulette;


@SpringBootTest
class RouletteApplicationTests {
	@Autowired
	private ServiceBet serviceBet;	
	@MockBean
	RepositoryMain repositoryMain;
	@Autowired
	private ServiceRoulette serviceRoulette;
	@Test
	public void createRouletteTest() {
		Roulette roulette = new Roulette();
		roulette.setIdRoulette(1L);
		when(repositoryMain.save(any())).thenReturn(roulette);
		assertThat(serviceRoulette.createRoulette()).isNotNull();
	}

}
