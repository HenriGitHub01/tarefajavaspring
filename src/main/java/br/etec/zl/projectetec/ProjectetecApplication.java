package br.etec.zl.projectetec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectetecApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectetecApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	// @GetMapping("/estudante")

	// public String estudante(@RequestParam(value = "ra", defaultValue = "0") int ra) {

	// 	if (ra > 0) {

	// 		if (ra == 24177 || ra == 24167) {

	// 			return String.format("Olá Henrique seja bem-vindo! Catraca Liberada %d!", ra);

	// 		} else {
	// 			return String.format("Olá Gustavo seja bem-vindo! Catraca Liberada %d!", ra);
	// 		}
	// 	} else {
	// 		return String.format("Não é aluno.", ra);

	// 	}
	// }

	@GetMapping("/estudante")
public String estudante(@RequestParam(value = "ra", defaultValue = "0") int ra) {
    if (ra > 0) {
        if (ra == 24177) {
            return String.format("Olá Henrique! Catraca Liberada. RA: %d", ra);
        } else if (ra == 24133) {
            return String.format("Olá Gustavo! Catraca Liberada. RA: %d", ra);
        } else {
            return String.format("Aluno com RA %d não encontrado.", ra);
        }
    } else {
        return "RA inválido.";
    }
}
}