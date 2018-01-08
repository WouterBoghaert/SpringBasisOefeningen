package be.vdab.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:repositories.properties")
public class RepositoriesConfig {
	@Bean
	@Qualifier("CSV")
	PersoonRepositoryCSV persoonRepositoryCSV(@Value("${persoonCSV}")
		String bestandsnaam) {
		return new PersoonRepositoryCSV(bestandsnaam);
	}
	
	@Bean
	@Qualifier("TXT")
	PersoonRepositoryMeerdereRegels persoonRepositoryMeerdereRegels(@Value("${persoonTXT}")
		String bestandsnaam) {
		return new PersoonRepositoryMeerdereRegels(bestandsnaam);
	}
}
