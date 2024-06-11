package me.sairu.sdw;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import me.sairu.sdw.application.AskChampionUseCase;
import me.sairu.sdw.application.ListChampionsUseCase;
import me.sairu.sdw.domain.ports.ChampionsRepository;
import me.sairu.sdw.domain.ports.GenerativeAiService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ListChampionsUseCase provideListChampionsUseCase(ChampionsRepository repository) {
		return new ListChampionsUseCase(repository);
	}

	@Bean
	public AskChampionUseCase provideAskChampionUseCase(ChampionsRepository repository,
														GenerativeAiService genAiService) {
		return new AskChampionUseCase(repository, genAiService);
	}
	@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
	@Configuration
	public class OpenAPIConfig {
		@Bean
		public OpenAPI customOpenAPI() {
			return new OpenAPI()
					.info(new Info().title("App name")
							.termsOfService("http://swagger.io/terms/")
							.license(new License().name("Apache 2.0").url("http://springdoc.org")));
		}
	}
}