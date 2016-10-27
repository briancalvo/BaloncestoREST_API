package com.briancalvo;

import com.briancalvo.service.PlayerService;
import com.briancalvo.service.TeamService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BaloncestoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(BaloncestoApplication.class, args);
		PlayerService playerService=context.getBean(PlayerService.class);

		playerService.testPlayers();

	}
}
