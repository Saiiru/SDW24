package me.sairu.sdw;

import me.sairu.sdw.application.AskChampionUseCase;
import me.sairu.sdw.application.ListChampionsUseCase;
import me.sairu.sdw.domain.ports.ChampionsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ListChampionsUseCase provideListCampionsUseCase(ChampionsRepository repository) {
		return new ListChampionsUseCase(repository);
	}

	@Bean
	public AskChampionUseCase provideAskCampionsUseCase(ChampionsRepository repository) {
		return new AskChampionUseCase(repository);
	}
}
