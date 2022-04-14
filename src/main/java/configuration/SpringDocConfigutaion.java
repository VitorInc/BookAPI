package configuration;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfigutaion {
	
	// http://localhost:8082/swagger-ui/index.html
	@Bean
	public GroupedOpenApi swagger() {
		return GroupedOpenApi.builder()
				.group("br.gov.sp.prodesp.saa")
				.packagesToScan("com.example.demo.controller")
				.build();
	}


}
