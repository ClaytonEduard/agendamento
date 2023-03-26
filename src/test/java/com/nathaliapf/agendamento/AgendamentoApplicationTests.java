package com.nathaliapf.agendamento;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nathaliapf.model.User;
import com.nathaliapf.repository.UserRepository;


@SpringBootTest
class AgendamentoApplicationTests {
	@Autowired
	private UserRepository repository;

	@Test
	void contextLoads() {

		User user = new User();
		user.setNome("clayton");
		user.setUsuario("Admin");
		user.setSenha("123");

		repository.save(user);


		System.out.println("User Criando com sucesso");


		

	}

}
