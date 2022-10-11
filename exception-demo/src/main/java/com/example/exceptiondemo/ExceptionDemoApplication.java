package com.example.exceptiondemo;
import com.example.exceptiondemo.entity.Application;
import com.example.exceptiondemo.repository.ApplicationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class ExceptionDemoApplication {
	private static final Logger log = LoggerFactory.getLogger(ExceptionDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ExceptionDemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(ApplicationRepository repository) {
		return (args) -> {
			repository.save(new Application("Trackzilla","Abraham.hanson","Application for tracking bugs."));
			repository.save(new Application("Expenses","Ekene.Hanson","Application to track expense reports."));
			repository.save(new Application("Notifications","Belejit.Rejoice","Application to send alerts and notifications to users."));

			for (Application application : repository.findAll()) {
				log.info("The application is: " + application.toString());
			}
		};
	}
}
