package hello;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
    @Bean
    public Server h2WebServer() throws SQLException {
        return Server.createWebServer("-webPort", "8082").start();
    }
    
    
    @Bean
    CommandLineRunner init(PersonRepository personRepository) {
        return argc -> {
//            personRepository.save(new Institute("aa", "aa"));
//            personRepository.save(new Institute("bb", "bb"));
//            personRepository.save(new Institute("cc", "cc"));
        };
    }
    
	
}
