package py.edu.uca.lp3.amarilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "py.edu.uca.lp3.amarilla.rest.controlador", "py.uca.edu.lp3.amarilla.repositorio", "py.edu.uca.lp3.amarilla.servicio","py.edu.uca.lp3.amarilla.implementacion" })
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
