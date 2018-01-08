package be.vdab.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import be.vdab.repositories.PersoonRepository;

@Configuration
public class ServicesConfig {
	@Bean
	PersoonService persoonServiceImpl(@Qualifier("CSV") PersoonRepository persoonRepository) {
		return new PersoonServiceImpl(persoonRepository);
	}

}
