package mustache.mustache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EntityScan(basePackages = {
//		"mustache.mustache.model"
//
//})
//@EnableJpaRepositories(basePackages = {
//		"mustache.mustache.service"
//})
public class MustacheTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MustacheTesteApplication.class, args);
	}

}
