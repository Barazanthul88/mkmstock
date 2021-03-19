package de.mkmstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
@EnableJpaRepositories("de.mkmstock.jpa.repo")
@ComponentScan
public class MkmstockApplication {

	public static void main(String[] args) {
		SpringApplication.run(MkmstockApplication.class, args);
		//Main.launch(args);
	}

}
