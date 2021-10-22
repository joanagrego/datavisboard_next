package next.datavisboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DatavisboardApplication implements WebMvcConfigurer {

	public void addViewController(ViewControllerRegistry registry){
		registry.addViewController("/datavis").setViewName("datavis");
	}

	public static void main(String[] args){

		SpringApplication.run(DatavisboardApplication.class, args);
	}

}
