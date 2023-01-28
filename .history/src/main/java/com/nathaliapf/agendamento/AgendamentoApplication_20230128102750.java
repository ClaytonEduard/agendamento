package com.nathaliapf.agendamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AgendamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run();
	}

}
